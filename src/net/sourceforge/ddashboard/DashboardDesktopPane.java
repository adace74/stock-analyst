/*
 * $Id$
 *
 * (c) Copyright 2013 Adam W. Dace.  All Rights Reserved.
 * Please see the accompanying COPYING file for license information.
 */

package net.sourceforge.ddashboard;

import java.lang.*;
import javax.swing.*;
import net.sourceforge.ddashboard.*;

class DashboardDesktopPane
{
    public DashboardDesktopPane()
    {
    }

    public JDesktopPane createDesktopPane()
    {
        JDesktopPane myDesktopPane;
        JInternalFrame myDateTimeFrame;
        JInternalFrame myWeatherFrame;
        JInternalFrame myMiscFrame;
        JInternalFrame myNewsFrame;

        myDesktopPane = new JDesktopPane();
        myDateTimeFrame = new DashboardJInternalFrame();
        myWeatherFrame = new DashboardJInternalFrame();
        myMiscFrame = new DashboardJInternalFrame();
        myNewsFrame = new DashboardJInternalFrame();

        myDateTimeFrame.setTitle("Date / Time");
        myDateTimeFrame.show();

        try
        {
            myDateTimeFrame.setSelected(true);
        }
        catch(java.beans.PropertyVetoException myException)
        {
            System.out.println(myException.toString());
        }

        myDesktopPane.add(myDateTimeFrame, 5);

        myWeatherFrame.setTitle("Weather");
        myWeatherFrame.setVisible(true);
        myDesktopPane.add(myWeatherFrame, 5);

        myMiscFrame.setTitle("Stocks");
        myMiscFrame.setVisible(true);
        myDesktopPane.add(myMiscFrame, 5);

        myNewsFrame.setTitle("News");
        myNewsFrame.setVisible(true);
        myDesktopPane.add(myNewsFrame, 5);

        return myDesktopPane;
    }
}
