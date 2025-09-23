public interface LibraryUser {
    String getUserType();
    void borrowMedia(Media media);
    void returnMedia(Media media);
    int getMaxBorrowLimit();
}

class Student implements LibraryUser {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getUserType() {
        return "Student";
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }
}

class Teacher implements LibraryUser {
    private String name;
    private String employeeId;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Teacher";
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }
}

class Librarian implements LibraryUser {
    private String name;
    private String employeeId;

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Librarian";
    }

    @Override
    public int getMaxBorrowLimit() {
        return 10;
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }
}
public abstract class Media {
    protected String title;
    protected String itemID;
    protected boolean isAvailable;

    public Media(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() {
        if (isAvailable) {
            this.isAvailable = false;
            System.out.println(title + " has been borrowed");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            this.isAvailable = true;
            System.out.println(title + " has been returned");
        }
    }

    public abstract String getMediaType();
    public abstract void displayInfo();
}