package domain;

public class Book extends Material{
    private String author;

    public Book(String title, String author, int year) throws IllegalArgumentException {
        super(title, year);
        setAuthor(author);
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        if(author == null || author.isBlank()){
            throw new IllegalArgumentException("Invalid argument 'author'");
        }
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [title=" + this.getTitle() + ", author=" + author + ", year=" + this.getYear() + "]";
    }

    public static void main(String[] args) {
        try {
            Book b = new Book("teste", "", 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Book b = new Book("", "teste", 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Book b = new Book("teste", "    ", 2012);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }

        try {
            Book b = new Book("teste", "teste", 0);
        }
        catch (IllegalArgumentException e){
            System.out.println("SUCCESS: " + e.getMessage());
        }
        
        Book b = new Book("teste", "teste", 2012);
        System.out.println("SUCCESS: " + b);
    }   
}
