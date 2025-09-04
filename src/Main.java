public class Main {
    public static void main(String[] args) {
        System.out.println("  Book Record System   ");
        System.out.println("\nAdding books and ratings: ");

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        try{
            book1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        book2.addMultipleRatings(4, 5, 4, 3);

        try{
            book3.addRating(6);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nBook Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());

        System.out.println("\nTotal books created: " + Book.getTotalBooks());

        Book highest = book1;
        if (book2.getAverageRating() > highest.getAverageRating()) highest = book2;
        if (book3.getAverageRating() > highest.getAverageRating()) highest = book3;

        System.out.println("Highest rated book: " + highest.getTitle() + " by " + highest.getAuthor() + " (" + String.format("%.2f", highest.getAverageRating()) + ")");
        }
    }
