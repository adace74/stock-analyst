/*
 * $Id$
 *
 * (c) Copyright 2013 Adam W. Dace.  All Rights Reserved.
 * Please see the accompanying COPYING file for license information.
 */

package net.sourceforge.ddashboard;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

public class DashboardJInternalFrame extends JInternalFrame
{  
    static int openFrameCount = 0;
    static final int offset = 30;

    public DashboardJInternalFrame()
    {
	super("Untitled", false, false, false, false);
	openFrameCount++;

	JPanel top = new JPanel();
	top.setBorder(new EmptyBorder(10, 10, 10, 10));
	top.setLayout(new BorderLayout());

	//JTextArea content = new JTextArea( 15, 45 );
	//content.setBorder( new EmptyBorder(0,5 ,0, 5) );
	//content.setLineWrap(true);

	//JScrollPane textScroller = new JScrollPane(content, 
        //				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
        //				   JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
	//top.add( textScroller, BorderLayout.CENTER);

        JButton content = new JButton("Test");
        top.add(content);

	setContentPane(top);
	pack();
	setLocation( offset * openFrameCount, offset *openFrameCount);
    }

    // What does this even do?

    /*
    class LabeledPairLayout implements LayoutManager
    {
        Vector labels = new Vector();
        Vector fields = new Vector();
      
        int yGap = 2;
        int xGap = 2;

        public void addLayoutComponent(String s, Component c)
        {
            if (s.equals("label"))
            {
                labels.addElement(c);
            }
            else
            {
                fields.addElement(c);
            }
        }

        public void layoutContainer(Container c)
        {
            Insets insets = c.getInsets();
	  
            int labelWidth = 0;
            Enumeration labelIter = labels.elements();
            while(labelIter.hasMoreElements())
            {
                JComponent comp = (JComponent)labelIter.nextElement();
                labelWidth = Math.max( labelWidth,
                                       comp.getPreferredSize().width );
            }

            int yPos = insets.top;

            Enumeration fieldIter = fields.elements();
            labelIter = labels.elements();
            while(labelIter.hasMoreElements() && fieldIter.hasMoreElements())
            {
                JComponent label = (JComponent)labelIter.nextElement();
                JComponent field = (JComponent)fieldIter.nextElement();
                int height = Math.max(label.getPreferredSize().height,
                                      field.getPreferredSize().height);
                label.setBounds( insets.left, yPos, labelWidth, height ); 
                field.setBounds( insets.left + labelWidth + xGap, 
				 yPos, 
				 c.getSize().width - (labelWidth +xGap + insets.left + insets.right), 
				 height ); 
                yPos += (height + yGap);
            }
        }

        public Dimension minimumLayoutSize(Container c)
        {
            Insets insets = c.getInsets();
	  
            int labelWidth = 0;
            Enumeration labelIter = labels.elements();
            while(labelIter.hasMoreElements())
            {
                JComponent comp = (JComponent)labelIter.nextElement();
                labelWidth = Math.max( labelWidth,
                                       comp.getPreferredSize().width );
            }

            int yPos = insets.top;

            labelIter = labels.elements();
            Enumeration fieldIter = fields.elements();
            while(labelIter.hasMoreElements() && fieldIter.hasMoreElements())
            {
                JComponent label = (JComponent)labelIter.nextElement();
                JComponent field = (JComponent)fieldIter.nextElement();
                int height = Math.max(label.getPreferredSize().height,
                                      field.getPreferredSize().height);
                yPos += (height + yGap);
            }
            return new Dimension( labelWidth * 3 , yPos );
        }
  
        public Dimension preferredLayoutSize(Container c)
        {
            Dimension d = minimumLayoutSize(c);
            d.width *= 2;
            return d;
        }
   
        public void removeLayoutComponent(Component c) {}
    }
    */
}
