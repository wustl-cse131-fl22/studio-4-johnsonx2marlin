package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.4);
		StdDraw.setPenColor(245, 229, 88);
		StdDraw.filledRectangle(0.5, 0.5, 0.15, 0.35);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0.5, 0.77, 0.1, 0.05);
		StdDraw.setPenColor(93, 143, 186);
		StdDraw.filledRectangle(0.5, 0.4, 0.15, 0.25);
		StdDraw.setPenColor(14, 57, 94);
		double[] x = {0.4, 0.5, 0.6};
		double[] y = {0.15, 0.5, 0.15};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(214, 43, 57);
		StdDraw.filledEllipse(0.5, 0.75, 0.07, 0.05);
		StdDraw.filledRectangle(0.5, 0.65, 0.03, 0.1);
	}
}