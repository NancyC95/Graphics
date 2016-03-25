//Function for creating Smiley Faces
import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		g.setColor(Color.YELLOW);
		//Face
		g.fillOval(x,y,100,100);
		//Eyes
		g.setColor(Color.BLACK);
		g.fillOval(x+20,y+20,20,20);
		g.fillOval(x+50, y + 20, 20, 20);
		//Smile
		g.drawArc(x+20, y+50, 50, 20, 180, 180);
		
		// Draws a smiling face on the screen, where the point (x,y) is
		//  the upper-left corner of a box containing the face.

		// draw circle for the head

		// draw eyes

		// draw mouth
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}