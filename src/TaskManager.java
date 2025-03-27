import java.util.Locale;
import java.util.Scanner;

//Methoden von Aufgaben
public class TaskManager {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void createTask(String titel, String description, int userID){
        System.out.println("Title: ");
        titel = scanner.nextLine();

    }
}
