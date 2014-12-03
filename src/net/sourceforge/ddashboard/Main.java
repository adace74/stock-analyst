/*
 * $Id$
 *
 * (c) Copyright 2013 Adam W. Dace.  All Rights Reserved.
 * Please see the accompanying COPYING file for license information.
 */

package net.sourceforge.ddashboard;

import java.lang.*;
import net.sourceforge.ddashboard.*;

class Main
{
    public static void main(String args[])
    {
        DesktopDashboard myInstance;

        String myRevision;

        myRevision = "$Revision: 47 $";
        myRevision = myRevision.replace("$Revision: ", "");
        myRevision = myRevision.replace(" $", "");

        System.out.println("INFO:  Starting DesktopDashboard v0.1(r" +
                           myRevision + ")...");

        System.out.println("INFO:  Valid Java JDK v" +
                           System.getProperty("java.version") + " on " +
                           System.getProperty("os.name") + " v" +
                           System.getProperty("os.version"));

        myInstance = new DesktopDashboard();

        // TODO: Error checking.
        if (myInstance.load())
            myInstance.run();
    }
}
