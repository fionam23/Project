public class Move {
    private String moveName;
    private String actionType;
    private String elementType;

    private int Effectiveness;
    public Move(String actType, int power, String elType, String name){
        moveName = name;
        actionType = actType;
        elementType = elType;
        Effectiveness = power;
    }

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
