import java.util.Scanner;


public class FizzBuzzP2 {
    public static void FizzBuzz(int n) {


        if (n < 1) {
            System.out.println("Invalid number");
        }

        for (int i = 1; i < n + 1; i++) {
            int index = i;
            if (index > 1 && index % 3 == 0 && index % 5 != 0) {
                System.out.println("Fizz");
                //The continues are used as a way to be sure that once a number was found to be fizz or buzz or both
                //That it wouldnt have to go through the rest of the loop
                continue;
            } else if (index > 1 && index % 3 != 0 && index % 5 == 0) {
                System.out.println("Buzz");
                continue;
            } else if (index > 1 && index % 3 == 0 && index % 5 == 0) {
                System.out.println("Fizz-Buzz");
                continue;
            } else {
                System.out.println(i);
            }
        }


    }

    public static void main(String args[]) {
        boolean TF = true;
        if (args.length > 1) {
            for (int i = 1; i < args.length; i++) {
                FizzBuzz(Integer.parseInt(args[i]));
            }

        }
        while (TF) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the maximum number for FizzBuzz or 'stop' to end program.");
            //int n = scan.nextInt();
            String str = scan.nextLine();
            if (str.equals("stop")) {
                TF = false;
                break;
            }
            else {
                try {
                    int n = Integer.parseInt(str);
                    // int n = scan.nextInt();
                    FizzBuzz(n);
                } catch (NumberFormatException ex) {
                    System.out.println("This is not a valid character please input a number.");
                }
                int i = 0;
                //This if Statement checks the ascii decimal value to see if it is a number or a letter.
                //If it is any letter the program will end
            }

        }
    }
}

