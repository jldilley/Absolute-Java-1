/*Name: Joshua Dilley
Date: 08/17/2025
Programming Project: Chapter 2 Program 10
Source Code: ThreeItemPriceTable.java
Action: User enters three items along with their quantity and price. The program
calculates the total price and displays a table of pertinent information.
*/

package absolutejava;
import java.util.Scanner;
public class ThreeItemPriceTable 
{
    public static final double SALES_TAX = 0.0625;
    
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        String ItemOneName, ItemTwoName, ItemThreeName;
        int ItemOneQuantity, ItemTwoQuantity, ItemThreeQuantity;
        
        double ItemOnePrice, ItemTwoPrice,ItemThreePrice;
        double ItemOneTotal, ItemTwoTotal, ItemThreeTotal;
        double Subtotal, TaxTotal, FinalTotal;
        
        System.out.println("Please enter item one name, quantity, and price: ");
        ItemOneName = Input.nextLine();
        ItemOneQuantity = Input.nextInt();
        ItemOnePrice = Input.nextDouble();
        Input.nextLine();
        
        System.out.println("Please enter item two name, quantity, and price: ");
        ItemTwoName = Input.nextLine();
        ItemTwoQuantity = Input.nextInt();
        ItemTwoPrice = Input.nextDouble();
        Input.nextLine();
        
        System.out.println("Please enter item three name, quantity, and price: ");
        ItemThreeName = Input.nextLine();
        ItemThreeQuantity = Input.nextInt();
        ItemThreePrice = Input.nextDouble();
        Input.nextLine();
        
        ItemOneTotal = ItemOneQuantity * ItemOnePrice;
        ItemTwoTotal = ItemTwoQuantity * ItemTwoPrice;
        ItemThreeTotal = ItemThreeQuantity * ItemThreePrice;
        Subtotal = ItemOneTotal + ItemTwoTotal + ItemThreeTotal;
        TaxTotal = Subtotal * SALES_TAX;    
        FinalTotal = Subtotal + TaxTotal;
        
        System.out.println("Your bill:");System.out.println(" ");
        System.out.print("Item                          ");
        System.out.println("Quantity  Price      Total     ");
        System.out.printf("%-30s", ItemOneName);
        System.out.printf("%-10d", ItemOneQuantity);System.out.print("$");
        System.out.printf("%-10.2f", ItemOnePrice);System.out.print("$");
        System.out.printf("%-10.2f", ItemOneTotal);System.out.println("");
        System.out.printf("%-30s", ItemTwoName);
        System.out.printf("%-10d", ItemTwoQuantity);System.out.print("$");
        System.out.printf("%-10.2f", ItemTwoPrice);System.out.print("$");
        System.out.printf("%-10.2f", ItemTwoTotal);System.out.println("");
        System.out.printf("%-30s", ItemThreeName);
        System.out.printf("%-10d", ItemThreeQuantity);System.out.print("$");
        System.out.printf("%-10.2f", ItemThreePrice);System.out.print("$");
        System.out.printf("%-10.2f", ItemThreeTotal);System.out.println("");
        System.out.print("Subtotal                                           $");
        System.out.printf("%-10.2f", Subtotal);System.out.println("");
        System.out.print("Sales tax                                          $");
        System.out.printf("%-10.2f", TaxTotal);System.out.println("");
        System.out.print("Final bill                                         $");
        System.out.printf("%-10.2f", FinalTotal);System.out.println("");
    }
    
}
/* ********************************Program Output******************************
Trial 6:
Your bill:
 
Item                          Quantity  Price      Total     
oranges                       3         $0.40      $1.20      
grapes                        1         $1.25      $1.25      
bananas                       1         $2.00      $2.00      
Subtotal                                           $4.45      
Sales tax                                          $0.28      
Final bill                                         $4.73 

Trial 5:
Your bill:
 
Item                          Quantity  Price      Total     
apples                        3         $0.25      $0.75      
pears                         2         $0.30      $0.60      
lemons                        5         $0.35      $1.75      
Subtotal                                           $3.10      
Sales Tax                                          $0.19      
Final bill                                         $3.29 

Trial 4:
Your bill:
 
Item                          Quantity  Price      Total     
a                             3         $0.25      $0.75      
b                             2         $0.50      $1.00      
c                             4         $0.75      $3.00      
Subtotal                                          $4.75      
Sales Tax                                         $0.30      
Final bill                                        $5.05  

Trial 3:
Your bill:
 
Item                          Quantity  Price     Total     
a                             2         $0.63      $1.26      
b                             5         $0.62      $3.10      
c                             1         $1.25      $1.25      
Subtotal                                         $5.61      
Sales Tax                                        $0.35      
Final bill                                       $5.96  

Trial 2:
Your bill:
 
 
Item                          Quantity  Price     Total     
a                             3         $1.20      $3.60     
b                             2         $3.50      $7.00     
c                             6         $1.80      $10.80    
Subtotal                                         $21.40     
Sales Tax                                        $1.34      
Final bill                                       $22.74  

Trial 1:
Your bill:
 
 
Item                          Quantity  Price     Total     
asparagus                     2         2.75      5.50      
lemons                        1         5.30      5.30      
ground beef                   2         7.00      14.00     
Subtotal                                          24.80     
Sales Tax                                         1.55      
Final bill                                        26.35 
*/