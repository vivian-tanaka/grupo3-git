package aula4.exercicio2.exercicio3.entities;

public class Book {

    private String title;
    private String isbn;
    private String author;
    private Integer amountInLibrary;

    public Book(){}

    public Book(String title, String isbn, String author, Integer amountInLibrary) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.amountInLibrary = amountInLibrary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAmountInLibrary() {
        return amountInLibrary;
    }

    public void setAmountInLibrary(Integer amountInLibrary) {
        this.amountInLibrary = amountInLibrary;
    }

    public String borrowBook(){
        if(amountInLibrary > 0){
            setAmountInLibrary(amountInLibrary-1);
            return "Book borrowed";
        }
        return "No book available";
    }

    public void returnBook(){
        amountInLibrary++;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", title, isbn, author);
    }
}
