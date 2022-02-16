package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//get the input
		System.out.print("---Performance Task---\nHello! Please insert velocity in m/s: ");
		double ivelocity = scan.nextInt();
		System.out.print("Now insert angle in degrees: ");
		int degrees = scan.nextInt();
		boolean flying = true;
		int seconds = 0;
		double xposition = 0;
		double yposition = 0;
		double ymax = Integer.MIN_VALUE;
		
		System.out.println("\nProjectile's path (time will not be accurate when y = 0): \n");
		while (flying) {
			yposition = Math.sin(Math.toRadians(degrees))*seconds*ivelocity-0.5*9.8*(seconds*seconds);
			xposition = Math.cos(Math.toRadians(degrees))*seconds*ivelocity;
			//round to hundredth digit
			yposition = ((int)Math.round(yposition*100))/100;
			xposition = ((int)Math.round(xposition*100))/100;
			//to check if y is below 0 to make sure we don't print a negative number at the end
			ymax = Math.max(ymax, yposition);
			if (yposition >= 0) {
				System.out.println("Time: "+seconds+"s");
				System.out.println("	x-pos: "+xposition+"m");
				System.out.println("	y-pos: "+yposition+"m");
			}
			else {
				flying = false;
				double landingpos = ivelocity*ivelocity*Math.cos(Math.toRadians(degrees))*Math.sin(Math.toRadians(degrees))/4.9;
				landingpos = ((int)Math.round(landingpos*100))/100;
				System.out.println("Time: "+seconds+"s");
				System.out.println("	x-pos: "+landingpos+"m");
				System.out.println("	y-pos: 0m");
				System.out.println("Maximums: ");
				System.out.println("	x-max: "+landingpos+"m");
				System.out.println("	y-max: "+ymax+"m");
			}
			seconds++;
		}
		
		
		
	}
}
