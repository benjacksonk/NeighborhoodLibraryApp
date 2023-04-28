package org.yup.neighborhoodlibrary;

public class NeighborhoodLibraryApp {

    public static void main(String[] args) {

        Book[] books = {
            new Book(1, "1111111111", "Beowulf"),
            new Book(2, "4815162342", "Grimm's Fairy Tales"),
            new Book(4, "0123456789", "Reading for Dummies"),
            new Book(5, "1123581321", "Where the Wild Things Are"),
            new Book(5, "1123581321", "Winnie the Pooh"),
        };

        boolean appRunning = true;
        while (appRunning) {
            switch(Screens.mainMenuPrompt()) {
                case 1:
                    showBooksAvailable(books);
                    break;
                case 2:
                    showBooksUnavailable(books);
                    break;
                default:
                    appRunning = false;
                    break;
            }
        }

    }

    static void showBooksAvailable(Book[] books) {

        System.out.println("Books available: ");

        for (Book book : books) {
            if (book.isCheckedOut() == false) {
                System.out.println(book.getId() + " |   ISBN: " + book.getIsbn() + "   Title: " + book.getTitle());
            }
        }

        System.out.println();

    }

    static void showBooksUnavailable(Book[] books) {

        System.out.println("Books unavailable: ");

        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println(book.getId() + " |   ISBN: " + book.getIsbn() + "   Title: " + book.getTitle());
            }
        }

        System.out.println();

    }

}
