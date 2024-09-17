import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserCredentialTracker {
    private static Map<String, String> userCredentials = new HashMap<>();
    private static final String FILE_NAME = "userCredentials.ser";

    public static String LoginOrCreate(char accountChoice) {
        
        String username = null;
        
        if (accountChoice == 'O') {
        loadUserCredentials();

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter username: ");
         username = scnr.nextLine();
        
        //if the username exists then we get the password
        if (userCredentials.containsKey(username)) {

            System.out.print("Enter password: ");
            String password = scnr.nextLine();
            
            //checking if password if correct
             if (password.equals(userCredentials.get(username))) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password. Login failed.");
                
                //terminate the session
                System.exit(0);
                
            }
        }
         else {
            System.out.println("Username not found. Please enter an existing username or create a new account.");
            
            //terminate the session
            System.exit(0);
        }
        
        
        //close scanner
        scnr.close();
        
        System.out.println ("Welcome back " + username +" :)");
        System.out.println ();
        

        
    }//end if
        else if (accountChoice == 'C'){
            Scanner scnr = new Scanner (System.in);
            
            System.out.println("Enter a new username"); 
            username = scnr.nextLine();
            
            System.out.println();
            
            System.out.println("Enter a new password"); 
            String newPassword = scnr.nextLine();
         
            System.out.println();
            System.out.println("Confirm new password"); 
            String confirmPassword = scnr.nextLine();
          
        
            if (confirmPassword.equals(newPassword)){
              //menuOptions(newUsername);
              userCredentials.put(username, newPassword);
              
              saveUserCredentials();
        
          }
          
          else{
                 System.out.println ("Incorrect password. Please reenter the new password.");
                 System.out.println ("Confirm new password"); confirmPassword = scnr.nextLine();
                 
         }
        
        //close scanner
        scnr.close();

    }//end else if 
    
    return username;
    
    }


    private static void loadUserCredentials() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            userCredentials = (HashMap<String, String>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Ignore if the file is not found (first run)
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void saveUserCredentials() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(userCredentials);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
