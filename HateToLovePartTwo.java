/*Name: Joshua Dilley
Date: 08/17/2025
Programming  Project: Absolute Java Chapter Two Problem 9
Source Code: HateToLovePArtTwo.java
Action: User inputs a sentence. The program searches the input for the first 
occurence of the word "hate". The program then returns the original sentence
along with the amended sentence that replaces "hate" with "love".
 */
package absolutejava;
import java.util.Scanner;
public class HateToLovePartTwo 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        String Sentence = null, Beginning = null, Ending = null;
        
        System.out.println("Please enter a sentence that includes the word 'hate': ");
        Sentence = Input.nextLine();
        
        int PositionOfHate = Sentence.indexOf("Hate");
        int PositionOfHateLC = Sentence.indexOf("hate");
        
        if(PositionOfHate >= 0)
            Beginning = Sentence.substring(0, PositionOfHate);
        else
            Beginning = Sentence.substring(0, PositionOfHateLC);
        
        if(PositionOfHate >= 0)
            Ending = Sentence.substring(PositionOfHate + "hate".length());
        else
            Ending = Sentence.substring(PositionOfHateLC + "hate".length());
        
        System.out.println("Your orginal, hatefilled sentence is: " + Sentence);
        System.out.println("Your new nicer, more loving sentence is: ");
        
        if(PositionOfHate >=0)
            System.out.println(Beginning + "Love" + Ending);
        else
            System.out.println(Beginning + "love" + Ending);
    }
}
/* *******************************Program Output*******************************
Note: Ending and PositionOfHate were used to help me understand how I needed to write the code. Once 
      I solved the problem, I removed the lines from the program.

Trial 11:
Please enter a sentence that includes the word 'hate': 
hate Pizza, I do not.
Your orginal, hatefilled sentence is: hate Pizza, I do not.
Your new nicer, more loving sentence is: 
love Pizza, I do not.
Ending =  Pizza, I do not.
PositionOfHate = -1

Trial 10:
Please enter a sentence that includes the word 'hate': 
I Hate pizza.
Your orginal, hatefilled sentence is: I Hate pizza.
Your new nicer, more loving sentence is: 
I Love pizza.
Ending =  pizza.
PositionOfHate = 2

Trial 9:
Please enter a sentence that includes the word 'hate': 
Hate is a word I would use to describe how I feel about pizza.
Your orginal, hatefilled sentence is: Hate is a word I would use to describe how I feel about pizza.
Your new nicer, more loving sentence is: 
Love is a word I would use to describe how I feel about pizza.
Ending =  is a word I would use to describe how I feel about pizza.
PositionOfHate = 0

Trial 8:
Please enter a sentence that includes the word 'hate': 
I REALLLYLYLSLDLSL hate pizza.
Your orginal, hatefilled sentence is: I REALLLYLYLSLDLSL hate pizza.
Your new nicer, more loving sentence is: 
I REALLLYLYLSLDLSL love pizza.
Ending =  pizza.
PositionOfHate = -1

Trial 7: 
Please enter a sentence that includes the word 'hate': 
I REALLY hate pizza.
Your orginal, hatefilled sentence is: I REALLY hate pizza.
Your new nicer, more loving sentence is: 
I REALLY loveEALLY hate pizza.
Ending = EALLY hate pizza.
PositionOfHate = -1

Trial 6: 
Please enter a sentence that includes the word 'hate': 
I hate pizza:
Your orginal, hatefilled sentence is: I hate pizza:
Your new nicer, more loving sentence is: 
I loveate pizza:
Ending = ate pizza:
PositionOfHate = -1

Trial 1:
Please enter a sentence that includes the word 'hate': 
Hate is such a strong word.
Your orginal, hatefilled sentence is: Hate is such a strong word.
Your new nicer, more loving sentence is: 
love is such a strong word.

Trial 2:
Please enter a sentence that includes the word 'hate': 
Hate is such a strong word.
Your orginal, hatefilled sentence is: Hate is such a strong word.
Your new nicer, more loving sentence is: 
Love is such a strong word.

Trial 3:
Please enter a sentence that includes the word 'hate': 
I hate pizza.
Your orginal, hatefilled sentence is: I hate pizza.
Your new nicer, more loving sentence is: 
I loveate pizza.

Trial 4:
Please enter a sentence that includes the word 'hate': 
I REALLY hate pizza.
Your orginal, hatefilled sentence is: I REALLY hate pizza.
Your new nicer, more loving sentence is: 
I REALLY loveEALLY hate pizza.

Trial 5:
Please enter a sentence that includes the word 'hate': 
I hate pizza.
Your orginal, hatefilled sentence is: I hate pizza.
Your new nicer, more loving sentence is: 
I loveate pizza.
Ending = ate pizza.




*/

