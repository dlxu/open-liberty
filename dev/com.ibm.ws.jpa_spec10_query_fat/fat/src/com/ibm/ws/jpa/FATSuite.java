/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.jpa;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import componenttest.rules.repeater.FeatureReplacementAction;
import componenttest.rules.repeater.RepeatTests;

@RunWith(Suite.class)
@SuiteClasses({
                TestOLGH8014_EJB.class,
                TestOLGH8014_Web.class,
                TestOLGH8294_EJB.class,
                TestOLGH8294_Web.class,
                componenttest.custom.junit.runner.AlwaysPassesTest.class
})
public class FATSuite {
    public final static String[] JAXB_PERMS = { "permission java.lang.RuntimePermission \"accessClassInPackage.com.sun.xml.internal.bind.v2.runtime.reflect\";",
                                                "permission java.lang.RuntimePermission \"accessClassInPackage.com.sun.xml.internal.bind\";",
                                                "permission java.lang.RuntimePermission \"accessDeclaredMembers\";" };
    @ClassRule
    public static RepeatTests r = RepeatTests.withoutModification()
                    .andWith(FeatureReplacementAction.EE7_FEATURES())
                    .andWith(new RepeatWithJPA20());
}
