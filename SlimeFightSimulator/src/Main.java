// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String input;

        System.out.println("Welcome to your Slime Fighting Journey.");
        System.out.println("Pick your starting slime.");
        System.out.println("Type p for Pyro slime, c for Cryo slime, h for Hydro slime, or e for Electro slime.");
        String chosenStarter = s.nextLine();
        UserStats us = new UserStats();

        Slime mySlime = new GenerateSlime(us.getUserLevel(), chosenStarter).getNewSlime();
        System.out.println("Your adopted slime has stats of: " + mySlime.getHealth() + " HP, Type: " + mySlime.getType());
        System.out.println("Would you like to name your slime? y/n");
        if (s.nextLine().equalsIgnoreCase("y")) {
            System.out.println("What name?");
            mySlime.setSlimeName(s.nextLine());
        }
        System.out.println("Your Slime's name is.." + mySlime.slimeName);
        System.out.println("This is your journey to be the very best! You and your new buddy " + mySlime.slimeName + " depart from home to become the Ultimate Slime Master.");
        System.out.println("You head out to Wispy Meadows. To walk around click enter. Maybe you will encounter a new teammate.");

        while (s.nextLine().equals("")) {
            if (GenerateSlime.randomNumber(20) < 15) {
                System.out.println("Walked forward. Nothing here...");
            } else if(GenerateSlime.randomNumber(20) == 15) {
                System.out.println("You found a berry!");
                System.out.println("Added berry to your bag");

            } else {

                    Battle newBattle = new Battle(us,mySlime);
                    Slime wildSlime = newBattle.getWildSlime();
                    Slime activeSlime = newBattle.getActiveSlime();
                    int wildSlimeHealth = wildSlime.getHealthCap();
                    System.out.println(Battle.commenceBattle(us));
                    for(int i = 0; wildSlime.getHealth()>0; i++){
                        System.out.println(Battle.Menu());
                        input = s.nextLine();
                        if(input.equalsIgnoreCase("F")){

                            System.out.println(Battle.displayMoveSet());
                            System.out.println("Type the move you want to use.");
                            input = s.nextLine();
                            if(input.equals("1")|| input.equals("2")|| input.equals("3") || input.equals("4")){
                                Move moveUsed = newBattle.Attack(Integer.parseInt(input));
                                System.out.println(activeSlime.slimeName+" used "+moveUsed.getMoveName()+". It did "+(wildSlimeHealth-wildSlime.getHealth())+" damage!");
                                System.out.println(newBattle.getWildSlime().slimeName+"'s HP: "+newBattle.getWildSlime().getHealth());
                                wildSlimeHealth -= wildSlimeHealth-wildSlime.getHealth();
                                Move thingy =
                                System.out.println(wildSlime.slimeName+" retaliates with ");
                            } else {
                                System.out.println("That isn't a move!");
                            }

                        } else if (input.equalsIgnoreCase("X")) {
                            System.out.println("Successfully fled! Press enter to continue searching.");
                            wildSlime.setHealth(0);
                        }

                    }

            }

        }
    }
}