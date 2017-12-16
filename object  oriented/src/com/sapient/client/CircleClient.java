package com.sapient.client;
import java.util.Scanner;

import com.sapient.service.Circle;
import com.sapient.service.Interest;


public class CircleClient {

	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		System.out.println("enter  radius");
		double rad = scan.nextDouble();
		Circle obj = new Circle();
		obj.radius = rad;
		
		double per = obj.calPeri();
		double area = obj.calcArea();
		System.out.println("simple " + per);
		System.out.println("compound " + area);
		
		scan.close();

	}

}
