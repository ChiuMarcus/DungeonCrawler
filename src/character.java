import java.util.ArrayList;

public class character {
    private String firstName;
    private String lastName;
    private String charClass;
    private String race;
    private double health;
    private ArrayList<Integer> stats;
    private ArrayList<String> inventory;

    character(String newFN, String newLN, String newRc, String newCl) {
        firstName = newFN;
        lastName = newLN;
        race = newRc;
        charClass = newCl;

    }
}
