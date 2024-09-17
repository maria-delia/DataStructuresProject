import java.util.LinkedList;
import java.util.Scanner;

class BookListManager {
    private LinkedList<String> bookList; //use of the linked list data structure
    
    public BookListManager() {
        this.bookList = new LinkedList<>();
    }

    public void addBooksFromStrings(String... bookTitles) { //Add book to linked list
        for (String title : bookTitles) {
            bookList.add(title);
        }
    }
    
    public void printBookList() { 
        for (String title : bookList) {
            System.out.println(title);
        }
    }
    
    public void deleteBook() { // menu option to return a book deletes that book from the linked list of the user's book list
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the title of the book you want to return");
        String targetBook = scnr.nextLine();

        if (bookList.remove(targetBook)) {
            System.out.println("Your choice '" + targetBook + "' has been deleted.");
        } else {
            System.out.println("Book '" + targetBook + "' not found.");
        }

        // Close the scanner
        scnr.close();
    }

}
