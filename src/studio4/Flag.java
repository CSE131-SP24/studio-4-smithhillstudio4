package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5,0.5,0.5,0.25);
		StdDraw.setPenColor(61,182,109);
		StdDraw.filledRectangle(0.5,0.5,0.5,0.25);
		StdDraw.setPenColor(56,62,242);
		StdDraw.filledCircle(0.5,0.5,0.25);
		
		StdDraw.setPenColor(132,35,105);
		
		for (int i = 3; i !=0; i--)
		{
			double xstart1 = 0;
			double xstart2 = 0.25;
			double ystart1 = 0.75+((0.5/3)*(i-3));
			double ystart2 = (0.75- (0.5/3))+((0.5/3)*(i-3));
			double ystart3 = (ystart1+ystart2)/2;
			double [] x = {xstart1, xstart1, xstart2};
			double [] y = {ystart1, ystart2, ystart3};
			StdDraw.filledPolygon(x, y);
			
			x[0] = 1;
			x[1]=1;
			x[2]= 0.75;
			StdDraw.filledPolygon(x, y);
		}
		StdDraw.setPenColor(190,192,232);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenColor(132,35,105);
		StdDraw.line(0.25, 0.25, 0.25, 0.75);
		StdDraw.line(0.75, 0.25, 0.75, 0.75);
	}
}