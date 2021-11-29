public class Book {
    private String title;
    private Writer author;
    private int pages;
    private int currentPage = 0;

    Book(String title, Writer author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void pageForward(){
        currentPage += 1;
    }
    public void pageBackward(){
        currentPage -= 1;
    }
    public void setAuthor(Writer newAuthor){
        this.author = newAuthor;
    }
}
