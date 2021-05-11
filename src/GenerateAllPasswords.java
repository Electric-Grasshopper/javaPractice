/*
  Generate All Passwords
    Description
      You are given a set of characters. You need to generate all possible passwords from them. 
      For this, you need to find all possible permutations of the given characters.

    Input Format:
      The input contains the number of characters, followed by the characters.


    Output Format:
      The output contains all the possible passwords.


    Sample Test Cases:
      Input:
        2 x y

      Output:
        x
        y
        xx
        xy
        yx
        yy
*/

import java.util.Scanner;

class Source 
{
    // int cnt;
    // Recursive helper function, adds/removes characters until len is reached
    static void generate(char[] arr, int i, String s, int len)
    {
        // base case
        if (i == 0) // when len has been reached
        {
            // print it out
            System.out.println(s);
             
            // cnt++;
            return;
        }
 
        // iterate through the array
        for (int j = 0; j < len; j++)
        {
            // Create new string with next character Call generate again until string has reached its len
            String appended = s + arr[j];
            generate(arr, i - 1, appended, len);
        }
        return;
    }
 
    // function to generate all possible passwords
    static void genPW(char[] arr, int len)
    {
        // call for all required lengths
        for (int i = 1; i <= len; i++)
        {
            generate(arr, i, "", len);
        }
    } 
  
    public static void main(String[] args) 
    { 
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = s.next().charAt(0);
        }
        
        genPW(arr, n);
    }
}
