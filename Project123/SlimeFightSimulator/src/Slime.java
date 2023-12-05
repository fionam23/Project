/**The Slime Class represents a Slime. It'll hold all the attributes of a Slime object.
 *
 */

public class Slime {

    private String type;
    private int health;
    private int healthCap;

    private int attackPower;

    private MoveSet moveSet;

    private String affliction;



    public String slimeName;

    private Slime newSlime;

    /**Constructor for Slime class. The constructor holds all Slime info. It is instantiated in GenerateSlime.
     *
     * @param typ represents the elemental type of the Slime
     * @param hp represents the health of the Slime
     * @param atk represents the attack Power of the Slime
     */
    public Slime(String typ, int hp, int atk){
        healthCap = hp;
        type = typ;
        health = hp;
        attackPower = atk;
        slimeName = "";
        moveSet = new MoveSet(this);


    }

    /**Getter Methods
     *
     * @return returns health, attackPower, and type
     */
    public String getSlimeName(){
        return slimeName;
    }
    public int getHealth(){
        return health;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public String getType(){
        return type;
    }
    public MoveSet getMoveSet(){
        return moveSet;
    }
    public int getHealthCap(){
        return healthCap;
    }

    /**Setter Method setSlimeName sets the slimes name to a different string.
     *
     * @param rename reprents the new name the player would like to change the Slime's name to.
     */

    public void setSlimeName(String rename){
        slimeName = rename;
    }

    /**Setter Method setHeath sets the Slime's CURRENT health to something new.
     *
     * @param newHealth represents the new Health int value.
     */
    public void setHealth(int newHealth){
        health = newHealth;
    }


    public void setAffliction(){

    }

    /** levelUp Method of Slime class. This will increase a slime's overall ability.
     *
     * @param level represents the player's userLevel. The Slime will level up according to that.
     */
    public void levelUp(int level){
        attackPower = 10*level;
        healthCap = 10*(10*level);
    }

    /** isAlive Method. This Method is a checker, which checks the current state of a Slime.
     *
     * @return returns the state of the Slime.(Whether it is alive or dead)
     */
    public boolean isAlive(){
        if(!(health>0)){
            return false;
        }
        return true;
    }

}
