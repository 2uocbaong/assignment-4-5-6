public class Book {

    private String bookId;
    private String title;
    private String author;
    private int publishYear;
    private int quantity;

    public Book(String bookId,
                String title,
                String author,
                int publishYear,
                int quantity) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return bookId
                + " | "
                + title
                + " | "
                + author
                + " | "
                + publishYear
                + " | Qty="
                + quantity;
    }
}