import java.util.Scanner;

public class Runner{

    public static void main(String[] args){

        String whatToDo;

        System.out.println(" Witaj użytkowniku aby :");
        System.out.println(" - wyświetlić spis ksiażek alfabetycznie według autora - wpisz - author ");
        System.out.println(" - wyświetlić spis książek alfabetycznie według tytułu - wpisz - title  ");
        System.out.println(" - wyświetlić książki do przeczytania - wpisz - toread ");
        System.out.println(" - wyświetlić książki przeczytane - wpisz - read ");
        System.out.println(" - dodać nową książkę - wpisz - new ");

        Scanner readOut = new Scanner(System.in);

        whatToDo = readOut.nextLine(); /* TODO add while loop if someone will write bad content like dds despite of for example author */

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
                throw new IllegalArgumentException("Polecenie " + whatToDo  +", które wpisałeś jest nieporawne");
                // TODO program end when somebody whrite wrong whatToDo. Programm should take another word
        }




    }
}