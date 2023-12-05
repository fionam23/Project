/** The Battle Class represents a Battle event. A new instance of this class is considered an event. All information about a particular battle is stored in here.
 *
 */
public class Battle {

    /**
     * This Battle class holds all the information for a Battle event.
     */
    private static Slime wildSlime;
    private UserStats theUser;
    private static Slime activeSlime;

    /**
     * Constructor for the Battle class. This creates a new instance of a Battle event.
     * @param userStats represents the
     * @param ally represents the Slime the player sends out to fight
     */
    public Battle(UserStats userStats, Slime ally){
        theUser = userStats;
        activeSlime = ally;
        wildSlime = new GenerateSlime(theUser.getUserLevel(),GenerateSlime.pickRandomType()).getNewSlime();
    }

    /**
     *commenceBattle method for the Battle class. This method returns a String that indicates the Battle has begun and that a new slime has appeared.
     * @return returns a string formatted with the Wild Slime's name and hp, and the slime the player has sent out to counter it.
     */

    public static String commenceBattle(){
        return "A wild "+wildSlime.slimeName+" appeared!\n" +
                "Current HP:"+wildSlime.getHealth()+"\n" +
                "Go "+activeSlime.slimeName+"!\n";
    }

    public static String Menu(){
        return """
                What will you do?
                --------------------
                F to fight | X to flee""";
    }

    /**
     * Menu method for the Battle class.
     * @return returns a basic string that displays options for acting
     */


    public static String displayMoveSet(){
        return "----------------------\n"+
                "Move Set of "+activeSlime.slimeName+"\n" +
                "Move 1: "+activeSlime.getMoveSet().getMove1().getMoveName()+"("+activeSlime.getMoveSet().getMove1().getActionType()+" move, Effectiveness: "+activeSlime.getMoveSet().getMove1().Effectiveness()+")";
    }

    /**
     * Attack method for the Battle class.
     * @param moveNumber represents the chosen move to use in your Slime's arsenal
     * @return returns the Move your Slime just performed
     */
    public Move Attack(int moveNumber){
        Move action = null;
        if (moveNumber == 1){
            action = activeSlime.getMoveSet().getMove1();
        } else if (moveNumber == 2) {
            action = activeSlime.getMoveSet().getMove2();
        } else if (moveNumber == 3) {
            action = activeSlime.getMoveSet().getMove3();
        } else {
            action = activeSlime.getMoveSet().getMove4();
        }

        if(action.getActionType().equals("Combat")){
            int totalDamage = activeSlime.getAttackPower()*action.Effectiveness();
            wildSlime.setHealth(wildSlime.getHealth()-totalDamage);
        } else if (action.getActionType().equals("Healing")) {
            int totalHealed = activeSlime.getHealthCap()/action.Effectiveness();
            activeSlime.setHealth(Math.min(totalHealed + activeSlime.getHealth(), activeSlime.getHealthCap()));
        }
        return action;
    }


    /**
     * opponentAttack
     * @param moveNumber represents the move the opposing Slime chooses from it's arsenal
     * @return returns the move the opponent just performed
     */

    public Move opponentAttack(int moveNumber){
        Move action = null;
        if (moveNumber == 1){
            action = wildSlime.getMoveSet().getMove1();
        } else if (moveNumber == 2) {
            action = wildSlime.getMoveSet().getMove2();
        } else if (moveNumber == 3) {
            action = wildSlime.getMoveSet().getMove3();
        } else {
            action = wildSlime.getMoveSet().getMove4();
        }

        if(action.equals(null)){
            action = wildSlime.getMoveSet().getMove1();
        }
        if(action.getActionType().equals("Combat")){
            int totalDamage = wildSlime.getAttackPower()*action.Effectiveness();
            activeSlime.setHealth(activeSlime.getHealth()-totalDamage);
        } else if(action.getActionType().equals("Healing")){
            int totalHealed = wildSlime.getHealthCap()/action.Effectiveness();
            wildSlime.setHealth(Math.min(totalHealed+wildSlime.getHealth(), activeSlime.getHealthCap()));
        }

        return action;
    }

    /**Getter Method getWildSlime
     *
     * @return returns the opposing slime in the battle.
     */
    public Slime getWildSlime(){
        return wildSlime;
    }

    /**Getter Method getActiveSlime
     *
     * @return returns your current active slime in the battle.
     */
    public Slime getActiveSlime(){
        return activeSlime;
    }
}
