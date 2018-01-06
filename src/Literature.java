/**
 * Created by dominika on 12.11.17.
 */
public abstract class Literature {

    private String title;
    private String author; //
    private boolean readed;
    private boolean toread;
    private String type; // for example horror fictional
    private int numberOfPages;
    private int lastPage;

    public Literature(String title, String author, boolean readed, boolean toread, String type, int numberOfPages, int lastPage ){

        this.title = title;
        this.author = author;
        this.readed = readed;
        this.toread = toread;
        this.type = type;
        this.numberOfPages =numberOfPages;
        this.lastPage = lastPage;

    }

    public Literature() {

    }

    public String getTitle() {
        return title;
    }

    public boolean getReaded() {
        return readed;
    }

    public boolean getToread() {
        return toread;
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

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public void setToread(boolean toread) {
        this.toread = toread;
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
}