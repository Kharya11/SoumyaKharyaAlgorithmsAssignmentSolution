package com.dsAssignement2.model;

public class Searching {
	
	//Linear search to search a stock price
	
	public void searchValue(double[] array,double value) {
		boolean status = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				System.out.println("Stock of value "+value+" is present");
				status = true;
			}
		}if (status == false) {
			System.out.println("Given Stock not found");
		}
	}
}
