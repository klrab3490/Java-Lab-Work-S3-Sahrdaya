import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MouseEvents" width=300 height=100>
</applet>
*/
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
	String msg = "";
	int mouseX = 0, mouseY = 0; // coordinates of mouse
	public void init() {     
		addMouseListener(this);    
		addMouseMotionListener(this);  
	}
// Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {    
		mouseX = 0; // save coordinates    
		mouseY = 10;   
		msg = "Mouse clicked.";    
		repaint(); 
	}
// Handle mouse entered.
	public void mouseEntered(MouseEvent me) {
		mouseX = 0;// save coordinates
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}
// Handle mouse exited.
	public void mouseExited(MouseEvent me) {
		mouseX = 0;// save coordinates
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
	}
// Handle button pressed.
	public void mousePressed(MouseEvent me) {     
		mouseX = me.getX();// save coordinates     
		mouseY = me.getY();
		msg = "Down";    
		repaint();  
	}
// Handle button released.
	public void mouseReleased(MouseEvent me) {    
		mouseX = me.getX();
		mouseY = me.getY();    
		msg = "Up";
		repaint();  
	} 
// Handle mouse dragged.
	public void mouseDragged(MouseEvent me) {    
		mouseX = me.getX();    
		mouseY = me.getY();   
		msg = "*";  
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);    
		repaint(); 
	}
// Handle mouse moved.  
	public void mouseMoved(MouseEvent me) {    
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY()); // show status  
	}
// Display msg in applet window at current X,Y location.
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
}
