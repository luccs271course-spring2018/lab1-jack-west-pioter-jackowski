import java.util.ArrayList;
import java.util.Arrays;
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
            return Arrays.asList("Invalid number");
        }

        for (int i = 0; i < n; i++)
        {
            int index = i+1;
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
                fizzBuzz.add(i,index);
            }
        }
        return fizzBuzz;

    }

    public static void main(String args[]) {
        // This boolean variable is to make sure the while loop is running for user input
        boolean TF = true;
        //This if and nested for loops will handel command line arguments if there are any
        if (args.length > 1) {
            for (int i = 1; i < args.length; i++) {
                //because the fizzbuzz method returns a array, I want to put that array into a variable and display it
                List<Object> temp = FizzBuzz(Integer.parseInt(args[i]));
                for (int p = 0; p < temp.size(); p++) {
                    System.out.println(temp.get(p));
                }
            }

        }
        while (TF) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the maximum number for FizzBuzz or 'stop' to end program.");
            String str = scan.nextLine();
            //    int str = scan.nextInt();
            if (str.equals("stop")) {
                TF = false;
                break;
            } else {
                try {
                    int n = Integer.parseInt(str);
                    List<Object> tempList = FizzBuzzP4.FizzBuzz(n);
                    for (int i = 0; i < tempList.size(); i++) {
                        System.out.println(tempList.get(i));
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("This is not a valid character please input a number.");
                    continue;
                }
            }
        }
    }
}

