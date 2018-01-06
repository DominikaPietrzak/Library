/**
 * Created by dominika on 12.11.17.
 */
public class Magazine extends Literature{

    int number;
    int publicationYear;
    int publicationMonth;


    public Magazine(String title, String author, boolean readed, boolean toread, String type, int numberOfPages, int lastPage, int number, int publicationYear,int publicationMonth){
        super(title, author, readed, toread, type, numberOfPages,  lastPage);
        this.number = number;
        this.publicationYear = publicationYear;
        this.publicationMonth = publicationMonth;
    }


    public int getNumber(){
        return number;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public int getPublicationMonth(){
        return publicationMonth;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public void setPublicationMonth(int publicationMonth){
        this.publicationMonth = publicationMonth;
    }

}
