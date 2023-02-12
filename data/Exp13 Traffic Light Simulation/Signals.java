/* Needed import only
 * import java.applet.Applet;
 * import java.awt.Checkbox;
 * import java.awt.CheckboxGroup;
 * import java.awt.Color;
 * import java.awt.Graphics;
 * import java.awt.event.ItemEvent;
 * import java.awt.event.ItemListener;
 * 
 * In windows please install the jdk1.8.0_341
 * I will attach the software in in this folder
 *  
 * To get output insside the jdk1.8.0_341 if java is previosuly installed 
 * 		1]run javac Signals.java
 *		2]appletviwer Signals.java	 
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Signals" width=400 height=250></applet>*/
public class Signals extends Applet implements ItemListener
{
	String msg="";
	Checkbox stop,ready,go;
	CheckboxGroup cbg;
	public void init()
	{
		cbg = new CheckboxGroup();
		stop = new Checkbox("Stop",cbg,false);
		ready = new Checkbox("Ready",cbg,false);
		go = new Checkbox("Go",cbg,false);
		add(stop);
		add(ready);
		add(go);
		stop.addItemListener(this);
		ready.addItemListener(this);
		go.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg = cbg.getSelectedCheckbox().getLabel();
		g.drawOval(165,40,50,50);
		g.drawOval(165,100,50,50);
		g.drawOval(165,160,50,50);
		if(msg.equals("Stop"))
		{
			g.setColor(Color.red);
			g.fillOval(165,40,50,50);
		}
		else if(msg.equals("Ready"))
		{
			g.setColor(Color.yellow);
			g.fillOval(165,100,50,50);
		}
		else
		{
			g.setColor(Color.green);
			g.fillOval(165,160,50,50);
		}
	}
}