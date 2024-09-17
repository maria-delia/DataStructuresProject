import java.util.Scanner;

public class DisplayGenreOptions

{ 
    public static String DisplayGenreMenu() {
        Scanner scnr = new Scanner(System.in);
        System.out.println();
        System.out.println("     Explore fresh stories and expand your horizons with our ");
        System.out.println("             latest book collection at the library!");
        System.out.println(); System.out.println();
        System.out.println("\n                  Genre Options:");                                 System.out.println();
        System.out.print("          1. Romance          ");  System.out.println("2. Drama");      System.out.println();
        System.out.println("                   3. Comedy");                                       System.out.println();
        System.out.print("          4. Thriller"); System.out.println("         5. Historical");  System.out.println();
        

        System.out.print("          \nEnter the genre of the book (1-5): ");
        System.out.println();
        
        int genreChoice = scnr.nextInt();
        
        //making sure the entered value is just an int
                while (true) {
            try {
                genreChoice = Integer.parseInt(scnr.nextLine());
                break;
            } catch (NumberFormatException e) { 
                System.out.println("Please confirm your choice. Make sure it is a number from 1-5.");
            }
        } 
        
        String bookTitle = "";
        
        switch (genreChoice) {
            case 1:
                System.out.println("You chose Romance. Enjoy your book!");                        System.out.println();
                System.out.println("1.1- All the light we cannot see - by Anthony Doerr");  
                System.out.println("1.2- Before we were strangers - by Renee Carlino");   
                System.out.println("1.3- Between the ocean and the stars - by Kevin Emerson");    
                System.out.println("1.4- Finding love in Positano - by J.P. Monninger");      
                System.out.println("1.5- Five feet apart - by Rachael Lippincott");     
                System.out.println("1.6- If we ever meet again - by Ana Huang"); 
                System.out.println("1.7- One way ticket - by K.A. Andrews");
                System.out.println("1.8- The fault in our stars - by John Green");  
                System.out.println("1.9- The Notebook - by Nicholas Sparks");  
                System.out.println("1.10- 12 hours to say I love you - by I.A. Ashcroft"); 
                break;
            case 2:
                System.out.println("You chose Drama. Enjoy your book!");                          System.out.println();
                System.out.println("2.1- To Kill a Mockingbird - by Harper Lee");  
                System.out.println("2.2- The Great Gatsby - by F. Scott Fitzgerald");   
                System.out.println("2.3- The Kite Runner - by Khaled Hosseini");    
                System.out.println("2.4- The Book Thief - by Markus Zusak");      
                System.out.println("2.5- The Help - by Kathryn Stockett");     
                System.out.println("2.6- Little Fires Everywhere - Celeste Ng"); 
                System.out.println("2.7- The Nightingale - by Kristin Hannah");
                System.out.println("2.8- A Man Called Ove - by Fredrik Backman");  
                System.out.println("2.9- Educated - Tara Westover");  
                System.out.println("2.10- The Goldfinch - by Donna Tartt"); 
                break;
            case 3:
                System.out.println("You chose Comedy. Enjoy your book!");                         System.out.println();
                System.out.println("3.1- Bossypants - by Tina Fey");  
                System.out.println("3.2- Good Omens - by Neil Gaiman and Terry Pratchett");   
                System.out.println("3.3- Me Talk Pretty One Day - by David Sedaris");    
                System.out.println("3.4- The Hitchhiker's Guide to the Galaxy - by Douglas Adams");      
                System.out.println("3.5- Bridget Jones's Diary - by Helen Fielding");     
                System.out.println("3.6- Where'd You Go, Bernadette - by Maria Semple"); 
                System.out.println("3.7- Lamb: The Gospel According to Biff, Christ's Childhood Pal - by Christopher Moore");
                System.out.println("3.8- Crazy Rich Asians - by Kevin Kwan");  
                System.out.println("3.9- Hyperbole and a Half - by Allie Brosh");  
                System.out.println("3.10- The Rosie Project - by Graeme Simsion"); 
                break;
            case 4:
                System.out.println("You chose Thriller. Enjoy your book!");                       System.out.println();
                System.out.println("4.1- The Girl with the Dragon Tattoo - by Stieg Larsson");  
                System.out.println("4.2- Gone Girl - by Gillian Flynn");   
                System.out.println("4.3- The Da Vinci Code - by Dan Brown");    
                System.out.println("4.4- The Silent Patient - by Alex Michaelides");      
                System.out.println("4.5- The Girl on the Train - by Paula Hawkins");     
                System.out.println("4.6- The Girl with a Clock for a Heart - by Peter Swanson"); 
                System.out.println("4.7- The Silent Wife - by A.S.A. Harrison");
                System.out.println("4.8- The Woman in the Window - by A.J. Finn");  
                System.out.println("4.9- Before I Go to Sleep - by S.J. Watson");  
                System.out.println("4.10- The Reversal - by Michael Connelly"); 
                break;
            case 5:
                System.out.println("You chose Historical. Enjoy your book!");                     System.out.println();
                System.out.println("5.1- The Nightingale - by Kristin Hannah");  
                System.out.println("5.2- The Pillars of the Earth - by Ken Follett");   
                System.out.println("5.3- A Gentleman in Moscow - by Amor Towles");    
                System.out.println("5.4- The Tattooist of Auschwitz - by Heather Morris");      
                System.out.println("5.5- The Dutch House - by Ann Patchett");     
                System.out.println("5.6- The Underground Railroad - by Colson Whitehead"); 
                System.out.println("5.7- The Other Boleyn Girl - by Philippa Gregory");
                System.out.println("5.8- The Shadow of the Wind - by Carlos Ruiz Zafón");  
                System.out.println("5.9- The Guernsey Literary and Potato Peel Pie Society - by Mary Ann Shaffer and Annie Barrows");  
                System.out.println("5.10- The Invention of Wings - by Sue Monk Kidd"); 
                break;
            default:
                System.out.println("Invalid genre choice. Please enter a number between 1 and 5."); 
                 genreChoice = scnr.nextInt();
        }
            
   
        System.out.println ("Please enter the title of the book you have chosen: ");
        bookTitle = scnr.nextLine();
        System.out.println();
        
        scnr.close();
        
        return bookTitle;
        
    }

}
