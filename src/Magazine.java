/**
 * Created by dominika on 12.11.17.
 */
public class Magazine extends Literature{

    int number;
    int publicationYear;
    int publicationMonth;


    public Magazine(){}


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
