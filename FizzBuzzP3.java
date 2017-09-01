package Week1;


import java.lang.reflect.Array;
import java.util.Scanner;

public class FizzBuzzP3 {
	
	public static Object[] FizzPart2(int n)
	{
		Object fizzBuzz[] = new Object[n+1];
		
		if(n< 1)
		{
			System.out.println("Invalid number");
		}
		
		for (int i = 0; i < fizzBuzz.length; i++)
		{
			int index = i;
			if(index > 1 && index%3==0 && index%5 != 0)
			{
				fizzBuzz[i] = "Fizz";
				continue;
			}
			else if(index > 1 && index%3!=0 && index%5 == 0)
			{
				fizzBuzz[i] = "Buzz";
				continue;
			}
			else if(index > 1 && index%3==0 && index%5 == 0)
			{
				fizzBuzz[i] = "Fizz-Buzz";
				continue;
			}
			else
			{
				fizzBuzz[i] = i;
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
		Object tempArray[] = FizzBuzzP3.FizzPart2(n);
		for(int i = 0; i < tempArray.length; i++)
		{
			System.out.println(tempArray[i]);
		}
		
		}
	}

}
