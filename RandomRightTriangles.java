//Creates 500 random colored right triangles of the same size & shape 
import java.awt.*;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Random;

public class RandomRightTriangles extends Canvas {
	public void paint(Graphics g){
		Random r = new Random();
		
		for(int num = 1; num <= 500; num++){
			int x = 1+r.nextInt(500);
			int y = 1+r.nextInt(500);
			Polygon righttri = new Polygon();
			righttri.addPoint(x, y);
			righttri.addPoint(x, y + 50);
			righttri.addPoint(x+50, y+50);
			
			Color customcolor = new Color(1+r.nextInt(255),1+r.nextInt(255),1+r.nextInt(255));
			g.setColor(customcolor);
			g.fillPolygon(righttri);
		}
	}
	public static void main(String[] args){
		JFrame win = new JFrame();
		win.setSize(600, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RandomRightTriangles canvas = new RandomRightTriangles();
		win.add(canvas);
		win.setVisible(true);
	}

}
