import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int compareTo(Book other) {
        return Integer.compare(this.pages, other.pages);
    }

    public boolean isHeavier() {
        return this.pages > 500;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + " (title, author, pages):");
            String title = scanner.next();
            String author = scanner.next();
            int pages = scanner.nextInt();
            books[i] = new Book(title, author, pages);
        }

        displayAll(books);

        System.out.println("Comparing two books. Enter indices of the books (0-4):");
        int idx1 = scanner.nextInt();
        int idx2 = scanner.nextInt();
        System.out.println("Comparison result: " + books[idx1].compareTo(books[idx2]));

        System.out.println("Checking if a book is heavier. Enter index (0-4):");
        int idx = scanner.nextInt();
        System.out.println("Is heavier? " + books[idx].isHeavier());

        scanner.close();
    }

    public static void displayAll(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
