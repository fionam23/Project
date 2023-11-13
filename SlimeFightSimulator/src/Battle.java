
public class Battle {
    private static Slime wildSlime;
    private UserStats theUser;
    private static Slime activeSlime;
    public Battle(UserStats userStats, Slime ally){
        theUser = userStats;
        activeSlime = ally;
        wildSlime = new GenerateSlime(theUser.getUserLevel(),GenerateSlime.pickRandomType()).getNewSlime();
    }

    public static String commenceBattle(UserStats theUser){
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


    public static String displayMoveSet(){
        return "----------------------\n"+
                "Move Set of "+activeSlime.slimeName+"\n" +
                "Move 1: "+activeSlime.getMoveSet().getMove1().getMoveName()+"("+activeSlime.getMoveSet().getMove1().getActionType()+" move, Effectiveness: "+activeSlime.getMoveSet().getMove1().Effectiveness()+")";
    }
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
    public Slime getWildSlime(){
        return wildSlime;
    }
    public Slime getActiveSlime(){
        return activeSlime;
    }
    public Move wildAttack(){
        int random = GenerateSlime.randomNumber(4);
        Move action = null;
        if(random == 1){
            action = wildSlime.getMoveSet().getMove1();
        } else if (random == 2) {
            action = wildSlime.getMoveSet().getMove2();
        } else if (random == 3) {
            action = wildSlime.getMoveSet().getMove3();
        }
    }
}
