package com.dsAssignement2.main;
import java.util.Arrays;
import java.util.Scanner;
import com.dsAssignement2.model.*;

public class main {

	static int count1=0;
	static int count2=0;
	static int choice;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Object creation for model classes
		Sorting2 so=new Sorting2();
		Searching srch=new Searching();
		
		Scanner sc=new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter the no of companies - ");
		int no_comp=sc.nextInt();
		double[] array= new double[no_comp];
		
		for(int i=0; i<no_comp;i++) 
		{
			System.out.println("Enter current stock price of the company "+(i+1));
			array[i]=sc.nextDouble();
			
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean flag=sc.nextBoolean();
			
			if (flag)
			{
				count1Stock();
			}
			else
			{
				count2Stock();
			}
		}
		
		
		
		//Operation menu visible to user
		do 
		{
		System.out.println("\nEnter the operation that you want to perform.");
		System.out.println("---------------------------");
		System.out.println("1.Display the companies stock prices in ascending order");
		System.out.println("2.Display the companies stock prices in descending order");
		System.out.println("3.Display the total no of companies for which stock prices rose today");
		System.out.println("4.Display the total no of companies for which stock prices declined today");
		System.out.println("5.Search a specific stock price");
		System.out.println("6.Press 0 to exit");
		System.out.println("---------------------------");
		
		System.out.println("Enter Choice");
		choice=sc.nextInt();
		
			
			switch(choice) 
			{
			
			  case 1:
				 so.Sort(array, 0, array.length-1,choice);
				System.out.println("Ascending Order--"+ Arrays.toString(array));
				break;
			  
			  case 2:  
				  	so.Sort(array,0, array.length-1,choice);
					System.out.println("Decending Order--"+ Arrays.toString(array));
			  	break;
					  
			  case 3:
				  System.out.println("Total no of companies for which stock prices rose today :- " + count1Stock());  
				  break;
				  
			  case 4:
				  System.out.println("Total no of companies for which stock prices declined today :- " + count2Stock());
				  break;
				  
			  case 5:
				   System.out.println("Enter a stock price to search- ");
				   double srch_val=sc.nextDouble();
				   srch.searchValue(array, srch_val);
				  break;
				  
			  case 6:
				  System.out.println("Exited successfully");
				  System.exit(1);
			
			} 
				
		}
		while(choice!=6);
		sc.close();
	}

	//Methods to keep the count of true and false
	private static int count2Stock() {
		// TODO Auto-generated method stub
		return count2++;
	}

	private static int count1Stock() {
		// TODO Auto-generated method stub
		return count1++;
	}

	
}
