/**
 * The Move class represents a Move that a slime can use. A move has information like its name, action type, element type, and effectiveness.
 */

public class Move {
    private String moveName;
    private String actionType;
    private String elementType;

    private int Effectiveness;
    /**Constructore for the Move class. This creates a new instance of a Move given the below parameters:
     * @param actType represents the action type (Fighting, Healing, others)
     * @param power represents the effectiveness value, which will be used to calculate damage
     * @param elType represents the elemental type, which will be used in future implementation to make a better battling system
     * @param name represents the name of the Move
     */
    public Move(String actType, int power, String elType, String name){
        moveName = name;
        actionType = actType;
        elementType = elType;
        Effectiveness = power;
    }

    /**Getter Methods
     *
     * @return
     */



    public String getMoveName(){
        return moveName;
    }

    public String getActionType(){
        return actionType;
    }
    public String getElementType(){
        return elementType;
    }
    public int Effectiveness(){
        return Effectiveness;
    }


}
