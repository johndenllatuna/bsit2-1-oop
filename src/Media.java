class Book extends Media {
    private String author;

    public Book(String title, String itemID, String author) {
        super(title, itemID);
        this.author = author;
    }

    @Override
    public String getMediaType() {
        return "Book";
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: \"" + title + "\" by " + author + " (ID: " + itemID + ")");
    }
}

class DVD extends Media {
    private String director;

    public DVD(String title, String itemID, String director) {
        super(title, itemID);
        this.director = director;
    }

    @Override
    public String getMediaType() {
        return "DVD";
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD: \"" + title + "\" directed by " + director + " (ID: " + itemID + ")");
    }
}

class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, String itemID, int issueNumber) {
        super(title, itemID);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getMediaType() {
        return "Magazine";
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: \"" + title + "\" Issue #" + issueNumber + " (ID: " + itemID + ")");
    }
}

