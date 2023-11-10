// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int random = (int) (Math.random()*10+1);
        System.out.println(random);


        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to your Slime Fighting Journey.");
        System.out.println("Pick your starting slime.");
        System.out.println("Type p for Pyro slime, c for Cryo slime, h for Hydro slime, or e for Electro slime.");
        String chosenStarter = s.nextLine();
        UserStats us = new UserStats();

        Slime mySlime = new GenerateSlime(us.getUserLevel(), chosenStarter).getNewSlime();
        System.out.println("Your adopted slime has stats of: "+mySlime.getHealth()+" HP, Type: "+mySlime.getType());
        System.out.println("Would you like to name your slime? y/n");
        if(s.nextLine().equalsIgnoreCase("y")){
            System.out.println("What name?");
            mySlime.setSlimeName(s.nextLine());
        }
        System.out.println("Your Slime's name is.."+mySlime.slimeName);
        System.out.println("This is your journey to be the very best! You and your new buddy "+mySlime.slimeName+" depart from home to become the Ultimate Slime Master.");
        System.out.println("You head out to Wispy Meadows. To walk around click enter. Maybe you will encounter a new teammate.");

        if(s.nextLine().equals("")){
if(random<=3)
            System.out.println("Walked forward. Nothing here...");
        } else {
Slime wildSlime= new GenerateSlime(us.getUserLevel(),


}



    }
}
