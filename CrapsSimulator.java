/*Name: Josh Dilley 
Date: 08/17/26
Compiler: Apache NetBeans IDE 24
Source Code: CapsSimulator.java
Action: Chapter Three Programming Project 2 from Absolute Java 5th edition
 */
package absolutejava;

public class CrapsSimulator 
{
    public static void main(String[] args) 
    {
        int win = 0, loss = 0, rollOne, rollTwo, totalRolls = 1;
        int diceOne, diceTwo;
        double winProbability;        
        
        for(int i = 1; i <= 10000; ++i)
        {
            totalRolls = i;             
            diceOne = (int)(Math.random() * 6) + 1;
            diceTwo = (int)(Math.random() * 6) + 1;      
            rollOne = diceOne + diceTwo;
            
            //first roll
            if(rollOne == 7 || rollOne == 11 )    
                ++win;                         
            else if(rollOne == 2 || rollOne == 3 || rollOne == 12)
                ++loss;
            
            //roll for point
            else
            {
                do
                {
                    diceOne = (int) (Math.random() * 6) + 1;
                    diceTwo = (int) (Math.random() * 6) + 1;      
                    rollTwo = diceOne + diceTwo;  
                }
                while(!(rollTwo == rollOne || rollTwo == 7));
                
                if(rollTwo == rollOne)    
                    ++win;   
                else    
                    ++loss;                    
            }                
        }
        
            winProbability = (double)win/totalRolls * 100;
            System.out.println("Total games = " + totalRolls);
            System.out.println("Wins = " + win);
            System.out.println("Loses = " + loss);
            System.out.printf("Win percentage = " + "%.2f", winProbability);
            System.out.println("%");
            System.out.println();        
    }    
}

/* *****************************Program Output*********************************
Total games = 10000
Wins = 4932
Loses = 5068
Win percentage = 49.32%

Total games = 10000
Wins = 4851
Loses = 5149
Win percentage = 48.51%

Total games = 10000
Wins = 4854
Loses = 5146
Win percentage = 48.54%

Total games = 10000
Wins = 4906
Loses = 5094
Win percentage = 49.06%

******************************************************************************/
