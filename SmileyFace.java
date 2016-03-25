import java.awt.*;
import javax.swing.JFrame;
public class SmileyFace extends Canvas{
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 300, 300);
		g.setColor(Color.blue);
		g.fillOval(270, 250, 50, 50);
		g.fillOval(370, 250, 50, 50);
		g.setColor(Color.red);
		g.drawArc(300, 400, 100, 40, 180, 180); //(from left, from right, width, length,start angle, arc length)
		
		
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
		    g.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
		    g.drawString( String.valueOf(Y), 28, Y );
		// lines
		g.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
		    g.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
		    g.drawLine(0,Y,799,Y);    // vertical
	}
	public static void main(String args[]){
		JFrame win = new JFrame("Smiley Face");
		win.setSize(600, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SmileyFace canvas = new SmileyFace();
		win.add(canvas);
		win.setVisible(true);
		
	}
}