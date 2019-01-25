import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int userInput;
        Library library = new Library();
        boolean running = true;

        do {
            System.out.println("Welcome to the Library!");
            System.out.println("What would you like to do?\n" +
                    "1: Add a book\n" +
                    "2: View number of books in library\n" +
                    "3: Exit\n");
            // NOTE: This program will not handle anything besides integers!
            System.out.println("Enter a number only: ");

            userInput = myScanner.nextInt();

            System.out.println("The user input " + userInput + "\n");

            switch (userInput) {
                case 1:
                    if (library.hasRoom()) {
                        Book newBook = new Book();

                        System.out.println("What's the name of the book, brosephina?");
                        myScanner.nextLine();
                        String newTitle = myScanner.nextLine();
                        newBook.setTitle(newTitle);

                        System.out.println("Who's the author of that book?");
                        String newAuthor = myScanner.nextLine();
                        newBook.setAuthor(newAuthor);

                        System.out.println("What's the genre?");
                        String newGenre = myScanner.nextLine();
                        newBook.setGenre(newGenre);

                        System.out.println("What year was the book published?");
                        int newYear = myScanner.nextInt();
                        newBook.setYearOfPublication(newYear);

                        newBook.printDetails();

                        library.addBook(newBook);
                    } else {
                        System.out.println("The library is full!\n");
                    }
                    break;
                case 2:
                    System.out.println("The number of books is " + library.numberOfBooksInLibrary() + "\n");
                    library.printBooks();
                    break;
                case 3:
                    System.out.println("Thanks for visiting the library. Remember to support the public good.");
                    running = false;
                    break;
                default:
                    System.out.println("Hey, you gotta pick one of the three options, buddy.");
            }
        } while (running);
    }
}
