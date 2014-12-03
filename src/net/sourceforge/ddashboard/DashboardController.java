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

class DashboardController
{
    private final static String APPLICATION_NAME = "Desktop Dashboard";

    public DashboardController()
    {
    }

    public boolean run()
    {
        DashboardMenuBar myDashboardMenuBar;

        JFrame myJFrame;
        JPanel myJPanel;
        Box myBox;

        JButton myJButton;
        JMenuBar myJMenuBar;

        long myJFrameHeight;
        long myJFrameWidth;
        long myJFramePosHeight;
        long myJFramePosWidth;

        System.out.println("INFO:  Entering GUI code section.");

        // What about other platforms?
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name",
                           APPLICATION_NAME);

        // GUI work
        myJFrame = new JFrame(APPLICATION_NAME);
        myDashboardMenuBar = new DashboardMenuBar();
        myJMenuBar = myDashboardMenuBar.createMenuBar();

        Dimension myScreenSize = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("INFO:  Detected usable screen resolution...appears to be "  +
                           myScreenSize.width + " by " +
                           myScreenSize.height + ".");

        myJFrameWidth = Math.round(myScreenSize.width * 0.95);
        myJFrameHeight = Math.round(myScreenSize.height * 0.95);
        myJFramePosWidth = ((myScreenSize.width - myJFrameWidth) / 2);
        myJFramePosHeight = ((myScreenSize.height - myJFrameHeight) / 2);

        System.out.println("INFO:  Initializing window size to " +
                           myJFrameWidth + " by " + myJFrameHeight + ".");

        // MenuBar
        myJFrame.setJMenuBar(myJMenuBar);

        // JFrame settings
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJFrame.setSize((int) myJFrameWidth,(int) myJFrameHeight);
        myJFrame.setLocation((int) myJFramePosWidth, (int) myJFramePosHeight);

        //myBox = Box.createHorizontalBox();
        //myJFrame.setContentPane(myBox);

        // JPanel
        myJPanel = new JPanel();
        myJPanel.setLayout(new BoxLayout(myJPanel, BoxLayout.Y_AXIS));

        myJButton = new JButton("Date / Time");
        myJButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        myJPanel.add(myJButton);

        myJButton = new JButton("Weather");
        myJButton.setSize(50, 50);
        myJPanel.add(myJButton);

        myJButton = new JButton("Stocks / Other");
        myJButton.setSize(50, 50);
        myJPanel.add(myJButton);

        myJButton = new JButton("News");
        myJButton.setSize(50, 50);
        myJPanel.add(myJButton);

        // Every JFrame needs a JPanel, so it seems.
        myJFrame.add(myJPanel);

        // Runtime
        myJFrame.setVisible(true);

        return true;
    }
}
