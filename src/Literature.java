/**
 * Created by dominika on 12.11.17.
 */
public class Literature {

    private String title;
    private String author1; // zmienić na authors w tablicy
    private String author2;
    private boolean readed;
    private boolean toread;
    private String type; // for example horror fictional
    private int numberOfPages;
    private int lastPage;


    public String getTitle() {
        return title;
    }

    public String  getAuthor1() { return author1; }

    public String getAuthor2(){
        return author2;
    }

    public boolean getReaded(){
        return readed;
    }

    public boolean getToread(){
        return toread;
    }

    public String getType() { return type; }

    public int getNumberOfPages() {return numberOfPages;}

    public int getLastPage() {return lastPage;}


    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor1(String author1) {
        this.author1 = author1;
    }
    public void setAuthor2(String author2){
        this.author2 = author2;
    }
    public void setReaded(boolean readed){
        this.readed = readed;
    }
    public void setToread(boolean toread){
        this.toread = toread;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setNumberOfPages(int numberOfPages){ this.numberOfPages = numberOfPages;}
    public void setLastPage(int lastPage){this.lastPage = lastPage;}

