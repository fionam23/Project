public class GenerateSlime {

    private String type;

    private Slime newSlime;

    /**Constructor for GenerateSlime class. This class can create a new random slime whose power matches the user's experience/level. Creates a new instance of the "Slime" object.
     *
     * @param userLevel represents the player's level. This will dictate the stats of the slime.
     * @param typ represents the element type of the Slime. It's function will be added in future implementation.
     */

    public GenerateSlime(int userLevel, String typ) {
        if(typ.equalsIgnoreCase("p")){
            type = "Pyro";
        } else if(typ.equalsIgnoreCase("c")){
            type = "Cryo";
        } else if(typ.equalsIgnoreCase("h")){
            type = "Hydro";
        } else if(typ.equalsIgnoreCase("e")){
            type = "Electro";
        } else if(typ.equalsIgnoreCase("s")){
            type = "Shadow";
        } else if (typ.equalsIgnoreCase("l")) {
            type = "Light";
        }
        newSlime = new Slime(type,10*(userLevel*10), 10*(userLevel));
        newSlime.setSlimeName(""+type+" Slime");
    }

    /** randomNumber method. Generates a random number. This is a global method which I have called in other classes, due to its great utility.
     *
     * @param range represents the range the random number will lie within.
     * @return returns the random number.
     */

    public static int randomNumber(int range){
        return  (int) (Math.random()*range);
    }


    /** pickRandomType method for GenerateSlime class. It picks a random type out of the currently available elemental types.
     *
     * @return returns a letter corresponding to an elemental type. This will be handled up in the constructor.
     */
    public static String pickRandomType(){
        int random = randomNumber(6)+1;      // param is the number of types available
        if (random== 1){
            return "p";
        } else if (random==2) {
            return "c";
        } else if (random==3) {
            return "h";
        } else if (random==4) {
            return "e";
        } else if (random==5) {
            return "s";
        }
        return "l";
    }

    /**getNewSlime method for GenerateSlime class. It returns the fully randomized slime. It can be saved for later use.
     *
     * @return returns the randomized slime.
     */

    public Slime getNewSlime(){
        return newSlime;
    }

}
