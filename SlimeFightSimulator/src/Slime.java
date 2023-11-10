public class Slime {

    private String type;
    private int health;

    private int attackPower;

    public String slimeName;

    private Slime newSlime;
    public Slime(String typ, int hp, int atk){
        type = typ;
        health = hp;
        attackPower = atk;
        slimeName = "";
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

}
