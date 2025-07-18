/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 * Contributors:
 *  Ed Seidewitz, MDS
 */
package org.omg.sysml.xtext.scoping;

import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.omg.kerml.xtext.scoping.KerMLScopeProvider;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class SysMLScopeProvider extends KerMLScopeProvider {
  public EObject featureRelationship(final EObject context) {
    if ((context instanceof FeatureChaining)) {
      Feature featureChained = ((FeatureChaining)context).getFeatureChained();
      final EList<FeatureChaining> ownedFeatureChainings = featureChained.getOwnedFeatureChaining();
      final int i = ownedFeatureChainings.indexOf(context);
      if ((i <= 0)) {
        return featureChained.getOwningRelationship();
      }
    }
    return context;
  }

  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    EObject relationship = this.featureRelationship(context);
    if ((relationship instanceof Membership)) {
      final Namespace owningNamespace = ((Membership)relationship).getMembershipOwningNamespace();
      if (((owningNamespace instanceof TransitionUsage) && 
        Objects.equals(relationship, IterableExtensions.<Membership>head(IterableExtensions.<Membership>filter(owningNamespace.getOwnedMembership(), ((Function1<Membership, Boolean>) (Membership mem) -> {
          return Boolean.valueOf((!(mem instanceof FeatureMembership)));
        })))))) {
        return this.scope_owningNamespace(owningNamespace, context, reference);
      }
    } else {
      if ((relationship instanceof ReferenceSubsetting)) {
        final Feature owningFeature = ((ReferenceSubsetting)relationship).getOwningFeature();
        final Type owningType = owningFeature.getOwningType();
        if (((owningType instanceof SuccessionAsUsage) && (owningType.getOwnedEndFeature().indexOf(owningFeature) == 1))) {
          final Namespace outerNamespace = owningType.getOwningNamespace();
          if (((outerNamespace instanceof TransitionUsage) && (owningType == ((TransitionUsage) outerNamespace).getSuccession()))) {
            return this.scope_owningNamespace(outerNamespace, context, reference);
          }
        }
      }
    }
    return super.getScope(context, reference);
  }
}
