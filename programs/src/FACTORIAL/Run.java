package FACTORIAL;
import java.util.Scanner;

public class Run {

        // Method to find factorial of the given number
        static int factorial(int n)
        {
            int res = 1;
            for (int i = 2; i <= n; i++)
                res *= i;
            return res;
        }

        // Driver method
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = s.nextInt();
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }
}
