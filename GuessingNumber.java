
package guessing.number;
import java.util.*;
/**
 *
 * @author Sakib Sadri
 */
public class GuessingNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num=1+(int)(100*Math.random());
      int k=5;
      int i, guess;
        System.out.println("A number is Chosen " + "between 1 to 100 " +"Guess the number" + "Within 5 trials : ");
        for(i=0; i<k; i++) 
        {
            System.out.println("Guess the number");
            guess =sc.nextInt();
            if(num==guess)
            {
                System.out.println("Congratulations !" + "You guessed the number");
            }
             else if( num > guess && i !=k-1)
             {
                 System.out.println("The Number is " + "Greater Than  " + guess);      
             }
            else if( num < guess && i !=k-1)
             {
                 System.out.println("The Number is " + "Less than" + guess);      
             }
            
          }
        if(i==k)
        {
            System.out.println("You have exhausted " + " K trials.");//SAKIB_SADRI
            System.out.println("The Number Was" + num);
        }    
    }
    
    
}
