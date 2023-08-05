import java.util.Scanner;

public class Game {


    // beolvasás String visszatérési értékkel
    public String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // beolvasás int visszatérési értékkel
    public int choose() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
