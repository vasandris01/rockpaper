import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private Map<String, Integer> scoreboard = new HashMap<>();

    public Game() {
        
    }
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
