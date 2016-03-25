import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class RandomEquilateralTriangles extends Canvas{
	public void paint (Graphics g){
		Random r = new Random();
		
		//Creates 500 different colored equilateral triangles of the same size in random locations
		for(int num = 1; num <= 500; num++){
			int x = 1+r.nextInt(500);
			int y = 1+r.nextInt(500);
			Polygon equitri = new Polygon();
			equitri.addPoint(x, y);
			equitri.addPoint(x-20, y + 35);
			equitri.addPoint(x+20, y + 35);
			
			Color customcolor = new Color(1+r.nextInt(255),1+r.nextInt(255),1+r.nextInt(255));
			g.setColor(customcolor);
			g.fillPolygon(equitri);	
		}
		//Creates 500 different colored, randomly sized equilateral triangles in random locations
		for (int num = 1; num <= 500; num++){
			int x = r.nextInt(500 - 25 + 1) + 25;
			int y = 1+r.nextInt(500); 
			int z = 1+r.nextInt(x-10);
			int a = (int)Math.sqrt((2*z*z)-(z*z));
			Polygon equitri = new Polygon();
			equitri.addPoint(x, y);
			equitri.addPoint(x-z, y+a);
			equitri.addPoint(x+z, y+a);
			
			Color customcolor = new Color(1+r.nextInt(255),1+r.nextInt(255),1+r.nextInt(255));
			g.setColor(customcolor);
			g.fillPolygon(equitri);	
		}
		
	
	}
	public static void main(String[] args){
		JFrame win = new JFrame();
		win.setSize(600, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RandomEquilateralTriangles canvas = new RandomEquilateralTriangles();
		win.add(canvas);
		win.setVisible(true);
		
	}

}
