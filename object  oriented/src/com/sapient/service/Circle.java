package com.sapient.service;

public class Circle {
	public double radius;
	public double calPeri(){
		double per=2*Math.PI * radius;
		return per;
	}
	public double calcArea(){
		double area=Math.PI*Math.pow(radius, 2);
		return area;
	}

}
