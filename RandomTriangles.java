import java.awt.*;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Random;

public class RandomTriangles extends Canvas{
	public void paint(Graphics g){
		Random r = new Random();
		
		
		
		for (int x= 1; x<= 500; x++){
			Polygon tri = new Polygon();
			tri.addPoint(1+r.nextInt(500),1+r.nextInt(500));
			tri.addPoint(1+r.nextInt(500),1+r.nextInt(500));
			tri.addPoint(1+r.nextInt(500),1+r.nextInt(500));
			
			Color customcolor = new Color (1+r.nextInt(255),1+r.nextInt(255),1+r.nextInt(255));
			g.setColor(customcolor);
			g.fillPolygon(tri);
			
		}
	}
	public static void main(String[] args){
		JFrame win = new JFrame();
		win.setSize(500, 500);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RandomTriangles canvas = new RandomTriangles();
		win.add(canvas);
		win.setVisible(true);
		
		
	}

}
