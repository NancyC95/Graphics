import java.awt.*;
import javax.swing.JFrame;
public class Circle extends Canvas{
	public void paint (Graphics g){
		g.setColor(Color.green);
		g.fillOval(250,250,100,100);
	}
	public static void main(String[] args){
		JFrame win = new JFrame ("Solid Green Circle");
		win.setSize(500, 500);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Circle canvas = new Circle();
		win.add(canvas);
		win.setVisible(true);
	}
	

}
