package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;
import com.sapient.util.SapUtil;

public class InterestClient {

	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		System.out.println("enter  the amount");
		double pamt = scan.nextDouble();
		System.out.println("enter the years");
		int terms  = scan.nextInt();
		System.out.println("enter the rate");
		float per = scan.nextFloat();
		
		Interest obj = new Interest();
		obj.amt = pamt;
		obj.rate = per;
		obj.years = terms;
		double si = obj.calcSimple();
		double ci = obj.calcCompount();
		System.out.println("simple " +  SapUtil.roundUp2Dec(si));
		System.out.println("compound " + SapUtil.roundUp2Dec(si));
		
		scan.close();
	}

}
