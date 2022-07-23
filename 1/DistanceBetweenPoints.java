import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class DistanceBetweenPoints
{
	public static void main (String args[])
	{
		int x1,y1, x2,y2; float d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the x & y co-ordinates of first point : ");
		x1 = s.nextInt();
		y1 = s.nextInt();
		System.out.print("Enter the x & y co-ordinates of second point : ");
		x2 = s.nextInt();
		y2 = s.nextInt();

		d = (float)Math.sqrt( Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1), 2) );
		System.out.println("The distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + d);
	}
}
