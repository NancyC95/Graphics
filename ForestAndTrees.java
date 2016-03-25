import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class ForestAndTrees extends Canvas
{
	public void paint( Graphics g )
	{
		
		// draws a few single trees for testing
		drawTree(g,30,550);
		drawTree(g,100,580);
		drawTree(g,640,300);
		drawTree(g,730,370);

		// draws the first forest
		g.drawRect(10,10,500,500);
		drawForest(g,10,10,500,500);

		// draws the second forest
		g.drawRect(550,20,400,250);
		drawForest(g,550,20,400,250);

		// draws the third forest
		g.drawRect(200,530,710,160);
		drawForest(g,200,530,710,160);
		// calls drawForest() with the same dimensions as the rectangle above
	}
	public void drawTree(Graphics g, int x, int y){
		Color brown = new Color(112,67,8);
		g.setColor(brown);
		g.fillRect(x+17, y+50, 16, 50);


		Polygon tri = new Polygon();
		tri.addPoint(x+25,y);
		tri.addPoint(x+50, y+75);
		tri.addPoint(x, y+75);
		
		g.setColor(Color.GREEN);
		g.fillPolygon(tri);
	}

	public void drawForest( Graphics g, int x, int y, int w, int h )
	{
		Random r = new Random();
		// creates a box to demonstrate the forest's boundary
		g.setColor(Color.black);
		g.drawRect(x,y,w,h);

		int num = 1;
		while (num < 101){
			int a=0, b=0;
			//To keep the trees within the box!
			a = 1 + r.nextInt(w - 50);
			b = 1 + r.nextInt(h-100);
			num++;
	
			drawTree(g,x+a,y+b);
		}
	}

	public static void main(String[] args)
	{
		JFrame win = new JFrame("ForestAndTrees");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ForestAndTrees() );
		win.setVisible(true);
	}

}