/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *
 *******************************************************************************/
package org.omg.sysml.logic.config;

import org.omg.sysml.logic.adapter.SysMLAdapters;
import org.omg.sysml.logic.adapter.SysMLLogicAdapterFactory;
import org.omg.sysml.logic.delegate.SysMLDelegateRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SysMLLogicConfiguration {

    @Bean
    public SysMLDelegateRegistrar sysMLDelegateRegistrar() {
        SysMLDelegateRegistrar registrar = new SysMLDelegateRegistrar();
        registrar.register();
        return registrar;
    }

    @Bean
    public SysMLLogicAdapterFactory sysMLLogicAdapterFactory() {
        return new SysMLLogicAdapterFactory();
    }

    @Bean
    public SysMLAdapters sysMLAdapters(SysMLLogicAdapterFactory adapterFactory) {
        return new SysMLAdapters(adapterFactory);
    }
}
