/*
  Decimal to Binary
  Description
  You are given a decimal number. Convert the decimal number into the equivalent binary number.

  Input Format:
    The input contains the decimal number.

  Output Format:
    The output contains the binary number.

  Sample Test Cases:
    Input:
      11

    Output:
      1011

    Input:
      5

    Output:
      101
*/

import java.util.Scanner;
 
public class DecToBin
{
    static int decToBin(int n)
    {
        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (n != 0)
        {
            int rem = n % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            n /= 2;
     
            // Count used to store exponent value
            cnt++;
        }
    
        return B_Number;
    }
    
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        System.out.println(decToBin(n) + "\n" );
    }
}
