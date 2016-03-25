import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class PolygonDemo extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.black);
        g.drawString("Hey, a triangle!", 50, 50);
        
        Polygon tri = new Polygon();
        tri.addPoint(100, 100);
        tri.addPoint(100, 300);
        tri.addPoint(200, 300);
        
        g.setColor(Color.blue);
        g.fillPolygon(tri);
        
        Polygon pent = new Polygon();
        //if points are not added in proper order you don't get a pentagon! 
        pent.addPoint(450, 200); //top tip -> clockwise 
        pent.addPoint(500, 250);
        pent.addPoint(475, 350);
        pent.addPoint(425, 350);
        pent.addPoint(400, 250);
        
        g.setColor(Color.green);
        g.fillPolygon(pent);
        
        //used to figure out where the order point should be added for the pentagon
        g.setColor(Color.pink);
        g.drawLine(450, 200, 450, 250);

        Polygon hex = new Polygon();
                
        // use trig to make a regular hexagon
        int radius = 100; // pixels
        int xCenter = 200;
        int yCenter = 500;
        for ( double ang = 0; ang<2*Math.PI; ang=ang+(2*Math.PI)/6.0)
        {
            double xDelta = radius * Math.cos(ang);
            double yDelta = -radius * Math.sin(ang);
            hex.addPoint(xCenter+(int)xDelta, yCenter+(int)yDelta);
        }

        g.setColor(Color.black);
        g.drawPolygon(hex);
        
       Polygon trap = new Polygon();
       trap.addPoint(425, 400);
       trap.addPoint(500, 400);
       trap.addPoint(600, 475);
       trap.addPoint(325, 475);
       
       g.setColor(Color.pink);
       g.fillPolygon(trap);
       
       
       
       //Used to visualize center of hexagon
       g.setColor(Color.red);
       g.drawLine(200, 500, 200, 500);
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Polygon Demo");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new PolygonDemo() );
        win.setVisible(true);
    }

}