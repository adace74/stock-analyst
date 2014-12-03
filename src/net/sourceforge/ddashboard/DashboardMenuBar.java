/*
 * $Id$
 *
 * (c) Copyright 2013 Adam W. Dace.  All Rights Reserved.
 * Please see the accompanying COPYING file for license information.
 */

package net.sourceforge.ddashboard;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import net.sourceforge.ddashboard.*;

class DashboardMenuBar
{
    private final static String APPLICATION_NAME = "Desktop Dashboard";

    public DashboardMenuBar()
    {
    }

    public JMenuBar createMenuBar()
    {
        JMenu myEditMenu;
        JMenu myHelpMenu;
        JMenuBar myMenuBar;
        JMenuItem myCopyMenuItem;
        JMenuItem myMenuItem;

        myCopyMenuItem = new JMenuItem("Copy");
        myEditMenu = new JMenu("Edit");
        myHelpMenu = new JMenu("Help");

        myMenuBar = new JMenuBar();
        myMenuBar.add(myEditMenu);
        myMenuBar.add(myHelpMenu);

        myCopyMenuItem.setAccelerator(KeyStroke.getKeyStroke('C', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
        myEditMenu.add(myCopyMenuItem);
        myHelpMenu.add(new JMenuItem(APPLICATION_NAME + " Help"));

        //JMenuItem item = new JMenuItem(editItems[i]);
        // item.setAccelerator(KeyStroke.getKeyStroke(editShortcuts[i],
        //      Toolkit.getDefaultToolkit(  ).getMenuShortcutKeyMask(  ), false));

        //myMenuItem.addActionListener(new ActionListener()
        //    {
        //        public void actionPerformed(ActionEvent e)
        //        {
        //            System.exit(0);
        //        }
        //    });

        //myMenuItem = myAboutMenu.add(new JMenuItem("About DesktopDashboard"));

        return myMenuBar;
    }
}
