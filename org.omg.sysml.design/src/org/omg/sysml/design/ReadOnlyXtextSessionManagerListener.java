/*******************************************************************************
 * Copyright (c) 2014, 2017 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.omg.sysml.design;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener.Stub;
import org.eclipse.xtext.resource.XtextResource;

/**
 * A session manager listener which will switch the saving policy of every
 * session which uses Xtext resources.
 * <p>
 * Due to bug 432795 in Xtext, we need to override the default saving options
 * for Xtext resources to avoid hitting false positive validation errors
 * preventing the save. Furthermore when one of this error is thrown the
 * underlying file is emptied which makes this quite critical.
 * <p>
 * In addition, given the structure of a typical Xtext resource set (many
 * "library" resources, which are referenced by the session but do not reference
 * it themselves), we use a policy with different and more efficient strategy to
 * determine which resources need to be saved.
 * 
 * @author cbrun
 */
public class ReadOnlyXtextSessionManagerListener extends Stub {
    @Override
    public void notify(Session updated, int notification) {
        super.notify(updated, notification);
        switch (notification) {
        case SessionListener.OPENED:
            changeSavingPolicyIfXtextIsUsed(updated);
            break;

        case SessionListener.SEMANTIC_CHANGE:
            changeSavingPolicyIfXtextIsUsed(updated);
            break;
        }
    }

    private void changeSavingPolicyIfXtextIsUsed(Session session) {
        TransactionalEditingDomain ted = session.getTransactionalEditingDomain();
        if (ted != null && !(session.getSavingPolicy() instanceof ReadOnlyXtextSavingPolicy) && containsXtextResources(ted)) {
            session.setSavingPolicy(new ReadOnlyXtextSavingPolicy());
        }
    }

    protected boolean containsXtextResources(TransactionalEditingDomain ted) {
        return ted.getResourceSet() != null && ted.getResourceSet().getResources().stream().anyMatch(XtextResource.class::isInstance);
    }
}
