/**
 * Created by jwest1 on 9/1/2017.
 */
import java.lang.reflect.Array;
import java.util.Scanner;

public class FizzBuzzP3 {

    public static Object[] FizzBuzz(int n)
    {
        //Because I wanted to have a array to keep track of both ints and Strings, the object array seemed to be the
        //best option
        Object fizzBuzz[] = new Object[n+1];

        if(n< 1)
        {
            System.out.println("Invalid number");
        }

        for (int i = 1; i < fizzBuzz.length; i++)
        {
            int index = i;
            if(index > 1 && index%3==0 && index%5 != 0)
            {
                fizzBuzz[i] = "Fizz";
                //The continues are used as a way to be sure that once a number was found to be fizz or buzz or both
                //That it wouldnt have to go through the rest of the loop
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
            if(str.charAt(0) >= 57 || str.charAt(0) <= 48)
            {
                TF = false;
                break;
            }else
                n= Integer.parseInt(str);
            Object tempArray[] = FizzBuzzP3.FizzBuzz(n);
            for(int i = 0; i < tempArray.length; i++)
            {
                System.out.println(tempArray[i]);
            }

        }
    }

}
