/*
 * $Id$
 *
 * (c) Copyright 2013 Adam W. Dace.  All Rights Reserved.
 * Please see the accompanying COPYING file for license information.
 */

package net.sourceforge.ddashboard;

import java.lang.*;
import net.sourceforge.ddashboard.*;

class DesktopDashboard
{
    // Load settings.

    public boolean load()
    {
        return true;
    }

    // Run program.

    public boolean run()
    {
        DashboardController myInstance;

        myInstance = new DashboardController();

        return myInstance.run();
    }
}
