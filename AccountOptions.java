import java.util.Scanner;
import java.util.Arrays;
public class AccountOptions{
    
    public static void userChoice(char accountChoice) {
        
        Scanner scnr = new Scanner(System.in);     
        
        if (accountChoice == 'O'){
            UserCredentialTracker.LoginOrCreate(accountChoice);  
        
        }//end open
        
        /* To create an account */
         else if (accountChoice == 'C'){
            UserCredentialTracker.LoginOrCreate(accountChoice);
             
         }
        
        
        else{
        System.out.println("                  Incorrect input. Please enter O or C.");
        System.out.println("                   To OPEN your account please enter O.");
        System.out.println("                   To CREATE an account please enter C.");
        AccountOptions.userChoice(accountChoice = scnr.next().charAt(0));
        }
    }
}


