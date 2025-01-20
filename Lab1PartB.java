/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlab;

/**Name:Joshua Dilley
 * Date: 01/19/2025
 * Lab #:1
 * Problem #:Part B
 * Source Code:Lab1PartB.java
 * Class:Online Section 35101
 * Action: Calculate a sum
 */
import java.util.Scanner;

public class Lab1PartB {
   
    public static void main(String[] args)
    {
        int X, Y;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Enter first number ");
        X = Input.nextInt();
        System.out.print("Enter second number");
        Y = Input.nextInt();
        
        System.out.println("Sum = " + (X+Y));
      
    }
}
//Sample output here
//Enter first number 30
//Enter second number90
//Sum = 120