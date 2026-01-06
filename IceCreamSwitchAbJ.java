/*Name: Joshua Dilley
Date: 1/05/2025
Compiler: Apache NetBeans IDE 24
Project: Absolute Java 5th Edition Example 3.2
Action: example displaying how a bsic switch statement works. It's my own 
variation of the example

 */
package absolutejava;
import java.util.Scanner;
public class IceCreamSwitchAbJ 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        char FlavorChoice;
        char Choice;
        do
        {
            System.out.print("Enter a 1, 2, or 3 to choose your flavor: ");
            FlavorChoice = Input.next().charAt(0);
            
            switch(FlavorChoice)
            {
                case '1':System.out.println("Vanilla (my favorite)");break;
                case '2':System.out.println("Strawberry");break;
                case '3':System.out.println("Chocolate (good, but overrated)");break;
                default:System.out.println("error");
            }    
          
            System.out.print("Y to pick another flavor. Any other key to quit: ");
            Choice = Input.next().charAt(0);
        }    
        while(Character.toUpperCase(Choice)== 'Y');
        
        System.out.println("Enjoy your ice cream. \n");
        
    }
}
/* ***********************************Program Output***************************
run:
Enter a 1, 2, or 3 to choose your flavor: o
error
Y to pick another flavor. Any other key to quit: y
Enter a 1, 2, or 3 to choose your flavor: 1
Vanilla (my favorite)
Y to pick another flavor. Any other key to quit: y
Enter a 1, 2, or 3 to choose your flavor: 2
Strawberry
Y to pick another flavor. Any other key to quit: y
Enter a 1, 2, or 3 to choose your flavor: 3
Chocolate (good, but overrated)
Y to pick another flavor. Any other key to quit: n
Enjoy your ice cream.    
******************************************************************************/ 