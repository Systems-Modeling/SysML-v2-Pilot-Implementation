"""
SysML 2 Pilot Implementation
Copyright (c) 2019-2025 DEKonsult

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of theGNU Lesser General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

@license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>

Contributors:
 Hans Peter de Koning, DEKonsult

Purpose:
 Generator to create the SysML 2 standard libraries for the ISO/IEC 80000 Quantities and units

Input file (in folder data/iso-iec-80000)
 - Excel workbook holding ISO/IEC 80000 definitions in tabular form (iso_iec_80000_quantities_and_units.xlsx)

Output files (in folder libs_generated):
 - standard library package ISQBase.sysml
 - standard library package ISQSpaceTime.sysml reflecting ISO 80000-3
 - standard library package ISQMechanics.sysml reflecting ISO 80000-4
 - standard library package ISQThermodynamics.sysml  reflecting ISO 80000-5
 - standard library package ISQElectromagnetism.sysml reflecting IEC 80000-6
 - standard library package ISQLight.sysml reflecting ISO 80000-7
 - standard library package ISQAcoustics.sysml reflecting ISO 80000-8
 - standard library package ISQAtomicNuclear.sysml reflecting ISO 80000-9
 - standard library package ISQChemistryMolecular.sysml reflecting ISO 80000-10
 - standard library package ISQCharacteristicNumbers.sysml reflecting ISO 80000-11
 - standard library package ISQCondensedMatter.sysml reflecting ISO 80000-12
 - standard library package ISQInformation.sysml reflecting IEC 80000-13
 - standard library fragment SI_snippets.sysml
 - file SI_collected_units.txt
"""
from dataclasses import dataclass
from typing import Optional
from abc import ABC, abstractmethod
import sys
import os
import json
import datetime
import io
import token
import tokenize
from openpyxl import load_workbook

from data_templates import DATA
from iso_iec_80000_references import *
from utils import *

# Create logger for debug, info, warning, error, critical messages
import logging
LOGGER = logging.getLogger()
LOGGER.setLevel(logging.DEBUG)

LIST_SEP = ";"


class QuantityDimension:
    def __init__(self):
        self.power_factors: dict["BaseQuantity", int] = {}
        quantities = ISQuantity.reg_name_std.values()
        for quantity in quantities:
            if isinstance(quantity, BaseQuantity) and quantity.symbol != "1":
                self.power_factors[quantity] = 0

    def add_power_factor(self, quantity: "ISQuantity", exponent: int):
        if isinstance(quantity, BaseQuantity) and quantity.symbol != "1":
            self.power_factors[quantity] += exponent
        else:
            if quantity.quantity_dimension is None:
                LOGGER.error(f"cannot obtain quantity dimension for {quantity}")
            else:
                for base_quantity, exp in quantity.quantity_dimension.power_factors.items():
                    self.power_factors[base_quantity] += exp * exponent

    def __str__(self):
        repr_list = []
        for base_quantity, exp in self.power_factors.items():
            if base_quantity.symbol != "1" and exp != 0:
                repr_list.append(f"{base_quantity.symbol}^{exp}")
        return "*".join(repr_list) if len(repr_list) > 0 else "1"

    def canonical_unit(self):
        repr_list = []
        for base_quantity, exp in self.power_factors.items():
            if base_quantity.symbol != "1" and exp != 0:
                repr_list.append(f"{base_quantity.unit_symbol}^{exp}")
        return "*".join(repr_list) if len(repr_list) > 0 else "1"

    @staticmethod
    def derive_quantity_dimension(unit: str) -> "QuantityDimension":
        quantity_dimension = QuantityDimension()
        division_factors = unit.split("/")
        if len(division_factors) > 2:
            LOGGER.warning(f"more than one \"/\" in unit: {unit}")
        is_denominator = False
        for division_factor in division_factors:
            multiplication_factors = division_factor.split("*")
            for multiplication_factor in multiplication_factors:
                multiplication_factor = removesuffix(removeprefix(multiplication_factor, "("), ")")
                exp_factors = multiplication_factor.split("^", 1)
                unit_symbol = exp_factors[0]
                quantity = ISQuantity.reg_unit.get(unit_symbol)
                exponent = 1
                if len(exp_factors) == 2:
                    exponent_string = removesuffix(removeprefix(exp_factors[1], "("), ")")
                    exponent = int(exponent_string)
                if is_denominator:
                    exponent = -exponent
                if quantity is None:
                    LOGGER.error(f"unknown unit {unit_symbol} in {unit}")
                quantity_dimension.add_power_factor(quantity, exponent)

            is_denominator = True
            # End parse loop

        return quantity_dimension


class ISQuantity(ABC):
    """representation of quantity defined in ISO/IEC 80000"""
    reg_quantities: list["ISQuantity"] = []
    reg_name_std: dict[str, "ISQuantity"] = {}
    reg_unit: dict[str, "ISQuantity"] = {}

    @abstractmethod
    def __init__(self, name_std: str, name_sysml: str, symbol: str, unit_name: str, unit_symbol: str, specializes: str = ""):
        self.name_std: str = name_std
        self.name_sysml: str = name_sysml
        self.symbol: str = symbol
        self.unit_name: str = unit_name
        self.unit_symbol: str = removesuffix(removeprefix(unit_symbol, "'"), "'")
        self.super_quantity: Optional[ISQuantity] = None
        if specializes != "":
            self.super_quantity = self.reg_name_std.get(specializes)
            if self.super_quantity is None:
                LOGGER.warning(f"Cannot find super quantity {specializes} for specialization of quantity {name_std}")
        self.quantity_dimension: Optional[QuantityDimension] = None

        # Register this quantity
        ISQuantity.reg_quantities.append(self)
        if self.name_std not in ISQuantity.reg_name_std.keys():
            ISQuantity.reg_name_std[self.name_std] = self
        if self.unit_symbol not in ISQuantity.reg_unit.keys():
            ISQuantity.reg_unit[self.unit_symbol] = self
        else:
            LOGGER.warning(f"attempt to register unit {self.unit_symbol} for {self.name_std}, "
                  f"but already registered for {ISQuantity.reg_unit[self.unit_symbol].name_std}")

    def init_quantity_dimension(self):
        pass

    def canonical_unit(self):
        return self.quantity_dimension.canonical_unit()

    def __repr__(self):
        return f"{self.__class__.__name__}({self.__dict__})"


class BaseQuantity(ISQuantity):
    def __init__(self, name_std: str, name_sysml: str, symbol: str, unit_name: str, unit_symbol: str,
                 specializes: str = ""):
        super().__init__(name_std, name_sysml, symbol, unit_name, unit_symbol, specializes)

    def init_quantity_dimension(self):
        if self.quantity_dimension is None:
            self.quantity_dimension = QuantityDimension()
            self.quantity_dimension.add_power_factor(self, 1)


class SpecialQuantity(ISQuantity):
    def __init__(self, name_std: str, name_sysml: str, symbol: str, unit_name: str, unit_symbol: str, definition_unit: str, specializes: str = ""):
        super().__init__(name_std, name_sysml, symbol, unit_name, unit_symbol, specializes)
        self.definition_unit = definition_unit

    def init_quantity_dimension(self):
        if self.quantity_dimension is None:
            self.quantity_dimension = QuantityDimension.derive_quantity_dimension(self.definition_unit)


class RecognizedQuantity(ISQuantity):
    def __init__(self, name_std: str, name_sysml: str, symbol: str, unit_name: str, unit_symbol: str, definition_value: str, definition_unit: str, specializes: str = ""):
        super().__init__(name_std, name_sysml, symbol, unit_name, unit_symbol, specializes)
        self.definition_value = definition_value
        self.definition_unit = definition_unit

    def init_quantity_dimension(self):
        if self.quantity_dimension is None:
            self.quantity_dimension = QuantityDimension.derive_quantity_dimension(self.definition_unit)


@dataclass
class GeneratedQuantity:
    reference_source: ReferenceSource
    item_id: str
    std_name: str
    sysml_name: str
    symbol: str
    unit_symbol: str
    application_domain: str

    def __repr__(self):
        return f"GeneratedQuantity(" \
               f"item={self.item_id}, std_name={self.std_name}, sysml_name={self.sysml_name}, symbol={self.symbol}, domain={self.application_domain})"


@dataclass
class SiUnit:
    std_name: str
    sysml_name: str
    generalization: str


@dataclass
class IsoIecQuantityDefinition:
    sort_key: int
    part: int
    level1: int
    level2: int
    item: str
    item_id: str
    name: str
    alias: tuple[str]
    symbol: tuple[str]
    application_domain: str
    definition: str
    unit: tuple[str]
    remarks: str
    tensor_order: int
    generalization: str
    magnitude: str
    is_base: bool
    is_bound: bool

    def __init__(self, record: dict[str, any]):
        self.sort_key = record["sort_key"]
        self.part = record["part"]
        self.level1 = record["level1"]
        self.level2 = record["level2"]
        self.item = str(record["item"])
        self.item_id = record["item_id"]
        self.name = record["name"]
        alias_value = record["alias"]
        self.alias = tuple([x.strip() for x in alias_value.split(";")]) if alias_value else tuple()
        symbol_value = record["symbol"]
        self.symbol = tuple([x.strip() for x in symbol_value.split(";")]) if symbol_value else tuple()
        self.application_domain = record["application_domain"]
        self.definition = record["definition"]
        # Store the unit field to a string, so that integer value 1 is stored as string "1"
        unit_value = str(record["unit"])
        self.unit = tuple([x.strip() for x in unit_value.split(";")]) if unit_value else tuple()
        self.remarks = record["remarks"]
        self.tensor_order = record["tensor_order"]
        self.generalization = record["generalization"]
        self.magnitude = record["magnitude"]
        self.is_base = bool(record["is_base"])
        self.is_bound = bool(record["is_bound"])


class Generator:
    def __init__(self):
        self.unit_to_quantity_dimension_map = {}
        self.iso_iec_quantity_definitions: list[IsoIecQuantityDefinition] = []
        self.unit_symbols_set: set[str] = set()
        self.units_dict: dict[str, SiUnit] = {}
        self.generated_quantities_dict: dict[str, GeneratedQuantity] = {}
        self.generated_coordinate_frames: set[str] = set()
        self.output_dir_name: str = "libs_generated"

        # Create output directory if it does not yet exist
        if not os.path.exists(self.output_dir_name):
            os.mkdir(self.output_dir_name)

        # Define the ISQ base quantities and their corresponding SI base units
        BaseQuantity("length", "Length", "L", "metre", "m")
        BaseQuantity("mass", "Mass", "M", "kilogram", "kg")
        BaseQuantity("duration", "Duration", "T", "second", "s")
        BaseQuantity("electric current", "ElectricCurrent", "I", "ampere", "A")
        BaseQuantity("thermodynamic temperature", "ThermodynamicTemperature", "Θ", "kelvin", "K")
        BaseQuantity("amount of substance", "AmountOfSubstance", "N", "mole", "mol")
        BaseQuantity("luminous intensity", "LuminousIntensity", "J", "candela", "cd")
        BaseQuantity("quantity of dimension one", "DimensionOne", "1", "one", "1")

        # Define ISQ quantities with corresponding SI units with special names and symbols
        SpecialQuantity("angular measure", "AngularMeasure", "α", "radian", "rad", "m/m")
        SpecialQuantity("solid angular measure", "SolidAngle", "Ω", "steradian", "sr", "m^2/m^2")
        SpecialQuantity("frequency", "Frequency", "f", "hertz", "Hz", "s^-1")
        SpecialQuantity("force", "Force", "F", "newton", "N", "kg*m/s^2")
        SpecialQuantity("pressure", "Pressure", "p", "pascal", "Pa", "N/m^2")
        SpecialQuantity("stress", "Stress", "σ", "pascal", "Pa", "N/m^2")
        SpecialQuantity("energy", "Energy", "E", "joule", "J", "N*m")
        SpecialQuantity("power", "Power", "P", "watt", "W", "J/s")
        SpecialQuantity("electric charge", "ElectricCharge", "Q", "coulomb", "C", "A*s")
        SpecialQuantity("electric potential difference", "ElectricPotentialDifference", "V_(ab)", "volt", "V", "W/A")
        SpecialQuantity("capacitance", "Capacitance", "C", "farad", "F", "C/V")
        SpecialQuantity("electric resistance", "ElectricResistance", "R", "ohm", "Ω", "V/A")
        SpecialQuantity("electric conductance", "ElectricConductance", "G", "siemens", "S", "Ω^-1")
        SpecialQuantity("magnetic flux", "MagneticFlux", "Φ", "weber", "Wb", "V*s")
        SpecialQuantity("magnetic flux density", "MagneticFluxDensity", "vec(B)", "tesla", "T", "Wb/m^2")
        SpecialQuantity("inductance", "Inductance", "L", "henry", "H", "Wb/A")
        SpecialQuantity("luminous flux", "LuminousFlux", "Φ_v", "lumen", "lm", "cd*sr")
        SpecialQuantity("illuminance", "Illuminance", "E_v", "lux", "lx", "lm/m^2")
        SpecialQuantity("activity referred to a radionuclide", "RadioActivity", "A", "becquerel", "Bq", "s^-1")
        SpecialQuantity("absorbed dose", "AbsorbedDose", "D", "gray", "Gy", "J/kg")
        SpecialQuantity("dose equivalent", "DoseEquivalent", "H", "sievert", "Sv", "J/kg")
        SpecialQuantity("catalytic activity", "CatalyticActivity", "k", "katal", "kat", "mol/s")

        # Define additional ISQ quantities with corresponding SI units with special names and symbols
        SpecialQuantity("logarithmic frequency range", "logarithmicFrequencyRange", "G", "octave", "oct", "1")
        SpecialQuantity("logarithmic frequency range", "logarithmicFrequencyRange", "G", "decade", "dec", "1")
        SpecialQuantity("level", "Level", "L", "decibel", "dB", "1")
        SpecialQuantity("traffic intensity", "TrafficIntensity", "A", "erlang", "E", "1")
        SpecialQuantity("storage capacity", "StorageCapacity", "M", "bit", "bit", "1")
        SpecialQuantity("modulation rate", "ModulationRate", "r_m", "baud", "Bd", "s^-1")
        SpecialQuantity("information content", "InformationContent", "I(x)", "shannon", "Sh", "1")
        SpecialQuantity("information content", "InformationContent", "I(x)", "hartley", "Hart", "1")
        SpecialQuantity("information content", "InformationContent", "I(x)", "natural unit of information", "nat", "1")

        # Define ISQ quantities with corresponding recognized SI units
        RecognizedQuantity("angular measure", "AngularMeasure", "α", "degree", "°", "pi/180", "rad")
        RecognizedQuantity("thermodynamic temperature", "ThermodynamicTemperature", "Θ", "degree Celsius", "°C", "1.0", "K")
        RecognizedQuantity("volume", "Volume", "V", "litre", "L", "1.0e-3", "m^3")
        RecognizedQuantity("duration", "Duration", "t", "minute", "min", "60.0", "s")
        RecognizedQuantity("duration", "Duration", "t", "hour", "h", "60.0", "min")
        RecognizedQuantity("duration", "Duration", "t", "day", "d", "24.0", "h")
        RecognizedQuantity("reactive power", "ReactivePower", "Q", "volt ampere reactive", "var", "1.0", "V*A")
        RecognizedQuantity("energy", "Energy", "E", "electronvolt", "eV", "1.602176487e-19", "J")
        RecognizedQuantity("rest mass", "RestMass", "m(X)", "dalton", "Da", "1.66053906660e-27", "kg", specializes="mass")
        RecognizedQuantity("rest mass", "RestMass", "m(X)", "atomic mass unit", "u", "1.0", "Da", specializes="mass")
        RecognizedQuantity("area", "Area", "a", "square metre", "m²", "1.0", "m^2")
        RecognizedQuantity("cross section", "CrossSection", "σ", "barn", "b", "1.0e-28", "m²", specializes="area")
        RecognizedQuantity("length", "Length", "l", "ångström", "Å", "1.0e-10", "m")
        RecognizedQuantity("length", "Length", "l", "astronomical unit", "ua", "149597870700", "m")
        RecognizedQuantity("storage capacity", "StorageCapacity", "M", "byte", "B", "8", "bit")
        RecognizedQuantity("storage capacity", "StorageCapacity", "M", "octet", "o", "8", "bit")
        # RecognizedQuantity("length", "Length", "l", "nanometre", "nm", "1.0e-9", "m")
        # RecognizedQuantity("length", "Length", "l", "kilometre", "km", "1.0e3", "m")
        # RecognizedQuantity("mass", "Mass", "m", "gram", "g", "1.0e-3", "kg")

        for q in ISQuantity.reg_quantities:
            q.init_quantity_dimension()

        LOGGER.info("Quantities Registry")
        for q in ISQuantity.reg_quantities:
            LOGGER.info(f"{q.__class__.__name__:20s} name={q.name_std:40s} unit={q.unit_symbol:6s} "
                  f"dim={str(q.quantity_dimension):20s} "
                  f"canonical_unit={q.quantity_dimension.canonical_unit()}")
        # Write registered quantities and units in CSV format
        csv_file_path = os.path.join(self.output_dir_name, "registered_quantities.csv")
        with open(csv_file_path, "w") as csv_file:
            csv_file.write(f'"type","unit_name","unit_symbol","definition_value","canonical_unit","quantity_name","quantity_symbol","general_quantity"\n')
            for q in ISQuantity.reg_quantities:
                q_general = q.super_quantity.name_std if q.super_quantity else ""
                if isinstance(q, BaseQuantity):
                    definition_value = "1"
                    canonical_unit = q.unit_name
                elif isinstance(q, SpecialQuantity):
                    definition_value = "1"
                    canonical_unit = q.definition_unit
                elif isinstance(q, RecognizedQuantity):
                    definition_value = q.definition_value
                    canonical_unit = q.definition_unit

                csv_file.write(f'"{q.__class__.__name__}","{q.unit_name}","{q.unit_symbol}","{definition_value}","{canonical_unit}","{q.name_std}","{q.symbol}","{q_general}"\n')

    def generate_quantities_and_measurement_references(self, working_dir: str, quantities_file_name: str, part_numbers: list[int]):
        time_stamp = f"{datetime.datetime.utcnow().replace(microsecond=0).isoformat()}Z"

        # Read the ISO/IEC 80000 quantity definitions from the Excel input file
        quantities_file_path = os.path.join(working_dir, quantities_file_name)
        workbook = load_workbook(filename=quantities_file_path, read_only=True, data_only=True)
        quantities_sheet = workbook['Quantities']

        self.iso_iec_quantity_definitions = []
        is_first_row = True
        for row in quantities_sheet.rows:
            if is_first_row:
                header = list(cell.value for cell in row)
                is_first_row = False
            else:
                values = []
                for cell in row:
                    value = cell.value
                    if value is None:
                        value = ""
                    elif isinstance(value, bool):
                        value = bool(value)
                    values.append(value)
                record = dict(zip(header, values))
                quantity_def = IsoIecQuantityDefinition(record)
                self.iso_iec_quantity_definitions.append(quantity_def)

        # Generate the start of ISQBase library package
        base_file_path = os.path.join(self.output_dir_name, f"ISQBase.sysml")
        base_file = open(base_file_path, "w")

        base_file.write(DATA.BASE_PACKAGE_START.format(
            SOURCE_REF="ISO/IEC 80000",
            TIME_STAMP=time_stamp,
        ))

        # Generate content for each ISQ part library package,
        # as well as content for any base quantity in ISQBase when encountered
        for part_number in part_numbers:
            self.generate_sysml_quantities_library_package(part_number, time_stamp, base_file)

        # Generate the end of the ISQBase library package
        base_file.write(DATA.BASE_PACKAGE_END)
        base_file.close()

        # Generate the SysML snippets for measurement units encountered in the ISQ part_numbers
        LOGGER.info(f"Processing measurement units used in ISQ part_numbers")
        self.create_used_measurement_units_list()

    def generate_sysml_quantities_library_package(self, part_number: int, time_stamp: str, base_file: any):

        ref_source = ISO_IEC_80000_PARTS.get(part_number)
        package_name = f"{ISO_IEC_80000_SHORT_NAME}{ref_source.short_name}"

        LOGGER.info(f"Processing part={part_number:2d} package={package_name}.sysml id={ref_source.id} title={ref_source.title}")

        output_file_path = os.path.join(self.output_dir_name, f"{package_name}.sysml")
        output_file = open(output_file_path, "w")

        output_file.write(DATA.PACKAGE_START.format(
            PACKAGE_NAME=package_name,
            SOURCE_REF=f'{ref_source.id}:{ref_source.publication_year} "{ref_source.title}"',
            SOURCE_URI=ref_source.uri,
            TIME_STAMP=time_stamp,
        ))

        extra_imports = DATA.extra_imports.get(ref_source.short_name, None)
        if extra_imports:
            output_file.write(c(1, "/* Quantity definitions referenced from other ISQ packages */"))
            output_file.write(extra_imports)
            output_file.write("\n")

        for quantity_def in self.iso_iec_quantity_definitions:
            duplicated_quantity = None

            # Skip any quantity that is not defined in the part currently being processed
            if quantity_def.part != part_number:
                continue

            item_id = quantity_def.item_id

            std_quantity_name = quantity_def.name
            if std_quantity_name == "":
                LOGGER.warning(f"Skipping record without quantity name: {json.dumps(quantity_def)}")
                continue

            definition = quantity_def.definition
            if "\n" in definition:
                LOGGER.warning(f"Definition field of {item_id} ({std_quantity_name}) contains newline")

            remarks = quantity_def.remarks
            if "\n" in remarks:
                LOGGER.warning(f"Remarks field of {item_id} ({std_quantity_name}) contains newline")

            tensor_order = quantity_def.tensor_order
            if tensor_order < 0:
                LOGGER.error(f"tensor_order must be non-negative: "
                      f"{item_id} {std_quantity_name} has tensor_order {tensor_order}")

            std_general_q_name = quantity_def.generalization
            magnitude = quantity_def.magnitude
            if magnitude != "" and tensor_order == 0:
                LOGGER.warning(f"magnitude should only be specified for tensor_order > 0: "
                      f"{item_id} {std_quantity_name} has magnitude {magnitude}")

            is_base = quantity_def.is_base
            if is_base is None:
                LOGGER.warning(f"is_base undefined for item {item_id} {std_quantity_name}")

            is_bound = quantity_def.is_bound
            if is_bound is None:
                LOGGER.warning(f"is_bound undefined for item {item_id} {std_quantity_name}")

            symbols_list = quantity_def.symbol
            # Create string representation with AsciiMath symbols enclosed in backticks
            symbols_string = f"`{'`, `'.join(symbols_list)}`"

            application_domain = quantity_def.application_domain
            if not application_domain:
                application_domain = "generic"

            alias_list = quantity_def.alias

            std_quantity_names_list = [std_quantity_name]
            std_quantity_names_list.extend(alias_list)
            std_quantity_names = ", ".join(std_quantity_names_list)

            quantity_name = convert_phrase_to_pascal_case(std_quantity_name)

            # Process the measurement units as defined for each ISO/IEC 80000 record
            measurement_unit_symbols = quantity_def.unit
            if len(measurement_unit_symbols) == 0:
                LOGGER.warning(f"No unit defined for {item_id} {std_quantity_name}. "
                      f"Unit set to 1 (unit of dimension one).")
                measurement_unit_symbols = ["1"]

            # Collect all unique measurement units
            for unit_symbol in measurement_unit_symbols:
                self.unit_symbols_set.add(unit_symbol)
                # Link first occurrence of the unit to its ISQ record
                if unit_symbol not in self.units_dict.keys():
                    self.units_dict[unit_symbol] = SiUnit(std_quantity_name, quantity_name, std_general_q_name)

            measurement_units_string = ", ".join(measurement_unit_symbols)

            # Derive the quantity dimension from the last measurement unit,
            # which by convention in the ISO/IEC 80000 standards is always given in terms of base units
            unit_expressed_in_base_units = measurement_unit_symbols[-1]
            quantity_dimension = QuantityDimension.derive_quantity_dimension(unit_expressed_in_base_units)
            quantity_dimension_string = str(quantity_dimension)
            if quantity_dimension_string != "1" and quantity_dimension == unit_expressed_in_base_units:
                LOGGER.warning(f"Cannot derive quantity dimension for quantity {item_id} {std_quantity_name}, "
                      f"because last measurement unit {unit_expressed_in_base_units} "
                      f"appears to not be expressed in base units.")
            default_unit = measurement_unit_symbols[0]

            # Check for unique quantity name
            if quantity_name in self.generated_quantities_dict.keys():
                current_quantity = GeneratedQuantity(
                    ref_source, item_id, std_quantity_name, quantity_name, symbols_string, measurement_units_string, application_domain)
                duplicated_quantity = self.generated_quantities_dict[quantity_name]
                LOGGER.warning(f"{current_quantity} has non-unique name, already defined in {duplicated_quantity}")
            else:
                self.generated_quantities_dict[quantity_name] = GeneratedQuantity(
                    ref_source, item_id, std_quantity_name, quantity_name, symbols_string, measurement_units_string, application_domain)

            sysml_general_q_name = "DimensionOneQuantity" if std_general_q_name == "one" \
                else convert_phrase_to_pascal_case(std_general_q_name)
            sysml_magnitude_q_name = convert_phrase_to_pascal_case(magnitude)

            # Insert standard spatial coordinate frame declarations before declaration of position vector in ISO 80000-3
            if std_quantity_name == "position vector":
                output_file.write(DATA.SPATIAL_COORDINATE_FRAMES)

            # Add scalar, vector or tensor quantity definition to generated output file
            item_comment = ""
            item_comment += c(1, f"/* {ref_source.id} item {item_id} {std_quantity_names} */")
            output_file.write(item_comment)

            if tensor_order == 0:
                if sysml_general_q_name == "":
                    # Create top level simple or derived quantity snippet
                    snippet = Generator.create_simple_or_derived_quantity_snippet(
                        std_quantity_name=std_quantity_name,
                        item_source=f"item {item_id} {std_quantity_names}",
                        symbols=symbols_string,
                        application_domain=application_domain,
                        quantity_name=quantity_name,
                        quantity_dimension=quantity_dimension,
                        measurement_units=measurement_units_string,
                        tensor_order=tensor_order,
                        definition=definition,
                        remarks=remarks,
                        duplicated_quantity=duplicated_quantity)

                    if isinstance(ISQuantity.reg_name_std.get(std_quantity_name), BaseQuantity):
                        # Write base quantity to ISQ base file
                        base_file.write(item_comment)
                        base_file.write(snippet)
                        xref_to_base_file = ""
                        xref_to_base_file += c(1, f"/* See package ISQBase for the declarations of {quantity_name}Value and {quantity_name}Unit */")
                        xref_to_base_file += c(0, f"")
                        output_file.write(xref_to_base_file)
                    else:
                        # Write non-base quantity to regular ISQ part file
                        output_file.write(snippet)

                else:
                    # Create specialized quantity snippet that specializes the given more general quantity
                    output_file.write(Generator.create_specialized_quantity_snippet(
                        item_source=f"item {item_id} {std_quantity_names}",
                        symbols=symbols_string,
                        application_domain=application_domain,
                        quantity_name=quantity_name,
                        quantity_dimension=quantity_dimension,
                        measurement_units=measurement_units_string,
                        tensor_order=tensor_order,
                        definition=definition,
                        remarks=remarks,
                        general_quantity_name=sysml_general_q_name,
                        duplicated_quantity=duplicated_quantity))

                # Write alias definitions if present
                output_file.write(
                    Generator.create_scalar_alias_snippets(alias_list, quantity_name, sysml_general_q_name))

            elif tensor_order == 1:
                output_file.write(Generator.create_vector_quantity_snippet(
                    std_quantity_name=std_quantity_name,
                    item_source=f"item {item_id} {std_quantity_names}",
                    symbols=symbols_string,
                    application_domain=application_domain,
                    quantity_name=quantity_name,
                    quantity_dimension=quantity_dimension,
                    measurement_units=measurement_units_string,
                    tensor_order=tensor_order,
                    definition=definition,
                    remarks=remarks,
                    general_quantity_name=sysml_general_q_name,
                    magnitude_quantity_name=sysml_magnitude_q_name,
                    is_bound=is_bound,
                    generated_coordinate_frames=self.generated_coordinate_frames
                ))

                # Write alias definitions if present
                output_file.write(
                    Generator.create_vector_alias_snippets(alias_list, quantity_name, sysml_general_q_name))

            elif tensor_order == 2:
                output_file.write(Generator.create_tensor_quantity_snippet(
                    std_quantity_name=std_quantity_name,
                    item_source=f"item {item_id} {std_quantity_names}",
                    symbols=symbols_string,
                    application_domain=application_domain,
                    quantity_name=quantity_name,
                    quantity_dimension=quantity_dimension,
                    measurement_units=measurement_units_string,
                    tensor_order=tensor_order,
                    definition=definition,
                    remarks=remarks,
                    general_quantity_name=sysml_general_q_name,
                    is_bound=is_bound
                ))

                # Prepare for generation of alias statements
                if not quantity_name.endswith("Tensor"):
                    quantity_name = f"{quantity_name}Tensor"

                assert len(alias_list) == 0, f"WARNING: Tensor {quantity_name} alias_list is not empty: {alias_list}"
            else:
                LOGGER.warning(f"Unexpected tensor_order {tensor_order} for {item_id} {std_quantity_names}")

        # END generate loop

        output_file.write("}\n")
        output_file.close()

    @staticmethod
    def create_scalar_alias_snippets(alias_list: list[str], quantity_name: str, general_quantity_name: str) -> str:

        s = ""
        for alias in alias_list:
            alias_name = convert_phrase_to_pascal_case(alias)
            if quantity_name.endswith("Starred"):
                alias_name += "Starred"
            quantity_name_lower = convert_to_lowercase_first_letter(quantity_name)
            alias_name_lower = convert_to_lowercase_first_letter(alias_name)

            quantity_name_unit = quote_non_ascii(f"{quantity_name}Unit")
            quantity_name_value = quote_non_ascii(f"{quantity_name}Value")
            quantity_quantities_usage = quote_non_ascii(f"{quantity_name_lower}Quantities")
            quantity_name_usage = quote_non_ascii(quantity_name_lower)

            alias_name_unit = quote_non_ascii(f"{alias_name}Unit")
            alias_name_value = quote_non_ascii(f"{alias_name}Value")
            alias_quantities_usage = quote_non_ascii(f"{alias_name_lower}Quantities")
            alias_name_usage = quote_non_ascii(alias_name_lower)

            if general_quantity_name == "":
                s += c(1, f"alias {alias_name_unit} for {quantity_name_unit};")
                s += c(1, f"alias {alias_name_value} for {quantity_name_value};")
                # s += c(1, f"alias {alias_quantities_usage} for {quantity_quantities_usage};")
                s += c(1, f"alias {alias_name_usage} for {quantity_name_usage};")
            else:
                s += c(1, f"alias {alias_name_usage} for {quantity_name_usage};")
            s += c(0, f"")

        return s

    @staticmethod
    def create_vector_alias_snippets(alias_list: list[str], quantity_name: str, general_quantity_name: str) -> str:

        quantity_name = removesuffix(quantity_name, "Vector")

        s = ""
        for alias in alias_list:
            alias_name = convert_phrase_to_pascal_case(alias)
            alias_name = removesuffix(alias_name, "Vector")
            if quantity_name.endswith("Starred"):
                alias_name += "Starred"
            quantity_name_lower = convert_to_lowercase_first_letter(quantity_name)
            alias_name_lower = convert_to_lowercase_first_letter(alias_name)

            quantity_name_cs = quote_non_ascii(f"Cartesian{quantity_name}3dCoordinateFrame")
            quantity_quantities_usage = quote_non_ascii(f"{quantity_name_lower}Vectors")
            quantity_name_usage = quote_non_ascii(f"{quantity_name_lower}Vector")

            alias_name_cs = quote_non_ascii(f"Cartesian{alias_name}3dCoordinateFrame")
            alias_quantities_usage = quote_non_ascii(f"{alias_name_lower}Vectors")
            alias_name_usage = quote_non_ascii(f"{alias_name_lower}Vector")

            if general_quantity_name == "":
                s += c(1, f"alias {alias_name_cs} for {quantity_name_cs};")
                # s += c(1, f"alias {alias_quantities_usage} for {quantity_quantities_usage};")
                s += c(1, f"alias {alias_name_usage} for {quantity_name_usage};")
            else:
                s += c(1, f"alias {alias_name_usage} for {quantity_name_usage};")
            s += c(0, f"")

        return s

    def create_used_measurement_units_list(self):
        """
        Create a sorted list of all used measurement units
        """

        si_collected_units_file_path = os.path.join(self.output_dir_name, "SI_collected_units.txt")
        si_collected_units_file = open(si_collected_units_file_path, "w")

        si_snippet_file_path = os.path.join(self.output_dir_name, "SI_snippet.sysml")
        si_snippet_file = open(si_snippet_file_path, "w")

        special_unit_buffer = []
        recognized_unit_buffer = []
        derived_unit_buffer = []

        self.unit_symbols_set.add("ua")

        for unit in sorted(self.unit_symbols_set, key=str.lower):
            if unit == "1":
                continue

            registered_unit = self.units_dict.get(unit)
            generalization = registered_unit.generalization if registered_unit else ""
            std_name = registered_unit.std_name if registered_unit else "UNKNOWN_QUANTITY"
            sysml_name = registered_unit.sysml_name if registered_unit else "UNKNOWN_QUANTITY"
            if generalization:
                sysml_name = convert_phrase_to_pascal_case(generalization)
            si_collected_units_file.write(f"{unit:24s} for {std_name} / {sysml_name}\n")
            unit_quantity = ISQuantity.reg_unit.get(unit, None)
            if isinstance(unit_quantity, SpecialQuantity):
                unit_expression = unit_quantity.definition_unit
            # elif isinstance(unit_quantity, RecognizedQuantity):
            #     unit_expression = unit_quantity.definition_unit
            else:
                unit_expression = unit
            # unit_expression = unit_expression.replace("^", "**")
            if unit_expression == "1":
                unit_expression = "one"

            unit_in_unicode = convert_unit_to_unicode(unit)
            if not all([ch.isalpha() and ch.isascii() for ch in unit_in_unicode]):
                unit_in_unicode = f"'{unit_in_unicode}'"
            verbalization = verbalize_unit(unit)
            verbalization_quoted = quote_non_basic_identifier(verbalization)
            # Generate snippet for non-base units
            if isinstance(unit_quantity, BaseQuantity):
                # Skip base units because they are inserted manually
                pass
            elif unit in ("°C",):
                # Skip
                pass
            elif isinstance(unit_quantity, RecognizedQuantity):
                statement = f'    attribute <{unit_in_unicode}> {verbalization_quoted} : {sysml_name}Unit {{' \
                            f' :>> unitConversion: ConversionByConvention {{' \
                            f' :>> referenceUnit = {quote_non_ascii(unit_quantity.definition_unit)};' \
                            f' :>> conversionFactor = {unit_quantity.definition_value}; }} }}'
                if "/" in unit or "*" in unit or "^" in unit:
                    derived_unit_buffer.append(statement)
                else:
                    recognized_unit_buffer.append(statement)
            # elif isinstance(unit_quantity, SpecialQuantity):
            else:
                statement = f'    attribute <{unit_in_unicode}> {verbalization_quoted} : {sysml_name}Unit = {quote_embedded_unit_names(unit_expression)};'
                if "/" in unit or "*" in unit or "^" in unit:
                    derived_unit_buffer.append(statement)
                else:
                    special_unit_buffer.append(statement)

            # if unit not in ("m", "g", "kg", "s", "A", "K", "mol", "cd", "1", "°C", "Å", "b", "Da", "eV"):
            #     if "/" in unit or "*" in unit or "^" in unit:
            #         derived_unit_buffer.append(statement)
            #     else:
            #         simple_unit_buffer.append(statement)

        si_snippet_file.write(c(1, "/*"))
        si_snippet_file.write(c(1, " * Units with special names"))
        si_snippet_file.write(c(1, " */"))
        for statement in special_unit_buffer:
            si_snippet_file.write(f"{statement}\n")
        si_snippet_file.write("\n")

        si_snippet_file.write(c(1, "/*"))
        si_snippet_file.write(c(1, " * Units recognized in SI"))
        si_snippet_file.write(c(1, " */"))
        for statement in recognized_unit_buffer:
            si_snippet_file.write(f"{statement}\n")
        si_snippet_file.write("\n")

        si_snippet_file.write(c(1, "/*"))
        si_snippet_file.write(c(1, f" * Derived units used in ISO/IEC 80000 parts"))
        si_snippet_file.write(c(1, " */"))
        for statement in derived_unit_buffer:
            si_snippet_file.write(f"{statement}\n")

        si_collected_units_file.close()
        si_snippet_file.close()

    @staticmethod
    def create_quantity_documentation_snippet(
            item_source: str, symbols: str, application_domain: str, quantity_name: str,
            quantity_dimension: QuantityDimension, measurement_units: str, tensor_order: int, definition: str,
            remarks: str, general_quantity_name: str = "") -> str:

        specializes = f" (specializes {general_quantity_name})" if general_quantity_name else ""
        remarks = remarks if remarks else "None."
        s = ""
        s += c(2, f"doc")
        s += c(2, f"/*")
        s += c(2, f" * source: {item_source}")
        s += c(2, f" * symbol(s): {symbols}")
        s += c(2, f" * application domain: {application_domain}")
        s += c(2, f" * name: {quantity_name}{specializes}")
        s += c(2, f" * quantity dimension: {quantity_dimension}")
        s += c(2, f" * measurement unit(s): {measurement_units}")
        s += c(2, f" * tensor order: {tensor_order}")
        s += c(2, f" * definition: {definition}")
        s += c(2, f" * remarks: {remarks}")
        s += c(2, f" */")
        return s

    @staticmethod
    def create_simple_or_derived_quantity_snippet(
            std_quantity_name: str, item_source: str, symbols: str, application_domain: str, quantity_name: str,
            quantity_dimension: QuantityDimension, measurement_units: str, tensor_order: int, definition: str,
            remarks: str, duplicated_quantity: Optional[GeneratedQuantity]) -> str:

        # Construct the required quantity dimension
        qpf_snippet = ""
        qpf_names = []
        for q, exp in quantity_dimension.power_factors.items():
            if exp == 0:
                continue
            # qpf_name = f"qpf{len(qpf_names) + 1}"
            qpf_name = f"{convert_to_lowercase_first_letter(q.name_sysml)}PF"
            qpf_names.append(qpf_name)
            qpf_symbol = quote_non_ascii(q.symbol)
            qpf_redefinitions = f"{{ :>> quantity = isq.{qpf_symbol}; :>> exponent = {exp}; }}"
            qpf_snippet += c(2, f"private attribute {qpf_name}: QuantityPowerFactor[1] {qpf_redefinitions}")
        qpf_sequence = f"({', '.join(qpf_names)})" if len(qpf_names) > 1 else f"{', '.join(qpf_names)}"
        qpf_snippet += c(2,
                         f"attribute :>> quantityDimension {{ :>> quantityPowerFactors = {qpf_sequence}; }}")

        unit_super_type = "DerivedUnit" if len(qpf_names) > 0 else "DimensionOneUnit"
        if isinstance(ISQuantity.reg_name_std.get(std_quantity_name), BaseQuantity):
            unit_super_type = "SimpleUnit"

        if quantity_name.endswith("Vector"):
            quantity_name = f"{quantity_name}Magnitude"

        s = ""
        doc_snippet = Generator.create_quantity_documentation_snippet(
            item_source, symbols, application_domain, quantity_name, quantity_dimension, measurement_units,
            tensor_order, definition, remarks)

        quantity_name_value = f"{quantity_name}Value"
        quantity_name_usage = convert_to_lowercase_first_letter(quantity_name)

        if duplicated_quantity and application_domain == "generic":
            package_name = f"{ISO_IEC_80000_SHORT_NAME}{duplicated_quantity.reference_source.short_name}"
            duplicated_item = f"{duplicated_quantity.item_id} {duplicated_quantity.std_name}"
            s += c(1, f"/* Refer to declaration for {quantity_name} in {package_name} item {duplicated_item} */")
            s += c(0, f"")
        else:
            if duplicated_quantity:
                application_domain_pascal = convert_phrase_to_pascal_case(application_domain)
                quantity_name = f"{quantity_name}For{application_domain_pascal}"
                quantity_name_value = f"{quantity_name}Value"
                quantity_name_usage = convert_to_lowercase_first_letter(quantity_name)

            quantity_name_unit = f"{quantity_name}Unit"

            quantity_name_value = quote_non_ascii(quantity_name_value)
            quantity_name_usage = quote_non_ascii(quantity_name_usage)
            quantity_name_unit = quote_non_ascii(quantity_name_unit)

            s += c(1, f"attribute def {quantity_name_value} :> ScalarQuantityValue {{")
            s += doc_snippet
            s += c(2, f"attribute :>> num: Real;")
            s += c(2, f"attribute :>> mRef: {quantity_name_unit}[1];")
            s += c(1, f"}}")
            s += c(0, f"")
            # s += c(1, f"attribute {quantity_name_usage}Quantities: {quantity_name_value}[*] nonunique :> scalarQuantities;")
            # s += c(1, f"attribute {quantity_name_usage}: {quantity_name_value}[1] :> {quantity_name_usage}Quantities;")
            s += c(1, f"attribute {quantity_name_usage}: {quantity_name_value}[*] nonunique :> scalarQuantities;")
            s += c(0, f"")
            s += c(1, f"attribute def {quantity_name_unit} :> {unit_super_type} {{")
            if unit_super_type != "DimensionOneUnit":
                s += qpf_snippet
            s += c(1, f"}}")
            s += c(0, f"")

        return s

    @staticmethod
    def create_specialized_quantity_snippet(
            item_source: str, symbols: str, application_domain: str, quantity_name: str,
            quantity_dimension: QuantityDimension, measurement_units: str, tensor_order: int,
            definition: str, remarks: str, general_quantity_name: str,
            duplicated_quantity: Optional[GeneratedQuantity]) -> str:

        quantity_name_value = f"{quantity_name}Value"
        quantity_name_usage = convert_to_lowercase_first_letter(quantity_name)

        # Special treatment for dimension one specializations
        if general_quantity_name == "DimensionOneQuantity":
            general_quantity_name_value = "DimensionOneValue"
            general_quantity_name_usage = convert_to_lowercase_first_letter(general_quantity_name)
            general_quantities = "dimensionOneQuantities"
        else:
            general_quantity_name_value = f"{general_quantity_name}Value"
            general_quantity_name_usage = convert_to_lowercase_first_letter(general_quantity_name)
            general_quantities = f"{general_quantity_name_usage}Quantities"

        quantity_name_value = quote_non_ascii(quantity_name_value)
        quantity_name_usage = quote_non_ascii(quantity_name_usage)
        general_quantity_name_value = quote_non_ascii(general_quantity_name_value)
        general_quantity_name_usage = quote_non_ascii(general_quantity_name_usage)
        general_quantities = quote_non_ascii(general_quantities)

        s = ""
        doc_snippet = Generator.create_quantity_documentation_snippet(
            item_source, symbols, application_domain, quantity_name, quantity_dimension, measurement_units,
            tensor_order, definition, remarks, general_quantity_name)

        if duplicated_quantity and application_domain == "generic":
            package_name = f"{ISO_IEC_80000_SHORT_NAME}{duplicated_quantity.reference_source.short_name}"
            duplicated_item = f"{duplicated_quantity.item_id} {duplicated_quantity.std_name}"
            s += c(1, f"/* Refer to declaration for {quantity_name} in {package_name} item {duplicated_item} */")
        else:
            if duplicated_quantity:
                application_domain_pascal = convert_phrase_to_pascal_case(application_domain)
                quantity_name = f"{quantity_name}For{application_domain_pascal}"
                quantity_name_value = f"{quantity_name}Value"
                quantity_name_usage = convert_to_lowercase_first_letter(quantity_name)

                quantity_name_value = quote_non_ascii(quantity_name_value)
                quantity_name_usage = quote_non_ascii(quantity_name_usage)

            if general_quantity_name == "DimensionOneQuantity":
                s += c(1, f"attribute def {quantity_name_value} :> {general_quantity_name_value} {{")
                s += doc_snippet
                s += c(1, f"}}")
                s += c(1, f"attribute {quantity_name_usage}: {quantity_name_value} :> scalarQuantities;")
            else:
                s += c(1, f"attribute {quantity_name_usage}: {general_quantity_name_value} :> scalarQuantities {{")
                s += doc_snippet
                s += c(1, f"}}")

        s += c(0, f"")
        return s

    @staticmethod
    def create_vector_quantity_snippet(
            std_quantity_name: str, item_source: str, symbols: str, application_domain: str, quantity_name: str,
            quantity_dimension: QuantityDimension, measurement_units: str, tensor_order: int,
            definition: str, remarks: str, general_quantity_name: str, magnitude_quantity_name: str,
            is_bound: bool, generated_coordinate_frames: set[str]) -> str:

        # Initialize snippet buffer
        s = ""

        # Add a magnitude Unit and QuantityValue if this vector quantity is not specializing another vector quantity
        # and is not using an already defined magnitude
        if general_quantity_name == "" and magnitude_quantity_name == "":
            assert not isinstance(ISQuantity.reg_name_std.get(std_quantity_name), BaseQuantity)
            scalar_symbols = symbols.replace("vec(", "").replace(")", "")
            s += Generator.create_simple_or_derived_quantity_snippet(
                std_quantity_name=std_quantity_name,
                item_source=item_source + " (magnitude)",
                symbols=scalar_symbols,
                application_domain=application_domain,
                quantity_name=quantity_name,
                quantity_dimension=quantity_dimension,
                measurement_units=measurement_units,
                tensor_order=0,
                definition=definition,
                remarks=remarks,
                duplicated_quantity=None
            )
            if not quantity_name.endswith("Vector"):
                item_source += " (vector)"

        # Add documentation for vector quantity
        doc_snippet = Generator.create_quantity_documentation_snippet(
            item_source, symbols, application_domain, quantity_name, quantity_dimension, measurement_units,
            tensor_order, definition, remarks, general_quantity_name)

        if general_quantity_name == "" and magnitude_quantity_name == "":
            if quantity_name.endswith("Vector"):
                scalar_quantity_unit = quote_non_ascii(f"{quantity_name}MagnitudeUnit")
                quantity_name = removesuffix(quantity_name, "Vector")
            else:
                scalar_quantity_unit = quote_non_ascii(f"{quantity_name}Unit")
        elif general_quantity_name != "":
            scalar_quantity_unit = quote_non_ascii(f"{general_quantity_name}Unit")
        else:
            scalar_quantity_unit = quote_non_ascii(f"{magnitude_quantity_name}Unit")

        quantity_definition = f"Cartesian{quantity_name}"
        if quantity_name in ("Displacement", "PositionVector"):
            quantity_definition = quantity_name

        if quantity_definition.endswith("Vector"):
            quantity_definition = quantity_definition.replace("Vector", "3dVector")
        else:
            quantity_definition += "3dVector"
        quantity_usage = convert_to_lowercase_first_letter(quantity_definition)
        is_bound_string = "true" if is_bound else "false"

        # Detect exceptions for dimension one and for speed which is the scalar quantity name for velocity
        add_coordinate_frame = False
        if magnitude_quantity_name in ("Speed",):
            coordinate_frame_name = quote_non_ascii(f"Cartesian{quantity_name}3dCoordinateFrame")
            add_coordinate_frame = True
        elif magnitude_quantity_name == "Length" or general_quantity_name in ("Displacement", "PositionVector"):
            coordinate_frame_name = "Spatial3dCoordinateFrame"
        elif general_quantity_name == "":
            coordinate_frame_name = quote_non_ascii(f"Cartesian{quantity_name}3dCoordinateFrame")
            add_coordinate_frame = True
        else:
            coordinate_frame_name = quote_non_ascii(f"Cartesian{general_quantity_name}3dCoordinateFrame")
            if coordinate_frame_name not in generated_coordinate_frames:
                add_coordinate_frame = True

        # if add_coordinate_frame:
        #     s += Generator.create_coordinate_frame_snippet(
        #         coordinate_frame_name, doc_snippet, is_bound_string, scalar_quantity_unit)
        #     generated_coordinate_frames.add(coordinate_frame_name)

        s += c(1, f"attribute def {quantity_definition} :> '3dVectorQuantityValue' {{")
        s += doc_snippet
        # s += c(2, f"attribute :>> dimensions = 3;")
        # s += c(2, f"attribute :>> num: Real[3];")
        s += c(2, f"attribute :>> isBound = {is_bound_string};")
        s += c(2, f"attribute :>> mRef: {coordinate_frame_name}[1];")
        s += c(1, f"}}")
        s += c(0, f"")
        s += c(1, f"attribute {quantity_usage}: {quantity_definition} :> vectorQuantities;")
        s += c(0, f"")

        if quantity_name in ("Displacement", "PositionVector"):
            s += DATA.SPATIAL_CARTESIAN_VECTOR_QUANTITIES.format(quantity_definition=quantity_definition, quantity_usage=quantity_usage)
            s += DATA.SPATIAL_CYLINDRICAL_VECTOR_QUANTITIES.format(quantity_definition=quantity_definition, quantity_usage=quantity_usage)
            s += DATA.SPATIAL_SPHERICAL_VECTOR_QUANTITIES.format(quantity_definition=quantity_definition, quantity_usage=quantity_usage)
        if quantity_name in ("PositionVector", ):
            s += DATA.SPATIAL_PLANETARY_VECTOR_QUANTITIES.format(quantity_definition=quantity_definition, quantity_usage=quantity_usage)

        if add_coordinate_frame:
            s += Generator.create_coordinate_frame_snippet(
                coordinate_frame_name, doc_snippet, is_bound_string, scalar_quantity_unit)
            generated_coordinate_frames.add(coordinate_frame_name)
        return s

    @staticmethod
    def create_coordinate_frame_snippet(coordinate_frame_name: str, doc_snippet: str, is_bound_string: str,
                                         scalar_quantity_unit: str) -> str:
        s = ""
        s += c(1, f"attribute def {coordinate_frame_name} :> '3dCoordinateFrame' {{")
        # s += doc_snippet
        s += c(2, f"attribute :>> isBound = {is_bound_string};")
        s += c(2, f"attribute :>> isOrthogonal = true;")
        s += c(2, f"attribute :>> mRefs: {scalar_quantity_unit}[3];")
        s += c(1, f"}}")
        s += c(0, f"")
        return s

    @staticmethod
    def create_tensor_quantity_snippet(
            std_quantity_name: str, item_source: str, symbols: str, application_domain: str, quantity_name: str,
            quantity_dimension: QuantityDimension, measurement_units: str, tensor_order: int,
            definition: str, remarks: str, general_quantity_name: str, is_bound: bool) -> str:

        if quantity_name.endswith("Tensor"):
            quantity_name = quantity_name[:-6]

        s = ""
        if general_quantity_name == "":
            assert not isinstance(ISQuantity.reg_name_std.get(std_quantity_name), BaseQuantity)
            scalar_symbols = symbols.replace("vec(", "").replace(")", "")
            s += Generator.create_simple_or_derived_quantity_snippet(
                std_quantity_name=std_quantity_name,
                item_source=item_source + " (magnitude)",
                symbols=scalar_symbols,
                application_domain=application_domain,
                quantity_name=quantity_name,
                quantity_dimension=quantity_dimension,
                measurement_units=measurement_units,
                tensor_order=0,
                definition=definition,
                remarks=remarks,
                duplicated_quantity=None
            )
            if not quantity_name.endswith("Tensor"):
                item_source += " (tensor)"

        quantity_definition = f"Cartesian3d{quantity_name}Tensor"
        quantity_usage = convert_to_lowercase_first_letter(quantity_name)
        tensor_measurement_ref = f"Cartesian3d{quantity_name}MeasurementReference"
        is_bound_string = "true" if is_bound else "false"

        doc_snippet = Generator.create_quantity_documentation_snippet(
            item_source, symbols, application_domain, quantity_name, quantity_dimension, measurement_units,
            tensor_order, definition, remarks, general_quantity_name)

        if general_quantity_name == "":
            scalar_quantity_unit = f"{quantity_name}Unit"
        else:
            scalar_quantity_unit = f"{general_quantity_name}Unit"
        s += c(1, f"attribute def {quantity_definition} :> TensorQuantityValue {{")
        s += doc_snippet
        s += c(2, f"attribute :>> isBound = {is_bound_string};")
        s += c(2, f"attribute :>> num: Real[9];")
        s += c(2, f"attribute :>> mRef: {tensor_measurement_ref}[1];")
        s += c(1, f"}}")
        s += c(0, f"")
        # s += c(1, f"attribute {quantity_usage}Tensors: {quantity_definition}[*] nonunique :> tensorQuantities;")
        # s += c(1, f"attribute {quantity_usage}Tensor: {quantity_definition}[1] :> {quantity_usage}Tensors;")
        s += c(1, f"attribute {quantity_usage}Tensor: {quantity_definition} :> tensorQuantities;")
        s += c(0, f"")
        s += c(1, f"attribute def {tensor_measurement_ref} :> TensorMeasurementReference {{")
        s += c(2, f"attribute :>> dimensions = (3, 3);")
        s += c(2, f"attribute :>> isBound = {is_bound_string};")
        s += c(2, f"attribute :>> mRefs: {scalar_quantity_unit}[9];")
        s += c(1, f"}}")
        s += c(0, f"")
        return s


def verbalize_unit(unit_symbol: str) -> str:
    """

    """
    verbalization = []
    previous_tok = None
    previous_name = ""
    is_denominator = False
    with io.StringIO(unit_symbol) as f:
        for tok in tokenize.generate_tokens(f.readline):
            # LOGGER.debug(tok)
            if tok.type == token.OP:
                if tok.string == "^":
                    verbalization.append("to the power")
                elif tok.string == "/":
                    verbalization.append("per")
                    is_denominator = True
                elif tok.string == "-":
                    verbalization.append("minus")
            elif tok.type == token.NAME:
                quantity = ISQuantity.reg_unit.get(tok.string, None)
                unit_name = quantity.unit_name if quantity else tok.string
                verbalization.append(unit_name)
                previous_name = unit_name
            elif tok.type == token.NUMBER:
                exponent = int(tok.string)
                if (exponent == 2 or exponent == 3) and previous_tok and previous_tok.string != "-":
                    if is_length_unit_name(previous_name):
                        verbalization.pop()
                        verbalization.pop()
                        verbalization.append("square" if exponent == 2 else "cubic")
                        verbalization.append(previous_name)
                    else:
                        verbalization.pop()
                        verbalization.append("squared" if exponent == 2 else "cubed")
                else:
                    if exponent == 1 and previous_tok.string != "-":
                        LOGGER.warning(f"Redundant exponent +1 in measurement unit {unit_symbol}")
                    verbalization.append(tok.string)
            elif tok.type == token.ERRORTOKEN:
                if tok.string == "°":
                    verbalization.append("degree")
            elif tok.type == token.ENDMARKER:
                pass
            elif tok.type == token.NEWLINE:
                pass
            else:
                LOGGER.warning(f"Unexpected token \"{tok.string}\" token type={tok.type}")
            previous_tok = tok
    return " ".join(verbalization)


if __name__ == "__main__":
    # Create console information message logger
    consoleHandler = logging.StreamHandler(sys.stdout)
    consoleHandler.setLevel(logging.INFO)
    consoleHandler.setFormatter(logging.Formatter("%(levelname)-8s: %(message)s"))
    LOGGER.addHandler(consoleHandler)

    # Process the given ISO/IEC parts
    start_timestamp = datetime.datetime.now()
    LOGGER.info(f"Run started at {start_timestamp.isoformat()}")
    assert len(sys.argv) == 1
    generator = Generator()
    iso_iec_part_numbers = [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
    generator.generate_quantities_and_measurement_references(
        working_dir="./data/iso-iec-80000",
        quantities_file_name="iso_iec_80000_quantities_and_units.xlsx",
        part_numbers=iso_iec_part_numbers
    )
    end_timestamp = datetime.datetime.now()
    elapsed_time = end_timestamp - start_timestamp
    LOGGER.info(f"Run completed at {end_timestamp.isoformat()} in {elapsed_time.total_seconds():.3f} s")
