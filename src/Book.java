/**
 * Created by dominika on 12.11.17.
 */
import java.util.LinkedList;
import java.util.Scanner;
public class Book extends Literature{

    private LinkedList<Book> books = new LinkedList<Book>();
    int volumeNumber;

    public int getVolumeNumber(){
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber){
        this.volumeNumber = volumeNumber;
    }


    public Book(String title, String author, boolean read, boolean toRead, String type, int numberOfPages, int lastPage, int volumeNumber) {
        super( title, author, read, toRead, type, numberOfPages, lastPage);
        this.volumeNumber = volumeNumber;
       // System.out.println("Podaj imię autora");
       // Scanner in = new Scanner(System.in);
    }

    public Book(){
        super();
    }

    //public Book(String title, String author){
        //super(title, author);}

    public  void addBook() {

        Book book = new Book();

        Scanner readOut = new Scanner(System.in);
        System.out.println("Podaj tytuł");
        String title = readOut.nextLine();
        book.setTitle(title);

        System.out.println("Podaj autora");
        String author = readOut.nextLine();
        book.setAuthor(author);

        System.out.println("Czy książka jest już przeczytana ? - wpisz tak lub nie");
        String readString;
        boolean read;
        readString = readOut.nextLine();
        do {
            if (readString.equals("tak")) {
                read = true;
                book.setRead(read);

            } else if (readString.equals("nie")) {
                read = false;
                book.setRead(read);
            } else {
                System.out.println("Wpisz poprawny wyraz");
                readString = readOut.nextLine();
            }
        }while(!readString.equals("tak") && !readString.equals("nie"));

        System.out.println("Czy książka jest do przeczytania ? - wpisz tak lub nie");
        String toReadString;
        boolean toRead;
        toReadString = readOut.nextLine();
        do {
            if (toReadString.equals("tak")) {
                toRead = true;
                book.setToRead(toRead);

            } else if (toReadString.equals("nie")) {
                toRead = false;
                book.setToRead(toRead);
            } else {
                System.out.println("Wpisz poprawny wyraz");
                toReadString = readOut.nextLine();
            }
        }while( !toReadString.equals("tak") && !toReadString.equals("nie") );

        System.out.println("Podaj kategorię ksiażki");
        String type;
        type = readOut.nextLine();
        book.setType(type);

        System.out.println("Podaj liczbę stron");
        int numberOfPages;
        numberOfPages = readOut.nextInt();
        book.setNumberOfPages(numberOfPages);

        System.out.println("Podaj numer strony na której skończyłeś");
        int lastPage;
        lastPage = readOut.nextInt();
        book.setLastPage(lastPage);

        System.out.println("Podaj numer tomu książki");
        int volumeNumber;
        volumeNumber = readOut.nextInt();
        //book.setVolumeNumber(volumeNumber);

        //LinkedList<Book> books = new LinkedList<Book>();
        this.books.add(new Book(title, author,book.getToRead(),book.getRead() ,type,numberOfPages,lastPage, volumeNumber));


    }

    public LinkedList<Book>  getAllBooks(){ return books;}
    public   void readAllBooks (LinkedList<Book> books){ //LinkedList<Book> books

        for(int i=0; i< books.size();i++){
            System.out.println(books.get(i).getAuthor());
            System.out.println(books.get(i).getTitle());

        }
    }

    public void readAllAuthors(LinkedList<Book> books){
        for(int i=0; i<books.size();i++ ){
            System.out.println(books.get(i).getAuthor());
        }
    }

    public void readAllBooksToRead(LinkedList<Book> books){
        for(int i=0; i<books.size();i++ ){
            if(books.get(i).getToRead() == true){
                System.out.println(books.get(i).getTitle());
                System.out.println(books.get(i).getAuthor());
            }
            else{
                System.out.println("Nie ma książek do przeczytania");
            }

        }
    }

    public void readAllBooksRead(LinkedList<Book> books){
        for(int i=0; i<books.size();i++ ){
            if(books.get(i).getRead() == true){
                System.out.println(books.get(i).getTitle());
                System.out.println(books.get(i).getAuthor());
            }
        }
    }
    public void readAllBooksCategories(LinkedList<Book> books){
        for(int i=0; i<books.size(); i++){
            System.out.println(books.get(i).getType());
        }
    }

    public int howManyPagesLeft(int numberOfPages, int lastPage){

        int pageLeft = numberOfPages - lastPage;
        return pageLeft;
    }

    public void readAllBooksTitle(LinkedList<Book> books){
        for(int i=0; i<books.size(); i++){
            System.out.println(books.get(i).getAuthor());
        }
    }
}

