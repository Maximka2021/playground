package playground.Human;
import java.util.Scanner;

public class HumanManager {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Human maxim  = new Human("Maxim", "Polyakov", 20, 18_000);
        String myWords = scanner.nextLine();
        maxim.say("I am the best human in the world");
        maxim.repeatAfterMe(myWords);
    }
}

// Create a store class (Store class is the factory and item class is blueprint) to spend money
// Create a bank class to manage money
// PRACTICE PRACTICE PRACTICE
