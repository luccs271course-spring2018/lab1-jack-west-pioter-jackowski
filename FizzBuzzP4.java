package Week1;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzzP4 {
	
	public static ArrayList<Object> FizzPart2(int n)
	{
		
		ArrayList<Object> fizzBuzz = new ArrayList<Object>(); 
		
		if(n< 1)
		{
			System.out.println("Invalid number");
		}
		
		for (int i = 0; i < n; i++)
		{
			int index = i;
			if(index > 1 && index%3==0 && index%5 != 0)
			{
				fizzBuzz.add(i, "Fizz");
				continue;
			}
			else if(index > 1 && index%3!=0 && index%5 == 0)
			{
				fizzBuzz.add(i, "Buzz");
				continue;
			}
			else if(index > 1 && index%3==0 && index%5 == 0)
			{
				fizzBuzz.add(i, "Fizz-Buzz");
				continue;
			}
			else
			{
				fizzBuzz.add(i, i);
			}
		}
		return fizzBuzz;
		
	}
	
	public static void main(String args[])
	{
		boolean TF = true;
		int n = 0;
		while (TF)
		{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the maximum number for FizzBuzz or 'stop' to end program.");
		String str = scan.nextLine();
		if(str.charAt(0) >= 57)
		{
			TF = false;
			break;
		}else
			n= Integer.parseInt(str);
		ArrayList<Object> tempArray = FizzBuzzP4.FizzPart2(n);
		for(int i = 0; i < tempArray.size(); i++)
		{
			System.out.println(tempArray.get(i));
		}
		
		}
	}

}
