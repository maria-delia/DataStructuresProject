import java.util.Scanner;
import java.util.Arrays;


public class Main{
    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in); 
        String username = "";
        
        /*Does the user want to create or open an account*/
        System.out.println("                          Personal Library");
        System.out.println();
        System.out.println();
        System.out.println("      Lost in choices? Let my Personal Library guide you to your next");
        System.out.println("           read! Explore a world of diverse books waiting for you.");
        System.out.println(); System.out.println();
        System.out.println("                   To OPEN your account please enter O.");
        System.out.println("                   To CREATE an account please enter C.");
        

        char accountChoice = scnr.next().charAt(0); 
    
        
        
        if (accountChoice == 'O'){ // To open a previousely created account
            username = UserCredentialTracker.LoginOrCreate(accountChoice);  
        
        }//end open
        
        /* To create an account */
         else if (accountChoice == 'C'){
            username = UserCredentialTracker.LoginOrCreate(accountChoice);
                 
         }
        
        
        else{
        System.out.println("                  Incorrect input. Please enter O or C.");
        System.out.println("                   To OPEN your account please enter O.");
        System.out.println("                   To CREATE an account please enter C.");
        AccountOptions.userChoice(accountChoice = scnr.next().charAt(0)); //exeption, user enters an option different from the two
        }                                                                 // and user reenters the input  
        
        

        //looping the dropdown menu
        
        char N; char R; char V; char M; char Q;
        boolean notQ = true;  
        String bookChosen = "";
        
        //create and track link list of a user's book choices
        BookListManager bookListManager = new BookListManager();
         //We used a boolean=true for the while loop to iterate continuosely until the user decides to stop it by pressing the Q button
        while(notQ){
            
            //calling the dropdown
            UserMenuOptions.menuOptions(username);
            char choice = scnr.next().charAt(0);
            

            
            if (choice == 'Q'){
            notQ = false;
            break;
            }
                //implementation of the first option to output menu
                else if (choice == 'N'){
                    
                    bookChosen = DisplayGenreOptions.DisplayGenreMenu();
                    System.out.println ("You have chosen to read " + bookChosen + ".");
                    bookListManager.addBooksFromStrings(bookChosen);
                }    
               //implementation of the next option to update roster
                else if (choice == 'R') {
                    bookListManager.deleteBook();
                    
                }
                else if (choice == 'V')  { 
                    System.out.println();
                    System.out.println("MyList:         " +username+ "'s list of books");
                    System.out.println("______________________________________________");
                    bookListManager.printBookList();
                    System.out.println();
                }
                else if (choice == 'M') {  //implementation of the next option to replace a player in the roaseter by inputing the old jeasry number with a new one and the new rating
                    MostPopularBooks.popularBooks();
                }      

        }//end of looping the dropdown
        
        scnr.close();
        
    }
}
