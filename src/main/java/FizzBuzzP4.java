import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzP4 {
    public static List<Object> FizzBuzz(int n)
    {
        //Because I wanted to have a array to keep track of both ints and Strings, the object array seemed to be the
        //best option
        List<Object> fizzBuzz = new ArrayList<>();

        if(n< 1)
        {
            System.out.println("Invalid number");
        }

        for (int i = 0; i < n+1; i++)
        {
            int index = i;
            if(index > 1 && index%3==0 && index%5 != 0)
            {
                fizzBuzz.add(i,"Fizz");
                //The continues are used as a way to be sure that once a number was found to be fizz or buzz or both
                //That it wouldnt have to go through the rest of the loop
                continue;
            }
            else if(index > 1 && index%3!=0 && index%5 == 0)
            {
                fizzBuzz.add(i,"Buzz");
                continue;
            }
            else if(index > 1 && index%3==0 && index%5 == 0)
            {
                fizzBuzz.add(i,"Fizz-Buzz");
                continue;
            }
            else
            {
                fizzBuzz.add(i,i);
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
            List<Object> tempList = FizzBuzzP4.FizzBuzz(n);
            for(int i = 0; i < tempList.size(); i++)
            {
                System.out.println(tempList.get(i));
            }

        }
    }
}
