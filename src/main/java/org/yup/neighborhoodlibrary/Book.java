package org.yup.neighborhoodlibrary;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String isbn, String title) {
        setId(id);
        setIsbn(isbn);
        setTitle(title);
        setCheckedOut(false);
        setCheckedOutTo("");
    }

    public void checkOut(String name) {
        setCheckedOut(true);
        setCheckedOutTo(name);
    }

    public void checkIn() {
        setCheckedOut(false);
        setCheckedOutTo("");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

}
