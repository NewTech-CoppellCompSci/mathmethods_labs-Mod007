package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---Problem 1---\nEnter Any Positive Integer: ");
		int integer1 = scan.nextInt();
		System.out.println("Enter Another Positive Integer: ");
		int integer2 = scan.nextInt();
		//the magic behind the scenes
		int integerPow = (int)(Math.pow(integer1, integer2));
		System.out.println(integer1+"^"+integer2+" = "+integerPow);
	}
	
	public static void problem02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---Problem 2---\nEnter Any Positive Integer: ");
		int integer = scan.nextInt();
		int integerSim = (int)(Math.sqrt(integer))*10;
		integerSim /= 10;
		double integerSQRT = Math.sqrt(integer);
		System.out.println("The square root of "+integer+" is "+integerSQRT
				+"\nThe simplification is "+integerSim);
	}

	public static void problem03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---Problem 3---\nLength A of triangle: ");
		int integer1 = scan.nextInt();
		System.out.println("Length B of triange: ");
		int integer2 = scan.nextInt();
		//shaboom
		double integer1SQ = Math.pow(integer1, 2);
		double integer2SQ = Math.pow(integer2, 2);
		double hypotenuseSQ = integer1SQ + integer2SQ;
		double hypotenuse = Math.sqrt(hypotenuseSQ);
		System.out.println("Hypotenuse: "+hypotenuse);

	}

	
	public static void problem04() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---Problem 4---");
		int integer = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (integer != 0){
			System.out.println("Enter an integer: ");
			integer = scan.nextInt();
			max = Math.max(max, integer);
			min = Math.min(min, integer);
		}
		System.out.println("Max: "+max+"\nMin: "+min);
		
		
	}
	
	
	
	
	
	
}
