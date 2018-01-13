import java.util.LinkedList;

/**
 * Created by dominika on 12.11.17.
 */
public abstract class Literature {
    private LinkedList<Literature> literature = new LinkedList<Literature>();
    private String title;
    private String author; //
    private boolean read;
    private boolean toRead;
    private String type; // for example horror fictional
    private int numberOfPages;
    private int lastPage;

    public Literature(String title, String author, boolean read, boolean toRead, String type, int numberOfPages, int lastPage ){

        this.title = title;
        this.author = author;
        this.read = read;
        this.toRead = toRead;
        this.type = type;
        this.numberOfPages =numberOfPages;
        this.lastPage = lastPage;

    }

    public Literature() {

    }
    public LinkedList<Literature> getLiterature(){return literature;}

    public String getTitle() {
        return title;
    }

    public boolean getRead() { return read; }

    public boolean getToRead() {
        return toRead;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getLastPage() {
        return lastPage;
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public void setToRead(boolean toRead) {
        this.toRead = toRead;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public void setLiterature(LinkedList<Literature> literature){ this.literature = literature;}
}