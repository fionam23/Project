// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to your Slime Fighting Journey.");
        System.out.println("Pick your starting slime.");
        System.out.println("Type p for Pyro slime, c for Cryo slime, h for Hydro slime, or e for Electro slime.");
        String chosenStarter = s.nextLine();
        UserStats us = new UserStats();
        new GenerateSlime(us.getUserLevel());
    }
}