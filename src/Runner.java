import java.util.Scanner;
import java.util.LinkedList;

public class Runner{

    public static void main(String[] args){

        //Book book1 = new Book("Mistrz i Małgorzata", "Bułhakow", false, true, "fantastyka", 502, 302, 1 );
        //System.out.println(book1.getTitle());


        Book books = new Book();

        books.addBook();
        LinkedList<Book> getBooks = books.getAllBooks();
        books.readAllBooks(getBooks);
        books.readAllAuthors(getBooks);
        books.readAllBooksToRead(getBooks);
        /*
        System.out.println("Podaj rodzaj literatury: \nksiążka - wpisz - k \ngazeta/magazyn - wpisz - g");
        String literatureType;
        Scanner readOut = new Scanner(System.in);
        literatureType = readOut.nextLine();
        String literature;


        Magazine magazine = new Magazine();
        do {
            if (literatureType.equals("k")) {
                literature = "książki";
            }else if (literatureType.equals("g")) {
                literature = " gazety/magazynu";
            }else {
                System.out.println("Zły znak. Wpisz poprawny znak");
                literatureType = readOut.nextLine();
                literature = "";
            }
        }
        while(!literatureType.equals("k") && !literatureType.equals("g"));

        System.out.println("Podaj tytuł " + literature + ":");
         if(literatureType.equals("g")){

            String magazineTitle;
             magazineTitle = readOut.nextLine();
             magazine.setTitle(magazineTitle);


         }
         else if(literatureType.equals("k")){


         }
        else{
             System.out.println("Wpisz poprawny wyraz");
         }


        //Todo: tworzenie nowych obiektów






        System.out.println("Tytuł: " + booky.getTitle());
        System.out.println("Autor: " + book2.getAuthor());
        System.out.println("Liczba stron: " + book2.getNumberOfPages());
        System.out.println("Ostatnia strona: " + book2.getLastPage());
        System.out.println("Czy książka jest przeczytana: " + book2.getRead());
        System.out.println("Czy książka jest do przeczytania:" +  book2.getToRead());
        System.out.println("Typ książki" + book2.getType());


*/




       /* String whatToDo;

        System.out.println(" Witaj użytkowniku aby :");
        System.out.println(" - wyświetlić spis ksiażek alfabetycznie według autora - wpisz - author ");
        System.out.println(" - wyświetlić spis książek alfabetycznie według tytułu - wpisz - title  ");
        System.out.println(" - wyświetlić książki do przeczytania - wpisz - toread ");
        System.out.println(" - wyświetlić książki przeczytane - wpisz - read ");
        System.out.println(" - dodać nową książkę - wpisz - new ");

        Scanner readOut = new Scanner(System.in);
        whatToDo = readOut.nextLine();
*/
        /* while(whatToDo != "exit" ) {
            whatToDo = readOut.nextLine(); // TODO add while loop if someone will write bad content like dds despite of for example author

            switch (whatToDo) {
                case "author":
                    System.out.println("Autorzy"); //TODO when somebody write author, list of authors must be shown
                    break;
                case "title":
                    System.out.println("Tytuły"); //TODO when somebody write title, list of titles must be shown
                    break;
                case "toread":
                    System.out.println("Do przeczytania"); //TODO when somebody write toread, list of books to read must be shown
                    break;
                case "read":
                    System.out.println("Przeczytane"); //TODO when somebody write toread, list of books to read must be shown
                    break;
                case "new":
                    System.out.println("Dodaj nową książkę"); //TODO when somebody write new, he will have to be able to add new book
                    break;
                default:
                    throw new IllegalArgumentException("Polecenie " + whatToDo + ", które wpisałeś jest nieporawne");


                    // TODO program end when somebody whrite wrong whatToDo. Programm should take another word

            }
        } */



    }
}