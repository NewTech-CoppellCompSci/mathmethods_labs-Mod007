package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		// Presets and pre-code/output stuffs
		Scanner scan = new Scanner(System.in);
		//get the input
		System.out.println("---Problem 1---\nHello! Please insert any positive integer below!");
		int integer1 = scan.nextInt();
		System.out.println("Please Insert any other positive integer below!");
		int integer2 = scan.nextInt();
		int max = Math.max(integer1, integer2);
		int min = Math.min(integer1, integer2);
		for (int i = 0; i<10; i++) {
			int rand = (int) (Math.random()*(max-min)+min);
			System.out.print(rand+" ");
		}
	}
	
	public static void problem02() {
		// Presets and pre-code/output stuffs
		Scanner scan = new Scanner(System.in);
		System.out.println("---Problem 2---\nHello! Please insert the radius of your cylinder below!");
		double radius = scan.nextDouble();
		System.out.println("What's the height? Insert below!");
		double height = scan.nextDouble();
		//the math:
		double radiusSQ = Math.pow(radius, 2);
		double volume = (radiusSQ*height)*(Math.PI);
		System.out.println("Your Cylinder's volume is: "+volume);
		
	}


	public static void problem03() {
		Scanner scan = new Scanner(System.in);
		System.out.print("---Problem 3---\nHello! Please insert the coordinates below accordingly."
				+ "\nEnter x1: ");
		double x1 = scan.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = scan.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = scan.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = scan.nextDouble();
		// mathmagician
		double xDelta = x2 - x1; double yDelta = y2 - y1;
		xDelta = Math.pow(xDelta, 2); yDelta = Math.pow(yDelta, 2);
		double distanceSQ = xDelta + yDelta;
		double distance = Math.sqrt(distanceSQ);
		System.out.println("Distance: "+distance);
	}

	
	public static void problem04() {
		Scanner scan = new Scanner(System.in);
		System.out.print("---Problem 4---\nHello! Please insert the coordinates below accordingly."
				+ "\nEnter a: ");
		double a = scan.nextDouble();
		System.out.print("Enter b: ");
		double b = scan.nextDouble();
		System.out.print("Enter c: ");
		double c = scan.nextDouble();
		//oh boy here we go
		double SQRT = Math.pow(b, 2)-(4*a*c);
		if (SQRT < 0) {
			System.out.println("Sorry, the result is a Non-Real Number, no roots found :(");
		}
		else {
			SQRT = Math.sqrt(SQRT);
			double x1 = SQRT+(b*-1);
			x1 = x1/(2*a);
			double x2 = SQRT-(b*-1);
			x2 = x2/(2*a);
			System.out.println("x1: "+x1+"\nx2: "+x2);
		}
	}
	
	

	
}
