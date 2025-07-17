/*Name: Joshua Dilley
Date: 07/17/2025
Source Code: CurrencyFomatDemo.java
Action: This is a demo program from Absolute Java 6th. It demonstrates number 
and curency formats, as well as touching on the topic of Locale and class.
*/
package absolutejava;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Without formatting: ");
        
        System.out.println(19.8);
        System.out.println(19.81111);
        System.out.println(19.89999);
        System.out.println(19);
        System.out.println("");
        
        System.out.println("Default location: ");
        NumberFormat MoneyFormatter = NumberFormat.getCurrencyInstance();
        
        System.out.println(MoneyFormatter.format(19.8));
        System.out.println(MoneyFormatter.format(19.81111));
        System.out.println(MoneyFormatter.format(19.89999));
        System.out.println(MoneyFormatter.format(19));
        System.out.println("");
        
        System.out.println("US as location: ");
        NumberFormat MoneyFormatter2 = NumberFormat.getCurrencyInstance(Locale.US);
        
        System.out.println(MoneyFormatter2.format(19.8));
        System.out.println(MoneyFormatter2.format(19.81111));
        System.out.println(MoneyFormatter2.format(19.89999));
        System.out.println(MoneyFormatter2.format(19));
    }
}
/* ***********************Progrma Output***************************************

*/