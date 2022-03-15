/**
 * Question 9:
 * Write a program to make such a pattern like a pyramid with an asterisk, as show below : 
 *     * 
 *    * * 
 *   * * * 
 *  * * * *
 */

import java.util.Scanner;

public class Question9 {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    
    System.out.print("Enter height of trinagle : ");
    int height = cin.nextInt();
    
    for (int i = 1; i <= height; i++) {
      for (int k = height; k > i; k--)
        System.out.print(" ");
      for (int j = 1; j <= i; j++)
        System.out.print("* ");
      System.out.println();
    }
  }
}
