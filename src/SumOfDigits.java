/*
Sum of Digits (Single Digit Left)
  Description
    You are given a number n. You need to keep finding the sum of its digits until the sum becomes a single digit.

    For example, let's say n = 4651.
    Sum of digits = 4+ 6 + 5 + 1 = 16 (double-digit sum)
    Sum of digits now = 1 + 6 = 7 (single-digit sum)

  Input Format:
    The input contains the number, n.

  Output Format:
    The output contains the single digit sum.

  Sample Test Cases:
    Input:
      4651

    Output:
      7

    Input:
      23

    Output:
      5
*/

import java.util.Scanner;
 
public class SumOfDigits
{
    static int sumOfDigitsSingle(int n) {
        int sum = 0;
        // Loop to do sum while sum is not less than or equal to 9
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    /*
    ALTERNATE METHOD:
    
    static int sumOfDigitsSingle(int n) {
        if (n == 0) { return 0; }
        return (n % 9 == 0) ? 9 : (n % 9);
    }
    */
    
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        System.out.println(sumOfDigitsSingle(n) + "\n" );
    }
}
