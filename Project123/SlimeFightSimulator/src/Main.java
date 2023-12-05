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
        System.out.println("Your Slime's name is.." + mySlime.getSlimeName());
        YourSlimes newBox = new YourSlimes(mySlime);
        System.out.println("This is your journey to be the very best! You and your new buddy " + mySlime.getSlimeName() + " depart from home to become the Ultimate Slime Master.");
        System.out.println("You head out to Wispy Meadows. To walk around click enter. Maybe you will encounter a new teammate.");


        /**Searching Algorithm
         *
         */
        while (s.nextLine().equals("")) {
            if (GenerateSlime.randomNumber(20) < 15) {
                System.out.println("Walked forward. Nothing here...([anykey] cancel)");
            } else if(GenerateSlime.randomNumber(20) == 15) {
                System.out.println("You found a berry!");
                System.out.println("Added berry to your bag");


            } else {


                //bruh
                Battle newBattle = new Battle(us,newBox.getFirstNotDeadSlime());
                Slime wildSlime = newBattle.getWildSlime();
                Slime activeSlime = newBattle.getActiveSlime();
                int wildSlimeHealth = wildSlime.getHealthCap();
                boolean endBattle = false;
                System.out.println(Battle.commenceBattle());
                for(int i = 0; !endBattle; i++){
                    System.out.println(Battle.Menu());
                    input = s.nextLine();
                    if(input.equalsIgnoreCase("F")){
                        System.out.println(Battle.displayMoveSet());
                        System.out.println("Type the move number you want to use.");
                        input = s.nextLine();
                        if(input.equals("1")|| input.equals("2")|| input.equals("3") || input.equals("4")){
                            Move moveUsed = newBattle.Attack(Integer.parseInt(input));
                            System.out.println(activeSlime.getSlimeName()+" used "+moveUsed.getMoveName()+". It did "+(wildSlimeHealth-wildSlime.getHealth())+" damage!");
                            if(!wildSlime.isAlive()){
                                endBattle = true;
                            }
                            if (endBattle){
                                System.out.println(wildSlime.getSlimeName()+" fainted!");
                                System.out.println("You successfully defeated "+wildSlime.getSlimeName()+"! Would you like to keep the new slime? (y/n)");
                                input = s.nextLine();
                                while(!input.equalsIgnoreCase("y")&&!input.equalsIgnoreCase("n")){
                                    System.out.println("You successfully defeated "+wildSlime.getSlimeName()+"! Would you like to keep the new slime? (y/n)");
                                    input = s.nextLine();
                                }
                                if(input.equalsIgnoreCase("y")){
                                    System.out.println("Would you like to name your new "+wildSlime.getSlimeName()+" slime?");
                                    input = s.nextLine();
                                    while (!input.equalsIgnoreCase("y")&&!input.equalsIgnoreCase("n")){
                                        System.out.println("Would you like to name your new "+wildSlime.getSlimeName()+" slime?");
                                        input = s.nextLine();
                                    }
                                    if(input.equalsIgnoreCase("y")){
                                        System.out.println("Type the name.");
                                        wildSlime.setSlimeName(s.nextLine());
                                        wildSlime.setHealth(wildSlime.getHealthCap());
                                        newBox.addSlimeToBox(wildSlime);
                                        System.out.println(wildSlime.getSlimeName()+" was sent to your box and healed to full!");
                                    } else {
                                        wildSlime.setHealth(wildSlime.getHealthCap());
                                        newBox.addSlimeToBox(wildSlime);
                                        System.out.println(wildSlime.getSlimeName()+" was sent to your box and healed to full!");
                                    }

                                } else {
                                    System.out.println(wildSlime.getSlimeName()+" will be released at full health! You are a good person. :)");
                                }

                                System.out.println("You beat a slime and leveled up by 1!");
                                us.setUserLevel(us.getUserLevel()+1);
                                System.out.println("Your user level is now... "+us.getUserLevel()+"! The slimes that appear will be more powerful now.");
                                newBox.levelAllUp(us.getUserLevel());
                                newBox.setAllHealth();
                                System.out.println("Your slimes are now all healed and leveled up.");




                            } else {
                                System.out.println(newBattle.getWildSlime().getSlimeName()+"'s HP: "+newBattle.getWildSlime().getHealth());
                                wildSlimeHealth -= wildSlimeHealth-wildSlime.getHealth();
                                Move response = newBattle.opponentAttack(1);
                                if(response.getActionType().equals("Combat")){
                                    System.out.println(wildSlime.getSlimeName()+" used "+response.getMoveName()+".");
                                }
                                else if (response.getActionType().equals("Healing")) {
                                    System.out.println(wildSlime.getSlimeName()+" used "+response.getMoveName()+". They were healed for ");
                                }
                                if(!activeSlime.isAlive()){
                                    endBattle = true;
                                }
                                if(endBattle){
                                    System.out.println(activeSlime.getSlimeName()+" fainted!");
                                } else {
                                    System.out.println(activeSlime.getSlimeName()+"'s health is now "+activeSlime.getHealth());
                                }


                            }
                        }
                        else {
                            System.out.println("That isn't a move!");
                        }


                    } else if (input.equalsIgnoreCase("X")) {
                        endBattle = true;
                        System.out.println("Successfully fled! Press enter to continue searching.([anykey] cancel)");
                        wildSlime.setHealth(0);
                    }


                }


            }


        }
        /**
         * End of the searching Algorithm. The player pressed a button different from "Enter".
         */
        System.out.println("You pack up for the day and walk back to your home, Tomodachi Island. You and your buddies get a well needed rest.");
        System.out.println("You were so well rested, you and you're slimes healed up!");
        newBox.setAllHealth();
        System.out.println("*Healing Sound*");
        System.out.println(""+newBox.getFirstNotDeadSlime().getSlimeName()+" wakes up and is so happy to meet you! This is only the beginning of your great journey!");
    }
}

