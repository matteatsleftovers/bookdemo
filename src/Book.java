public class Book {

    private String title;
    private String author;
    private String genre;
    private int yearOfPublication;

    public void printDetails() {
        System.out.println("The title is " + title +
                ", the author is " + author +
                ", the genre is " + genre +
                ", and the year of publication is " + yearOfPublication + "\n");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
