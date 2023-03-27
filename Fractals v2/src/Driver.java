import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.lang.Math;

public class Driver extends JPanel implements ActionListener {

	/* Attributes a.k.a. Instance Variables */
	int w = 800, h = 800;

	public void paint(Graphics g) {
		super.paintComponent(g);
		// rings(g, 200, 200, 200, 0);
		// rings(g, 200, 0, 200, 0);
		// rings(g, 200, 200, 0, 1);
		// rings(g, 200, 0, 0, 2);
		// rings(g, 200, 200, 200, 3);
		// clover(g, 200, 0, 0);
		// clover(g,200, 200, 0);
		triangle(g, 200, 500, 400);
	}// end of paint method - put code above for anything dealing with drawing -

	public void mystery(Graphics g, int w) {
		g.drawOval(0, 0, w, w);

		if (w > 2) {
			mystery(g, w / 2);
		}
	}

	public void mystery(Graphics g, int x, int y) {
		g.drawLine(0, 0, x, y);
		if (y > 0) {
			mystery(g, x, y/2);
		}
	}

	public void triangle(Graphics g, double x1, /* int x2, int x3, int y1, int y2, int y3, int y2 */ double y1,
			double lvl) {
		if (lvl < 1)
			return;

		g.drawLine((int) x1, (int) y1, (int) (x1 + lvl), (int) y1);
		g.drawLine((int) x1, (int) y1, (int) (x1 + lvl / 2), (int) (y1 - lvl / 21.732));
		g.drawLine((int) (x1 + lvl), (int) y1, (int) (x1 + lvl / 2), (int) (y1 - lvl / 21.732));
		triangle(g, (int) x1, (int) y1, (int) lvl / 2);
		triangle(g, (int) (x1 + lvl / 4), (int) (y1 - lvl / 4 * 1.732), (int) lvl / 2);
		triangle(g, (int) (x1 + lvl / 2), (int) y1, (int) (lvl / 2));

		// double sqrt = (250*Math.sqrt(3));
		// int length = 500;
		// int x1 = length/2;
		// int x2 = length;
		// int x3 = length - length;
		// int y1 = length - length;
		// int y2 = length * (int)sqrt;
		// int y3 = y2;

		// int qx1 = (x1+x2)/2;
		// int qx2 = (x1 + x3)/2;
		// int qx3 = (x2 + x3)/2;
		// int qy1 = (y1 + y2)/2;
		// int qy2 = (y2 +y3)/2;
		// int qy3 = (y3 + y1)/2;

		// if(lvl > 0) {
		// g.drawLine((x1/2) , (y1-y1), x2, y2*(int)sqrt);
		// g.drawLine(x2, y2*(int)sqrt, x3-x3, y3*(int)sqrt);
		// g.drawLine(x3-x3, y3*(int)sqrt, x1 /2, y1-y1);
		// }

		// g.drawLine(x1, y1, x2 + lvl, y2);
		// g.drawLine(x2, y2, x3, y3);
		// g.drawLine(x3, y3, x1, y1);
		// if(lvl >0) {
		// g.drawLine(x1, y1, px1, y2);

//		g.drawLine(250 ,0, 500 ,(int) sqrt);
//		g.drawLine(500, (int)sqrt, 0, (int)sqrt);
//		g.drawLine(0, (int)sqrt, 250, 0);
//		if(lvl >0) {
//			g.drawLine(125, (int)sqrt/2, 375, (int)sqrt/2);
//			g.drawLine(375, (int)sqrt/2, 250, (int)sqrt);
//			g.drawLine(250,(int)sqrt, 125, (int)sqrt/2);
//			lvl--;
//		}
	}

	public void drawTriangle(Graphics g, int lvl) {
		double sqrt = 250 * Math.sqrt(3);
		if (lvl > 0) {
			g.drawLine(250 / 2, (int) sqrt / 2, 375, (int) sqrt / 2);
		}
	}

	public void clover(Graphics g, int radius, int x, int y) {
		g.drawOval(x, y, radius, radius);

		if (radius > 1) {

			clover(g, radius - 10, x + 5, y + 5);
		}

	}

	// this is my clover thing
	public void rings(Graphics g, int radius, int x, int y, int flip) {
		// each method call draws one part of the fractal
		g.drawOval(x, y, radius, radius);

		// each call to the method draw another ring
		// if (radius > 1) {
//			//recursively call the method
		if (x >= 0 && y >= 200 && radius > 1 && flip == 0) {
			rings(g, radius - 10, x + 10, y, flip);

		}
		if (x >= 200 && y >= 0 && radius > 1 && flip == 1) {
			rings(g, radius - 10, x, y + 10, flip);
		}
		if (x >= 0 && y >= 0 && radius > 1 && flip == 2) {
			rings(g, radius - 10, x + 10, y + 10, flip);

		}
		if (x >= 200 && y >= 200 && radius > 1 && flip == 3) {
			rings(g, radius - 10, x, y, flip);

		}
		// rings(g, radius - 10, x, y+10);

	}
	// }
//		}
//		if(flip ==0) {
//			if(x == 0 && y == 0) {
//				if(radius > 1) {
//				rings(g, radius - 10, x, y, flip );
//				}
//			}
//		}
//		if(flip == 1) {
//			if(x == 200 && y == 0) {
//				if(radius>1) {
//				rings(g, radius - 10, x -10, y, flip );
//				}
//			}
//		}
	// if(flip == 1) {

	// }

	public void squares(Graphics g, int length, int x, int y) {
		g.drawRect(0, 0, x, y);
		
		if()
	}

	/**
	 * Update the positions of the ball and paddle. Update the scores, counter and
	 * time
	 */
	
	public void snowflake(Graphics g, int x, int y , int radius ) {
		if(radius < 0) {
			return;
		}
		
	}
	
	
	
	public void update() {

	}// end of update method - put code above for any updates on variable

	// ==================code above ===========================

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}

	public static void main(String[] arg) {
		Driver d = new Driver();
	}

	/* Instantiate any attributes here (instance variables */
	public Driver() {

		JFrame f = new JFrame();
		f.setTitle("Pong");
		f.setSize(w, h);
		f.setBackground(Color.BLACK);
		f.setResizable(false);

		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	Timer t;

}
