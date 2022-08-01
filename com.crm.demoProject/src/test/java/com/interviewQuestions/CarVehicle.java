package com.interviewQuestions;

import org.apache.poi.util.SystemOutLogger;

public class CarVehicle {
	public static void main(String[] args) {
		
		String s ="carbikevehiclecarbikescootercar";
		int count =0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='c' && s.substring(i, i+3).equals("car"))
			{
					count++;
		  }
	
	}
		System.out.println("Number of car in string are: " + count);
	
	

}
}
