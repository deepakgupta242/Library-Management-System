public class Book {
    private int bookId;
    private String title;
    private String author;
    private User issuedTo;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issuedTo = null;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public User getIssuedTo() { return issuedTo; }
    public void setIssuedTo(User user) { this.issuedTo = user; }

    @Override
    public String toString() {
        String status = (issuedTo == null) ? "Available" : "Issued to: " + issuedTo.getName();
        return bookId + ": " + title + " by " + author + " [" + status + "]";
    }
}