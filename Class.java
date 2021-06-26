package EmployeeList;

import java.util.Scanner;

public class Text {
private String a;	
private int j=0;
private int k=0;

	
	public void textanalyze()
	{
		
		System.out.printf("Enter String:");
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		
		for(int i=0;i<a.length();i++)
		{
			
			char c=a.charAt(i);
			
			if(c>='A' && c<='Z')
			{
				j++;
			}
			
			if(c>='a' && c<='z')
			{
				k++;
			}
			
			
		}

		}
	
	public void Display()
	{
		System.out.printf("\nSmall Word   : %d",k);
		System.out.printf("\nCapital Word : %d",j);
	}
	
	
	

}
