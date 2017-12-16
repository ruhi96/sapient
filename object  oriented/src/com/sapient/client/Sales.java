package com.sapient.client;
import com.sapient.service.SalesPerson;
public class Sales{

	public static void main(String[] args) {
		SalesPerson s1 = new SalesPerson(1001,"ram", 45000);
		SalesPerson s2 = new SalesPerson(1002,"sam", 18000);
		SalesPerson s3 = new SalesPerson(1003,"tom", 40000);
		
		s1.display();
		s2.display();
		s3.display();
		System.out.println("No of persons " + SalesPerson.noOfPersons);
		System.out.println("total sales" + SalesPerson.tsales);
			

	}

}
