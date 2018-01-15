import java.util.Scanner;
import java.util.LinkedList;

//TODO: make sorting by alphabet
public class Runner{

    public static void main(String[] args){

        //Book book1 = new Book("Mistrz i Małgorzata", "Bułhakow", false, true, "fantastyka", 502, 302, 1 );
        //System.out.println(book1.getTitle());

        /*Magazine magazines = new Magazine();

        magazines.addMagazine();
        magazines.readAllMagazines(getMagazines);
    */


        System.out.println("Podaj rodzaj literatury: \nksiążka - wpisz - k \ngazeta/magazyn - wpisz - g");
        String literatureType;
        Scanner readOut = new Scanner(System.in);
        literatureType = readOut.nextLine();
        String literature;

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

        // objects to access

        Magazine magazine = new Magazine();
        LinkedList<Magazine> getMagazines = magazine.getAllMagazines();
        Book books = new Book();
        LinkedList<Book> getBooks = books.getAllBooks();

        if (literatureType == "k") {
            String whatToDo;

            System.out.println(" Witaj użytkowniku aby :");
            System.out.println(" - wyświetlić spis ksiażek alfabetycznie według autora - wpisz - author ");
            System.out.println(" - wyświetlić spis książek alfabetycznie według tytułu - wpisz - title  ");
            System.out.println(" - wyświetlić książki do przeczytania - wpisz - toread ");
            System.out.println(" - wyświetlić książki przeczytane - wpisz - read ");
            System.out.println(" - dodać nową książkę - wpisz - new ");

            //Scanner readOut = new Scanner(System.in);
            whatToDo = readOut.nextLine();

            while (whatToDo != "exit") {
                whatToDo = readOut.nextLine(); // TODO add while loop if someone will write bad content like dds despite of for example author

                switch (whatToDo) {
                    case "author":
                        System.out.println("Autorzy książek"); //TODO when somebody write author, list of authors must be shown
                        books.readAllAuthors(getBooks);
                        break;
                    case "title":
                        System.out.println("Tytuły ksiażek"); //TODO when somebody write title, list of titles must be shown
                        break;
                    case "toread":
                        System.out.println("Książki do przeczytania"); //TODO when somebody write toread, list of books to read must be shown
                        books.readAllBooks(getBooks);
                        break;
                    case "read":
                        System.out.println("Książki przeczytane"); //TODO when somebody write toread, list of books to read must be shown
                        books.readAllBooks(getBooks);
                        break;
                    case "new":
                        System.out.println("Dodaj nową książkę"); //TODO when somebody write new, he will have to be able to add new book
                        books.addBook();
                        break;
                    default:
                        throw new IllegalArgumentException("Polecenie " + whatToDo + ", które wpisałeś jest nieporawne");


                        // TODO program end when somebody whrite wrong whatToDo. Programm should take another word

                }
            }
            // FOR MAGAZINE
        }else if(literatureType == "g"){

            System.out.println(" Witaj użytkowniku aby :");
            System.out.println(" - wyświetlić spis magazynów alfabetycznie według autora - wpisz - author ");
            System.out.println(" - wyświetlić spis magazynów alfabetycznie według tytułu - wpisz - title  ");
            System.out.println(" - wyświetlić magaznynów do przeczytania - wpisz - toread ");
            System.out.println(" - wyświetlić magazyny przeczytane - wpisz - read ");
            System.out.println(" - dodać nowy magazyn - wpisz - new ");
            System.out.println(" - wyświetlić wszystkie informacje - wpisz - all ");
            String whatToDo;
            whatToDo = readOut.nextLine();
            while (whatToDo != "exit") {
                whatToDo = readOut.nextLine(); // TODO add while loop if someone will write bad content like dds despite of for example author

                switch (whatToDo) {
                    case "author":
                        System.out.println("Autorzy magazynów/czasopism"); //TODO when somebody write author, list of authors must be shown
                        magazine.readAllAuthors(getMagazines);
                        break;
                    case "title":
                        System.out.println("Tytuły magazynów/czasopism"); //TODO when somebody write title, list of titles must be shown
                        break;
                    case "toread":
                        System.out.println("Magazyny/czasopisma do przeczytania"); //TODO when somebody write toread, list of books to read must be shown
                        magazine.readAllMagazinesToRead(getMagazines);
                        break;
                    case "read":
                        System.out.println("Magazyny/czasopisma przeczytane"); //TODO when somebody write toread, list of books to read must be shown
                        magazine.readAllMagazinesReadTrue(getMagazines);
                        break;
                    case "new":
                        System.out.println("Dodaj nowy magazyn/czasopismo"); //TODO when somebody write new, he will have to be able to add new book
                        magazine.addMagazine();
                        break;
                    case "all":
                        System.out.println("Wyświetl wszystkie informacje");
                        magazine.readAllMagazines(getMagazines);
                    default:
                        throw new IllegalArgumentException("Polecenie " + whatToDo + ", które wpisałeś jest nieporawne");


                        // TODO program end when somebody whrite wrong whatToDo. Programm should take another word

                }
            }
        }

    }
}