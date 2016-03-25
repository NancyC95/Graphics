import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class BoringTriangle extends Canvas{
	public void paint(Graphics g){
		Polygon tri = new Polygon();
		tri.addPoint(100, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);
		
		Color lavender = new Color(219, 174, 245);
		g.setColor(lavender);
		g.fillPolygon(tri);
	}
	public static void main(String[] args){
		JFrame win = new JFrame();
		win.setSize(400, 400);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoringTriangle canvas = new BoringTriangle();
		win.add(canvas);
		win.setVisible(true);
		
	}

}
