/*
Replace With Product of Remaining Elements
  Description
    You are given an array of integers. You need to replace each element with the product of the remaining elements.
    You are not allowed to use division operators.

    For example: Consider the array {1, 2, 3, 4, 5};
    Product of the other elements except 1 = 2 * 3 * 4 * 5 = 120
    Product of the other elements except 2 = 1 * 3 * 4 * 5 = 60
    Product of the other elements except 3 = 1 * 2 * 4 * 5 = 40
    Product of the other elements except 4 = 1 * 2 * 3 * 5 = 30
    Product of the other elements except 5 = 1 * 2 * 3 * 4 = 24

  Hence, the output would be {120, 60, 40, 30, 24}.

  Input Format:
    The input contains the number of integers in the array, followed by the integers in the array.

  Output Format:
    The output contains an array of integers where each element has been replaced with the product of the remaining elements.

  Sample Test Cases:
    Input:
      5 1 2 3 4 5

    Output:
      120 60 40 30 24

    Input:
      4 8 3 5 2

    Output:
      30 80 48 120
*/

import java.util.Scanner;

class ReplaceWithProd
{ 
    static void RPRE(int arr[], int n) 
    {
        // Base case
        if (n == 1) {
            System.out.print("0");
            return;
        }
 
        int i, temp = 1;
 
        // Allocate memory for the product array 
        int prod[] = new int[n];
 
        // Initialize the product array as 1 
        for (int j = 0; j < n; j++) { prod[j] = 1; }
        
        // Temp variable contains product of elements on left side excluding arr[i] 
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }
 
        // Initialize temp to 1 for product on right side 
        temp = 1;
 
        // Temp variable contains product of elements on right side excluding arr[i] 
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }
        
        // print the constructed prod array 
        for (i = 0; i < n; i++) { System.out.print(prod[i] + " "); }
        
        return;
    } 
  
    public static void main(String[] args) 
    { 
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        RPRE(arr, n);
    } 
}
