/**
 * Created by dominika on 12.11.17.
 */
import java.util.Scanner;
public class Book extends Literature{

    int volumeNumber;

    public int getVolumeNumber(){
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber){
        this.volumeNumber = volumeNumber;
    }


    public Book(String title, String author, boolean readed, boolean toread, String type, int numberOfPages, int lastPage, int volumeNumber) {
        super( title, author, readed, toread, type, numberOfPages, lastPage);
        this.volumeNumber = volumeNumber;
       // System.out.println("Podaj imię autora");
       // Scanner in = new Scanner(System.in);


    }
    public Book(){
        super();
    }


}
