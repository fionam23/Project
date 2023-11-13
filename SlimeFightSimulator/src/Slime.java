import java.util.ArrayList;

public class Slime {

    private String type;
    private int health;
    private int healthCap;

    private int attackPower;

    private MoveSet moveSet;


    public String slimeName;

    private Slime newSlime;
    public Slime(String typ, int hp, int atk){
        healthCap = hp;
        type = typ;
        health = hp;
        attackPower = atk;
        slimeName = "";

        GenerateMoves generateMoves = new GenerateMoves(this);

        moveSet = new MoveSet(generateMoves.getMove1());


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

    public void setSlimeName(String rename){
        slimeName = rename;
    }

    public MoveSet getMoveSet(){
        return moveSet;
    }

    public void setHealth(int newHealth){
        health = newHealth;
    }
    public int getHealthCap(){
        return healthCap;
    }

}
