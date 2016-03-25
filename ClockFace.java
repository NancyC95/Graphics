import java.awt.*;
import javax.swing.JFrame;
public class ClockFace extends Canvas {
	public void paint (Graphics g){
		g.drawOval(150, 150, 300, 300);
		g.fillOval(295, 295, 10, 10);
		g.drawLine(300, 300, 300, 200);
		g.drawLine(300, 300, 250, 360);
		
		//Draws 1-12 for clock
		g.setFont(new Font("Times New Roman", Font.BOLD, 24));
		g.drawString("12",290, 180 );
		g.drawString("6",295,440 );
		g.drawString("3",425,310);
		g.drawString("9",165,310);
		
		g.drawString("1", 360, 200);
		g.drawString("2", 400, 240);
		g.drawString("4", 400, 375);
		g.drawString("5", 360, 425);
		g.drawString("7",230,425);
		g.drawString("8", 180, 375);
		g.drawString("10",180,240 );
		g.drawString("11", 230, 200);
		
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
	public static void main(String[] args){
		JFrame win = new JFrame("Clock");
		win.setSize(500, 500);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ClockFace canvas = new ClockFace();
		win.add(canvas);
		win.setVisible(true);
		
		
	}

}
