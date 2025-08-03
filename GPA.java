/*Name: Joshua Dilley   
Date: 08/03/2025
Source Code: GPA.java
Action: Calculate GPA according to the programming project from Absolute Java
6th Edition
*/
package absolutejava;
import java.util.Scanner;
public class GPA 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        float GPA = 0, Percentage = 0;
        
        System.out.print("Please enter your grade percentage to calculate ");
        System.out.print("your GPA: ");
        Percentage = Input.nextFloat();
        
        GPA = (Percentage/100)*4;
        
        System.out.println("Your GPA is (" + Percentage + "/100) * 4 = " + GPA);
    }
}
/* ********************************Program Output******************************
Please enter your grade percentage to calculate your GPA: 85
Your GPA is (85.0/100) * 4 = 3.4

Please enter your grade percentage to calculate your GPA: 100
Your GPA is (100.0/100) * 4 = 4.0

Please enter your grade percentage to calculate your GPA: 90
Your GPA is (90.0/100) * 4 = 3.6

Please enter your grade percentage to calculate your GPA: 80
Your GPA is (80.0/100) * 4 = 3.2
*/