class Book {

    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private static int count = 0;

    public Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        count++;
    }

    public Book() {
        this.ISBN = 0;
        this.bookTitle = "Unknown";
        this.numberOfPages = 0;
        count++;
    }

    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + bookTitle + ", Pages: " + numberOfPages;
    }

    public int compareTo(Book other) {
        return Integer.compare(this.numberOfPages, other.numberOfPages);
    }

    public static int getCount() {
        return count;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public static void main(String[] args) {
        Book book1 = new Book(12345, "Java Programming", 350);
        Book book2 = new Book(67890, "Python Programming", 400);
        Book book3 = new Book();

        
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        
        int comparison = book1.compareTo(book2);
        if (comparison < 0) {
            System.out.println("Book 1 has fewer pages than Book 2.");
        } else if (comparison > 0) {
            System.out.println("Book 1 has more pages than Book 2.");
        } else {
            System.out.println("Both books have the same number of pages.");
        }

        // Print the total count of Book objects created
        System.out.println("Total number of Book objects created: " + Book.getCount());
    }

}