/*
Tower of Hanoi
  Description
    Tower of Hanoi is a mathematical puzzle, where you have three rods and 'n' number of disks of different sizes. 
    The puzzle starts with the disks in ascending order of size on any rod, with the smallest disk being at the top. 
    The goal is to move the entire stack to another rod. 
    However, the following rules must be followed while solving the puzzle:

    Only one disk can be moved at a time.
    Only the uppermost disk on a stack can be moved.
    A larger disk cannot be placed on a smaller disk.

    Let's take the example of n = 2. Assume that the three rods are A, B and C, with A being the source rod (meaning the disks are initially placed on A), 
    B being the auxiliary rod and C being the destination rod. 
    The disks are numbered 1 to n, with disk 1 being the smallest disk and disk n being the largest. 

    The solution will be:
    Move Disk 1 from A to B.
    Move Disk 2 from A to C.
    Move Disk 1 from B to C.

  Input Format:
    The input contains the number of disks.

  Output Format:
    The output contains all the moves required to solve the puzzle. 
    A move consist of the disk number, followed by the rod from which it is to be moved and the rod to which it is moved.

  Sample Test Cases:
    Input:
      2

    Output:
      1 A B
      2 A C
      1 B C

    Input:
      3

    Output:
      1 A C
      2 A B
      1 C B
      3 A C
      1 B A
      2 B C
      1 A C
*/

import java.util.Scanner;

class TowerOfHanoi 
{ 
    static void towerOfHanoi(int n, char source, char dest, char aux) 
    {
        if (n == 1) {
            System.out.println("1 "+source+" "+dest);
            return;
        }
        towerOfHanoi(n - 1, source, aux, dest);
        
        System.out.println(n + " " + source +" " + dest );
        
        towerOfHanoi(n - 1, aux, dest, source);
    } 
      
    public static void main(String args[]) 
    { 
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B'); 
    } 
} 
