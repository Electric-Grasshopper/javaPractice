/*
Sum of n-terms of a GP
  Description
    GP stands for Geometric Progression. 
    A GP is a sequence of numbers where each new term is found by multiplying the previous term by a fixed number 
    (called the common ratio, denoted by 'r'). The first term of a GP is denoted by 'a'.

    For example, the GP for a = 3, r = 2 looks like this:
    3, 6, 12, 24, 48...

    You need to find the sum of the first n terms of a GP and return the result mod m (result % m).

  Input Format:
    The input contains the numbers a, r, n and m.

  Output Format:
    The output contains the sum of the first n terms of the GP mod m.

  Sample Test Cases:
    Input:
      3 2 10000 1000

    Output:
      253

    Input:
      2 2 100 10000

    Output:
      1502
*/

import java.util.Scanner;

public class SumOfGP
{
    // Method to calculate the sum recursively 
    static long SumGPUtil(long r, long n, long m)
    { 
        // Base cases 
        if (n == 0) { return 1; }
        if (n == 1) { return (1 + r) % m; }
          
        long ans;
         
        // If n is odd 
        if (n % 2 == 1) { ans = (1 + r) *  SumGPUtil((r * r) % m, (n - 1) / 2, m); 
        } else { // If n is even 
            ans = 1 + (r * (1 + r) * SumGPUtil((r * r) % m, (n / 2) - 1, m));
        }
        return (ans % m);
    }

    static long gp(long a, long r, long n, long m)  
    {
        long sumOfGP;
        sumOfGP = a * SumGPUtil(r, n, m);
        sumOfGP = sumOfGP % m; 
        
        return sumOfGP; 
    } 
    
    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();
        
        System.out.println(gp(a, r, n, m) + "\n" );
    }
}
