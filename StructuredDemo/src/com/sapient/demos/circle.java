package com.sapient.demos;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			System.out.println("enter radius");
			double radius=scan.nextDouble();
			double per=calPeri(radius);
			System.out.println("perimeter " + per);
			double ar=calcArea(radius);
			System.out.println("area" + ar);
			scan.close();

	}
	public static double calPeri(double radius){
		double per=2*Math.PI * radius;
		return per;
	}
	public static double calcArea(double radius){
		double area=Math.PI*Math.pow(radius, 2);
		return area;
	}
	

}
