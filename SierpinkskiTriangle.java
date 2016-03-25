//Creates a Sierpinksi Triangle 
import java.awt.*;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Random;
public class SierpinkskiTriangle extends Canvas{
	public void paint (Graphics g){
		Random r = new Random();
		int x1 = 512;
		int y1 = 109;
		
		int x2 = 146;
		int y2 = 654;
		
		int x3 = 876;
		int y3 = 654;
		
		int x = 512;
		int y = 382;
		
		int num = 1;
		int dx = 0;
		int dy = 0;
		
		g.drawLine(x,y,x,y);
		
		while (num < 50001){
			//Thread.sleep(2000);
			int random = 1+r.nextInt(3);
			if(random == 1){
				dx = x - x1;
				dy = y - y1;
			}
			if (random == 2){
				dx = x - x2;
				dy = y - y2;
			}
			if (random == 3){
				dx = x - x3;
				dy = y - y3;
			}
			x = x - dx/2;
			y = y - dy/2;
			
			g.drawLine(x, y, x, y);
			num++;
		}
		g.drawString("Sierpinski Triangle", 462,484);
	}
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setSize(1024, 768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SierpinkskiTriangle canvas = new SierpinkskiTriangle();
		win.add(canvas);
		win.setVisible(true);
		
	}

}
