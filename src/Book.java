public class Book {
    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable = false;

    public Book(String bookTitle, String bookAuthor, int bookPages, boolean bookIsAvailable){
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        isAvailable = bookIsAvailable;
        System.out.println("\nA new book " + title + " by author " + author + " has been added to the library!");
    }

    void displayInfo(){
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Pages: " + pages);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Unavailable"));
    }

    void borrowBook(){
        isAvailable = false;
        System.out.println("The book " + title + " has been borrowed");
    }

    void returnBook(){
        isAvailable = true;
        System.out.println("The book " + title + " has been returned");
    }

}

