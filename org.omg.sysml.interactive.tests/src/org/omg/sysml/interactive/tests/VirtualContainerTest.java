/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.ConnectionDefinition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;
import org.omg.sysml.util.VirtualContainer;

/**
 * Tests that the elements the implementation creates outside the model for implied relationships
 * (feature chains and binding connectors) are linked to the model element for which they are created,
 * and that {@link ElementUtil#getEffectiveContainer(EObject)} reaches the model from them.
 */
public class VirtualContainerTest extends AbstractImplicitSpecializationTest {

	/**
	 * The result of a {@code FeatureChainExpression} subsets a chain of the source parameter and the
	 * source target feature. The expression adds that chain to the implicit general types of its result
	 * when it is transformed; the chain is created detached and its virtual container, and therefore
	 * its effective container, must be the expression result.
	 */
	@Test
	public void featureChainExpressionResultChainIsLinkedToTheResult() throws Exception {
		// package Chains {
		//     feature a { feature b; }
		//     feature c = a.b;
		// }
		Resource resource = parse("chainExpression.kerml", """
				package Chains {
					feature a { feature b; }
					feature c = a.b;
				}
				""");
		Feature c = findByName(resource, "c", Feature.class);
		FeatureChainExpression expression = (FeatureChainExpression)FeatureUtil.getValuationFor(c).getValue();
		Feature result = expression.getResult();

		// Transforming the expression alone records the chain "source.b" as an implicit general type of
		// the result, without materializing it: the chain is still detached.
		ElementUtil.transform(expression);
		Feature chain = findDetachedChain(TypeUtil.getImplicitGeneralTypesFor(result));
		assertSame(result, VirtualContainer.getVirtualContainer(chain));
		assertSame(result, ElementUtil.getEffectiveContainer(chain));
	}

	/**
	 * A feature bound to a value without an explicit specialization subsets the chain of the value
	 * expression and its result. That chain is created detached and must be linked to the valued
	 * feature.
	 */
	@Test
	public void boundValueChainIsLinkedToTheValuedFeature() throws Exception {
		// package BoundValue {
		//     feature x;
		//     feature y = x;
		// }
		Resource resource = parse("boundValue.kerml", """
				package BoundValue {
					feature x;
					feature y = x;
				}
				""");
		Feature y = findByName(resource, "y", Feature.class);

		// The implicit subsetting of y targets the detached chain "value.result".
		Feature chain = findDetachedChain(TypeUtil.getImplicitGeneralTypesFor(y));
		assertSame(y, VirtualContainer.getVirtualContainer(chain));
		assertSame(y, ElementUtil.getEffectiveContainer(chain));
	}

	/**
	 * A succession whose source is a decision node, and a succession whose target is a merge node,
	 * specialize a detached chain through the control node. Each chain must be linked to its
	 * succession.
	 */
	@Test
	public void decisionAndMergeChainsAreLinkedToTheSuccession() throws Exception {
		// action def Control {
		//     action A1;
		//     action A2;
		//     decide D;
		//     if true then A1;
		//     else A2;
		//     action B1;
		//     then M;
		//     action B2;
		//     then M;
		//     merge M;
		// }
		Resource resource = parse("control.sysml", """
				action def Control {
					action A1;
					action A2;
					decide D;
					if true then A1;
					else A2;
					action B1;
					then M;
					action B2;
					then M;
					merge M;
				}
				""");

		// Outgoing succession of D: its chained general is "D.outgoingHBLink".
		SuccessionAsUsage fromDecision = findSuccession(resource, "D", true);
		Feature decisionChain = findDetachedChain(TypeUtil.getImplicitGeneralTypesFor(fromDecision));
		assertSame(fromDecision, VirtualContainer.getVirtualContainer(decisionChain));
		assertSame(fromDecision, ElementUtil.getEffectiveContainer(decisionChain));

		// Incoming succession of M: its chained general is "M.incomingHBLink".
		SuccessionAsUsage toMerge = findSuccession(resource, "M", false);
		Feature mergeChain = findDetachedChain(TypeUtil.getImplicitGeneralTypesFor(toMerge));
		assertSame(toMerge, VirtualContainer.getVirtualContainer(mergeChain));
		assertSame(toMerge, ElementUtil.getEffectiveContainer(mergeChain));
	}

	/**
	 * The payload parameter of a transition with an accepter subsets the chain of the accepter and its
	 * payload parameter. That chain is created detached and must be linked to the payload parameter.
	 */
	@Test
	public void transitionPayloadChainIsLinkedToThePayloadParameter() throws Exception {
		// state def Machine {
		//     attribute def Signal;
		//     entry; then s1;
		//     state s1;
		//     state s2;
		//     transition t first s1 accept sig : Signal then s2;
		// }
		Resource resource = parse("transition.sysml", """
				state def Machine {
					attribute def Signal;
					entry; then s1;
					state s1;
					state s2;
					transition t first s1 accept sig : Signal then s2;
				}
				""");
		TransitionUsage transition = findByName(resource, "t", TransitionUsage.class);
		ReferenceUsage payload = (ReferenceUsage)UsageUtil.getPayloadParameterOf(transition);
		assertNotNull("Missing transition payload parameter", payload);

		// The implicit subsetting of the payload parameter targets the detached chain "accepter.sig".
		Feature chain = findDetachedChain(TypeUtil.getImplicitGeneralTypesFor(payload));
		assertSame(payload, VirtualContainer.getVirtualContainer(chain));
		assertSame(payload, ElementUtil.getEffectiveContainer(chain));
	}

	/**
	 * The transformation of a valued feature creates a binding connector detached, linked to the
	 * feature, then inserts it into the model. Once inserted, the connector keeps its virtual
	 * container but its effective container is its real container.
	 */
	@Test
	public void valueBindingConnectorKeepsItsVirtualContainerOnceContained() throws Exception {
		// package Binding {
		//     feature x;
		//     feature y = x;
		// }
		Resource resource = parse("binding.kerml", """
				package Binding {
					feature x;
					feature y = x;
				}
				""");
		Feature y = findByName(resource, "y", Feature.class);

		// Transformation creates the binding connector of y's value and adds it to the model. The value
		// expression also owns a binding connector for its own result, linked to the expression, so the
		// connector is selected by its virtual container.
		ElementUtil.transformAll(resource, true);
		BindingConnector connector = findBindingConnectorLinkedTo(y);
		assertNotNull("Expected the value binding connector in the model", connector.eContainer());
		assertSame(y, VirtualContainer.getVirtualContainer(connector));
		assertSame(connector.eContainer(), ElementUtil.getEffectiveContainer(connector));
	}

	/**
	 * A detached chain resolves library types from the model through its virtual container, as the
	 * element it was created for does. The rules applied by the chain's own adapter then find its
	 * library general: without the link, the lookup returns nothing and the chain gets no general.
	 */
	@Test
	public void detachedChainResolvesLibraryTypesFromItsModel() throws Exception {
		// package Library {
		//     feature x;
		//     feature y = x;
		// }
		Resource resource = parse("library.kerml", """
				package Library {
					feature x;
					feature y = x;
				}
				""");
		Feature y = findByName(resource, "y", Feature.class);
		Feature chain = findDetachedChain(TypeUtil.getImplicitGeneralTypesFor(y));

		// The chain has no resource: the library is found through its virtual container, y.
		Type things = SysMLLibraryUtil.getLibraryType(y, "Base::things");
		assertNotNull(things);
		assertSame(things, SysMLLibraryUtil.getLibraryType(chain, "Base::things"));

		// The default rule of the chain's own adapter therefore finds its library general
		// (checkFeatureSpecialization).
		List<String> generals = TypeUtil.getImplicitGeneralTypesFor(chain).stream().map(Type::getQualifiedName).toList();
		assertTrue("Expected Base::things in " + generals, generals.contains("Base::things"));
	}

	/**
	 * A binding connector created for a valued feature, before it is inserted into the model,
	 * resolves library types from the model through its virtual container.
	 */
	@Test
	public void detachedBindingConnectorResolvesLibraryTypesFromItsModel() throws Exception {
		// package Connector {
		//     feature x;
		//     feature y = x;
		// }
		Resource resource = parse("connector.kerml", """
				package Connector {
					feature x;
					feature y = x;
				}
				""");
		Feature y = findByName(resource, "y", Feature.class);

		// Transformation without implicit elements creates the value binding connector of y but does
		// not insert it: the connector stays detached, linked to y.
		ElementUtil.transformAll(resource, false);
		List<BindingConnector> connectors = new ArrayList<>();
		TypeUtil.forEachImplicitBindingConnectorOf(y, (connector, membershipKind) -> connectors.add(connector));
		BindingConnector connector = connectors.stream()
				.filter(candidate -> VirtualContainer.getVirtualContainer(candidate) == y).findFirst().orElseThrow();
		assertNull(connector.eResource());

		// The library general of a binding connector is found from the connector itself.
		assertNotNull(SysMLLibraryUtil.getLibraryType(connector, "Links::selfLinks"));
	}

	/**
	 * A Type that is the root of its resource and the featuring type of its ends stays the root of
	 * its resource after transformation: materializing the implied TypeFeaturing of an end must not
	 * move the root into that relationship, which would create a containment cycle and leave the
	 * resource.
	 */
	@Test
	public void resourceRootStaysInItsResourceAfterTransformation() throws Exception {
		// A Type cannot be the root of a parsed resource, whose root is a Namespace: the model is built
		// programmatically, a ConnectionDefinition with two end Features as the only resource content.
		Resource resource = createResource("root.sysml");
		ConnectionDefinition connectionDefinition = SysMLFactory.eINSTANCE.createConnectionDefinition();
		resource.getContents().add(connectionDefinition);
		for (int i = 0; i < 2; i++) {
			Feature end = SysMLFactory.eINSTANCE.createFeature();
			end.setIsEnd(true);
			FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
			membership.setOwnedMemberFeature(end);
			connectionDefinition.getOwnedRelationship().add(membership);
		}

		// The ends are featured by the ConnectionDefinition; inserting that TypeFeaturing must leave
		// the ConnectionDefinition where it is.
		ElementUtil.transformAll(connectionDefinition, true);
		assertNull(connectionDefinition.eContainer());
		assertSame(resource, connectionDefinition.eResource());
	}

	/**
	 * The featuring type of a variable feature is a {@code <Owner>_snapshots} feature created
	 * outside the model and stored as an implicit featuring type of the feature. Storing it records
	 * the feature, which owns the implied TypeFeaturing, as its virtual container.
	 */
	@Test
	public void snapshotsFeaturingTypeIsLinkedToTheVariableFeature() throws Exception {
		Resource resource = parse("snapshots.kerml", """
				package Snapshots {
					class C {
						var feature x;
					}
				}
				""");
		Feature x = findByName(resource, "x", Feature.class);

		// Transforming x computes its featuring type (checkFeatureFeatureMembershipTypeFeaturing):
		// a new C_snapshots feature redefining Occurrence::snapshots, which is not inserted.
		ElementUtil.transform(x);
		Feature snapshots = x.getFeaturingType().stream()
				.filter(Feature.class::isInstance).map(Feature.class::cast)
				.filter(featuring -> "C_snapshots".equals(featuring.getDeclaredName()))
				.findFirst().orElseThrow();
		assertNull(snapshots.eContainer());

		// Expected: its virtual container is x, through which it reaches the model.
		assertSame(x, VirtualContainer.getVirtualContainer(snapshots));
		assertSame(x, ElementUtil.getClosestElementInResource(snapshots));
	}

	/**
	 * The binding connector of an initial value is featured by a {@code that.startShot} chain
	 * created outside the model. The chain is stored as an implicit featuring type of the connector,
	 * so the connector is its virtual container, and the chain reaches the model through the
	 * connector's own virtual container, the valued feature.
	 */
	@Test
	public void initialValueFeaturingChainIsLinkedToTheBindingConnector() throws Exception {
		// package Initial {
		//     class C {
		//         feature x;
		//         var feature y := x;
		//     }
		// }
		Resource resource = parse("initial.kerml", """
				package Initial {
					class C {
						feature x;
						var feature y := x;
					}
				}
				""");
		Feature y = findByName(resource, "y", Feature.class);

		// Transforming y creates its value binding connector (checkFeatureValueBindingConnector),
		// featured by the chain that.startShot because the value is initial.
		ElementUtil.transform(y);
		BindingConnector connector = findImplicitBindingConnectorOf(y);
		Feature chain = connector.getFeaturingType().stream()
				.filter(Feature.class::isInstance).map(Feature.class::cast)
				.filter(featuring -> featuring.getChainingFeature().size() == 2)
				.findFirst().orElseThrow();

		// Expected: the chain is linked to the connector, and the connector to y.
		assertSame(connector, VirtualContainer.getVirtualContainer(chain));
		assertSame(y, VirtualContainer.getVirtualContainer(connector));
		assertSame(y, ElementUtil.getClosestElementInResource(chain));
	}

	/**
	 * In a model built without a resource, a root can be stored as the target of an implied
	 * relationship owned by one of its own members, for example as the featuring type of a nested
	 * feature. Linking the root to that member would close a cycle of effective containers: the
	 * link is refused, and the walk to the model terminates.
	 */
	@Test
	public void rootIsNotLinkedToOneOfItsMembers() {
		// classifier Root { feature member; }, built without a resource.
		Classifier root = SysMLFactory.eINSTANCE.createClassifier();
		Feature member = SysMLFactory.eINSTANCE.createFeature();
		TypeUtil.addOwnedFeatureTo(root, member);

		// Storing root as an implied relationship target of member must not link them.
		VirtualContainer.attach(root, member);
		assertNull(VirtualContainer.getVirtualContainer(root));

		// Expected: no element in a resource is found, instead of an endless walk.
		assertNull(ElementUtil.getClosestElementInResource(member));
	}

	/**
	 * An element parsed from text is created in the model: it has no virtual container and its
	 * effective container is its real container.
	 */
	@Test
	public void parsedElementHasNoVirtualContainer() throws Exception {
		// package Parsed {
		//     feature x;
		// }
		Resource resource = parse("parsed.kerml", """
				package Parsed {
					feature x;
				}
				""");
		Feature x = findByName(resource, "x", Feature.class);

		assertNull(VirtualContainer.getVirtualContainer(x));
		assertSame(x.eContainer(), ElementUtil.getEffectiveContainer(x));
	}

	private static Feature findDetachedChain(List<Type> generals) {
		for (Type general : generals) {
			if (general instanceof Feature feature && !feature.getOwnedFeatureChaining().isEmpty()
					&& feature.eContainer() == null) {
				return feature;
			}
		}
		throw new AssertionError("Missing detached feature chain among " + generals);
	}

	/**
	 * Returns the first SuccessionAsUsage of a resource whose source or target end is the named node.
	 *
	 * @param resource the resource searched, in containment order
	 * @param nodeName the declared name of the end feature
	 * @param fromNode {@code true} to match the source end, {@code false} to match the target end
	 * @return the succession found
	 * @throws AssertionError when no such succession exists
	 */
	private static SuccessionAsUsage findSuccession(Resource resource, String nodeName, boolean fromNode) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			if (contents.next() instanceof SuccessionAsUsage succession) {
				Feature end;
				if (fromNode) {
					end = UsageUtil.getSourceOf(succession);
				} else {
					end = UsageUtil.getTargetOf(succession);
				}
				if (end != null && nodeName.equals(end.getDeclaredName())) {
					return succession;
				}
			}
		}
		throw new AssertionError("Missing succession for " + nodeName);
	}

	/**
	 * Returns the first BindingConnector contained in a feature whose virtual container is that
	 * feature.
	 *
	 * @param feature the feature whose contents are searched
	 * @return the binding connector found
	 * @throws AssertionError when no such binding connector exists
	 */
	private static BindingConnector findBindingConnectorLinkedTo(Feature feature) {
		for (var contents = feature.eAllContents(); contents.hasNext();) {
			if (contents.next() instanceof BindingConnector connector
					&& VirtualContainer.getVirtualContainer(connector) == feature) {
				return connector;
			}
		}
		throw new AssertionError("Missing binding connector linked to " + feature.getDeclaredName());
	}

	/**
	 * Returns the first implicit BindingConnector of a feature, not yet inserted into the model.
	 *
	 * @param feature the feature whose implicit binding connectors are searched
	 * @return the binding connector found
	 * @throws AssertionError when the feature has no implicit binding connector
	 */
	private static BindingConnector findImplicitBindingConnectorOf(Feature feature) {
		List<BindingConnector> connectors = new ArrayList<>();
		TypeUtil.forEachImplicitBindingConnectorOf(feature, (connector, membershipKind) -> connectors.add(connector));
		if (connectors.isEmpty()) {
			throw new AssertionError("Missing implicit binding connector of " + feature.getDeclaredName());
		}
		return connectors.get(0);
	}
}
