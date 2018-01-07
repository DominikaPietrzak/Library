import java.util.Scanner;

public class Runner{

    public static void main(String[] args){

        String bookTitle;
        //Book book1 = new Book("Mistrz i Małgorzata", "Bułhakow", false, true, "fantastyka", 502, 302, 1 );
        //System.out.println(book1.getTitle());
        Book book2 = new Book();

        System.out.println("Podaj rodzaj literatury (książka - wpisz - k, gazeta/magazyn - wpisz - g");
        String literatureType;
        Scanner readOut = new Scanner(System.in);
        literatureType = readOut.nextLine();
        String literature;
        Object literatureObj;
        // TODO: zrobić tak, żeby w zależnośći od tego czy wybierze się książkę czy gazetę tworzyło obiekt typu book lub magazine
        do{
            if(literatureType.equals("k")){
                literatureType = "ksiażka";
                literature = "k";
                Book book3 = new Book();
                literatureObj = book3;
            }
            else if(literatureType.equals("g")){
                literatureType = "gazeta";
                literature = "g";
                Magazine magazine1 = new Magazine();
                literatureObj = magazine1;
            }
        while(!literatureType.equals("k") && !literatureType.equals("g"));

         if(literature.equals("g")){
            System.out.println("Podaj tytuł gazety");
         }
         else if(literature.equals("k")){
            System.out.println("Podaj tytuł ksiażki");
         }


        bookTitle = readOut.nextLine();

        book2.setTitle(bookTitle);
        System.out.println(book2.getTitle());

        System.out.println("Podaj autora");
        String author;
        author = readOut.nextLine();
        book2.setAuthor(author);

        System.out.println("Czy książka jest już przeczytana ? - wpisz tak lub nie");
        String readedString;
        boolean readed;
        readedString = readOut.nextLine();
        do {
            if (readedString.equals("tak")) {
                book2.setReaded(true);

            } else if (readedString.equals("nie")) {
                book2.setReaded(false);
            } else {
                System.out.println("Wpisz poprawny wyraz1");
                readedString = readOut.nextLine();
            }
        }while(!readedString.equals("tak") && !readedString.equals("nie"));

        System.out.println("Czy książka jest do przeczytania ? - wpisz tak lub nie");
        String toReadString;
        boolean toRead;
        toReadString = readOut.nextLine();
        do {
            if (toReadString.equals("tak")) {
                book2.setReaded(true);

            } else if (toReadString.equals("nie")) {
                book2.setReaded(false);
            } else {
                System.out.println("Wpisz poprawny wyraz");
                toReadString = readOut.nextLine();
            }
        }while( !toReadString.equals("tak") && !toReadString.equals("nie") );

        System.out.println("Podaj kategorię czasopisma");
        String category;
        category = readOut.nextLine();
        book2.setType(category);

        System.out.println("Podaj liczbę stron");
        int numberOfPages;
        numberOfPages = readOut.nextInt();
        book2.setNumberOfPages(numberOfPages);

        System.out.println("Podaj numer strony na której skończyłeś");
        int lastPage;
        lastPage = readOut.nextInt();
        book2.setLastPage(lastPage);



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