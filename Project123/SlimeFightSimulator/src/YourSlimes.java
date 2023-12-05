import java.util.ArrayList;

/**The YourSlimes class is an archive of all your saved slimes.
 *
 */

public class YourSlimes {
    private ArrayList<Slime> box = new ArrayList<Slime>();

    /** Constructor for the YourSlimes class. Creates a new "box" in which to store your Slimes.
     *
     * @param starting represents your starting slime, the very first slime you recieve at the beginning.
     */
    public YourSlimes(Slime starting){
        box.add(starting);
    }

    /** addSlimeToBox method
     * Adds param slime to the box ArrayList.
     * @param slime represents the slime to be added
     */

    public void addSlimeToBox(Slime slime){
        box.add(slime);
    }

    /**Getter Method getFirstNotDeadSlime. Gets the first slime that has the condition isAlive set to true.
     *
     *
     * @return returns a slime in your box
     */
    public Slime getFirstNotDeadSlime(){
        Slime chosenOne = box.get(0);
        for(int i = 0; !chosenOne.isAlive(); i++){
            chosenOne = box.get(i);
        }
        return chosenOne;
    }

    /**Setter method setAllHealth
     * Sets all the slimes within your box to full heal. It essentially heals everyone.
     */
    public void setAllHealth(){
        for (int i = 0;i< box.size();i++){
            box.get(i).setHealth(box.get(i).getHealthCap());
        }
    }

    /**levelAllUp Method. Calls the levelUp method for all of your slimes in the box.
     *
     * @param userLvl represents player userLevel
     */
    public void levelAllUp(int userLvl){
        for (int i = 0; i< box.size(); i++){
            box.get(i).levelUp(userLvl);
        }
    }
}
