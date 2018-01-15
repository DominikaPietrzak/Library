import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by dominika on 12.11.17.
 */
public class Magazine extends Literature{

    private int number;
    private int publicationYear;
    private int publicationMonth;
    private LinkedList<Magazine> magazines = new LinkedList<Magazine>();

    public Magazine(String title, String author, boolean read, boolean toRead, String type, int numberOfPages, int lastPage, int number, int publicationYear,int publicationMonth){
        super(title, author, read, toRead, type, numberOfPages,  lastPage);
        this.number = number;
        this.publicationYear = publicationYear;
        this.publicationMonth = publicationMonth;
    }
    public Magazine(){super();}

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


    public  void addMagazine() {

        Magazine magazine = new Magazine();

        Scanner readOut = new Scanner(System.in);
        System.out.println("Podaj tytuł");
        String title = readOut.nextLine();
        magazine.setTitle(title);

        System.out.println("Podaj autora");
        String author = readOut.nextLine();
        magazine.setAuthor(author);

        System.out.println("Czy magazyn jest już przeczytany ? - wpisz tak lub nie");
        String readString;
        boolean read;
        readString = readOut.nextLine();
        do {
            if (readString.equals("tak")) {
                read = true;
                magazine.setRead(read);

            } else if (readString.equals("nie")) {
                read = false;
                magazine.setRead(read);
            } else {
                System.out.println("Wpisz poprawny wyraz");
                readString = readOut.nextLine();
            }
        }while(!readString.equals("tak") && !readString.equals("nie"));

        System.out.println("Czy magazyn jest do przeczytania ? - wpisz tak lub nie");
        String toReadString;
        boolean toRead;
        toReadString = readOut.nextLine();
        do {
            if (toReadString.equals("tak")) {
                toRead = true;
                magazine.setToRead(toRead);

            } else if (toReadString.equals("nie")) {
                toRead = false;
                magazine.setToRead(toRead);
            } else {
                System.out.println("Wpisz poprawny wyraz");
                toReadString = readOut.nextLine();
            }
        }while( !toReadString.equals("tak") && !toReadString.equals("nie") );

        System.out.println("Podaj kategorię magazynu");
        String type;
        type = readOut.nextLine();
        magazine.setType(type);

        System.out.println("Podaj liczbę stron");
        int numberOfPages;
        numberOfPages = readOut.nextInt();
        magazine.setNumberOfPages(numberOfPages);

        System.out.println("Podaj numer strony na której skończyłeś");
        int lastPage;
        lastPage = readOut.nextInt();
        magazine.setLastPage(lastPage);

        System.out.println("Podaj numer magazynu");
        int number;
        number = readOut.nextInt();
        magazine.setNumber(number);

        System.out.println("Podaj rok publikacji");
        int publicationYear;
        publicationYear = readOut.nextInt();
        magazine.setPublicationYear(publicationYear);

        System.out.println("Podaj numer miesiąca publikacji");
        int publicationMonth;
        publicationMonth = readOut.nextInt();
        magazine.setPublicationMonth(publicationMonth);

        //LinkedList<Book> books = new LinkedList<Book>();
        this.magazines.add(new Magazine(title, author,magazine.getToRead(),magazine.getRead() ,type,numberOfPages,lastPage,number,publicationYear, publicationMonth));

    }

    public LinkedList<Magazine>  getAllMagazines(){ return magazines;}

    public   void readAllMagazines (LinkedList<Magazine> magazines){ //LinkedList<Book> books

        for(int i=0; i< magazines.size();i++){
            System.out.println(magazines.get(i).getAuthor());
            System.out.println(magazines.get(i).getTitle());

        }
    }

    public void readAllAuthors(LinkedList<Magazine> magazines){
        for(int i=0; i<magazines.size();i++ ){
            System.out.println(magazines.get(i).getAuthor());
        }
    }

    public void readAllMagazinesToRead(LinkedList<Magazine> magazines){
        for(int i=0; i<magazines.size();i++ ){
            if(magazines.get(i).getToRead() == true){
                System.out.println(magazines.get(i).getTitle());
                System.out.println(magazines.get(i).getAuthor());
            }
            else{
                System.out.println("Nie ma książek do przeczytania");
            }

        }
    }

    public void readAllMagazinesReadTrue(LinkedList<Magazine> magazines){
        for(int i=0; i<magazines.size();i++ ){
            if(magazines.get(i).getRead() == true){
                System.out.println(magazines.get(i).getTitle());
                System.out.println(magazines.get(i).getAuthor());
            }
        }
    }

    public void readAllMagazinesFalse(LinkedList<Magazine> magazines){
        for(int i=0;i<magazines.size();i++){
            if(magazines.get(i).getRead() == false){
                System.out.println(magazines.get(i).getTitle());
                System.out.println(magazines.get(i).getAuthor());
            }
        }
    }
    public void readAllMagazinesCategories(LinkedList<Magazine> magazines){
        for(int i=0; i<magazines.size(); i++){
            System.out.println(magazines.get(i).getType());
        }
    }
}
