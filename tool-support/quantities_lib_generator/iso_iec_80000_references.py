from reference_source import ReferenceSource

ISO_IEC_80000_TITLE = "Quantities and units"
ISO_IEC_80000_SHORT_NAME = "ISQ"

ISO_IEC_80000_PARTS: dict[int, ReferenceSource] = {
    1: ReferenceSource("ISO-80000-1", "General", "General", 2022, "https://www.iso.org/standard/76921.html"),
    2: ReferenceSource("ISO-80000-2", "Mathematics", "Math", 2019, "https://www.iso.org/standard/64973.html"),
    3: ReferenceSource("ISO-80000-3", "Space and Time", "SpaceTime", 2019, "https://www.iso.org/standard/64974.html"),
    4: ReferenceSource("ISO-80000-4", "Mechanics", "Mechanics", 2019, "https://www.iso.org/standard/64975.html"),
    5: ReferenceSource("ISO-80000-5", "Thermodynamics", "Thermodynamics", 2019, "https://www.iso.org/standard/64976.html"),
    6: ReferenceSource("IEC-80000-6", "Electromagnetism", "Electromagnetism", 2008, "https://www.iso.org/obp/ui/#iso:std:iec:80000:-6:ed-1:v1:en,fr"),
    7: ReferenceSource("ISO-80000-7", "Light and radiation", "Light", 2019, "https://www.iso.org/standard/64977.html"),
    8: ReferenceSource("ISO-80000-8", "Acoustics", "Acoustics", 2020, "https://www.iso.org/standard/64978.html"),
    9: ReferenceSource("ISO-80000-9", "Physical chemistry and molecular physics", "ChemistryMolecular", 2019, "https://www.iso.org/standard/64979.html"),
    10: ReferenceSource("ISO-80000-10", "Atomic and nuclear physics", "AtomicNuclear", 2019, "https://www.iso.org/standard/64980.html"),
    11: ReferenceSource("ISO-80000-11", "Characteristic numbers", "CharacteristicNumbers", 2019, "https://www.iso.org/standard/64982.html"),
    12: ReferenceSource("ISO-80000-12", "Condensed matter physics", "CondensedMatter", 2019, "https://www.iso.org/standard/63480.html"),
    13: ReferenceSource("IEC-80000-13", "Information science and technology", "Information", 2008, "https://www.iso.org/obp/ui/#iso:std:iec:80000:-13:ed-1:v1:en")
}
