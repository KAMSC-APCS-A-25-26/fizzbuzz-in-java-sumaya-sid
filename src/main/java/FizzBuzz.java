import java.util.Scanner;
public class FizzBuzz {
    /**
     * Print the FizzBuzz sequence for 1..100 to standard output.
     * Rules:
     * - Multiples of 3 -> "Fizz"
     * - Multiples of 5 -> "Buzz"
     * - Multiples of both 3 and 5 -> "FizzBuzz"
     * - Otherwise -> the number itself
     * Output should be 100 whitespace-separated tokens (spaces or newlines are fine).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int j=1;j<101;j++)
        {
            if(j%3==0)
            {
                System.out.println ("Fizz");
            }
            if (j%5==0)
            {
                System.out.println("Buzz");
            }
            if (j%3 != 0 & j%5 != 0)
            {
                System.out.println (j);
            }
            if (j%3 == 0 & j%5 == 0)
            {
                System.out.println ("FizzBuzz");
            }
        }
    }
}
