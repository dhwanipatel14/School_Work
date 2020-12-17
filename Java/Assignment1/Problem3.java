/*
 * Impoerted three classes of java.awt package.
 */

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Problem3 {

	public static void main(String[] args) {
		
		/*
		 * @object line1 is of Line2D class that takes two points as input.
		 */
		Line2D line1 = new Line2D.Float(3,12,17,31);
		/*
		 * Used get method to get coordinates of two points of line.
		 */
		System.out.printf("The actual points of line : x1=%4.2f  y1=%4.2f  x2=%4.2f  y2=%4.2f\n",line1.getX1(),line1.getY1(),line1.getX2(),line1.getY2());
		System.out.printf("The expected points of line : x1=%4.2f  y1=%4.2f  x2=%4.2f  y2=%4.2f\n\n",3.0,12.0,17.0,31.0);
		/*
		 * Used set method to change end point of line and also used Point2D class as second parameter.
		 */
		line1.setLine(line1.getP1(),new Point2D.Float(9, 13));
		System.out.printf("The actual points of line : x1=%4.2f  y1=%4.2f  x2=%4.2f  y2=%4.2f\n",line1.getX1(),line1.getY1(),line1.getX2(),line1.getY2());
		System.out.printf("The expected points of line : x1=%4.2f  y1=%4.2f  x2=%4.2f  y2=%4.2f\n\n",3.0,12.0,9.0,13.0);
		/*
		 * @Object eelipse1 is of Ellipse2D class that takes two points as input to inialize ellipse.
		 */
		Ellipse2D ellipse1 = new Ellipse2D.Float(4, 13, 60, 25);
		System.out.printf("The actual points of ellipse : x1=%4.2f  y1=%4.2f  h1=%4.2f  w1=%4.2f\n",ellipse1.getX(),ellipse1.getY(),ellipse1.getHeight(),ellipse1.getWidth());
		System.out.printf("The expeted points of ellipse : x1=%4.2f  y2=%4.2f  h1=%4.2f  w1=%4.2f\n\n",4.0,13.0,25.0,60.0);
		

		
	}

}
