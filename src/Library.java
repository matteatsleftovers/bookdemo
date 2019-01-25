public class Library {

    private Book[] books = new Book[3];

    public int numberOfBooksInLibrary() {
        int numBooks = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                numBooks++;
            }
        }
        return numBooks;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void printBooks() {
        for (Book book : books) {
            if (book != null) {
                book.printDetails();
            }
        }
    }

    public boolean isFull() {
        return numberOfBooksInLibrary() == books.length;
    }

    public boolean hasRoom() {
        return !isFull();
    }
}
