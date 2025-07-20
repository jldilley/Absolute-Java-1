/*Name: Joshua Dilley
Date: 07/20/2025
Source Code: DecimalFormatDemo.java
Action: This is an example code from Absolute Jave 6th Edition that shows how to 
utilize the class DecimalFormat pulled from the java.text library.
*/
package absolutejava;

import java.text.DecimalFormat;

public class DecimalFormatDemo 
{
    public static void main(String[] args) 
    {
        DecimalFormat Pattern00dot000 = new DecimalFormat("00.000");
        DecimalFormat Pattern0dot00 = new DecimalFormat("0.00");
        
        double d = 12.3456789;
        System.out.println("Pattern 00.000");
        System.out.println(Pattern00dot000.format(d));
        System.out.println("Pattern 0.00");
        System.out.println(Pattern0dot00.format(d));
        
        double Money = 19.8;
        System.out.println("Pattern 0.00");
        System.out.println("$" + Pattern0dot00.format(Money));
        
        DecimalFormat Percent = new DecimalFormat("0.00%");
        
        System.out.println("Pattern 0.00%");
        System.out.println(Percent.format(0.308));
        
        DecimalFormat eNotation1 = new DecimalFormat("#0.###E0"); //1 or 2 digits before point
        DecimalFormat eNotation2 = new DecimalFormat("00.###E0"); // 2 digits before point
        
        System.out.println("Pattern #0.###E0");
        System.out.println(eNotation1.format(123.456));
        System.out.println("Pattern 00.###E0");
        System.out.println(eNotation2.format(123.456));
        
        double SmallNumber = 0.0000123456;
        System.out.println("Pattern #0.###E0");
        System.out.println(eNotation1.format(SmallNumber));
        System.out.println("Pattern 00.###E0");
        System.out.println(eNotation2.format(SmallNumber));
        
    }    
}
/* *************************Program Output************************************
Pattern 00.000
12.346
Pattern 0.00
12.35
Pattern 0.00
$19.80
Pattern 0.00%
30.80%
Pattern #0.###E0
1.2346E2
Pattern 00.###E0
12.346E1
Pattern #0.###E0
12.346E-6
Pattern 00.###E0
12.346E-6
*/
