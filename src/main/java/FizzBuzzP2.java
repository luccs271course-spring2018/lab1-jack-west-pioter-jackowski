import java.util.Scanner;


public class FizzBuzzP2 {
    public static void FizzBuzz(int n)
    {



        if(n< 1)
        {
            System.out.println("Invalid number");
        }

        for (int i = 0; i < n+1; i++)
        {
            int index = i;
            if(index > 1 && index%3==0 && index%5 != 0)
            {
                System.out.println("Fizz");
                //The continues are used as a way to be sure that once a number was found to be fizz or buzz or both
                //That it wouldnt have to go through the rest of the loop
                continue;
            }
            else if(index > 1 && index%3!=0 && index%5 == 0)
            {
                System.out.println("Buzz");
                continue;
            }
            else if(index > 1 && index%3==0 && index%5 == 0)
            {
                System.out.println("Fizz-Buzz");
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }


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
            //This if Statement checks the ascii decimal value to see if it is a number or a letter.
            //If it is any letter the program will end
            if(str.charAt(0) >= 57)
            {
                TF = false;
                break;
            }else
                n= Integer.parseInt(str);
            FizzBuzz(n);

        }
    }
}
