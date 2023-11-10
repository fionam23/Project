public class GenerateSlime {
    private int level;
    private int health;
    private int attackPower;
    private int rarityMultiplier;

    int random0to4 = (int) Math.random()*10;


    //multipliers


    public GenerateSlime(int userLevel) {
        level = 50 * userLevel;
        setHealth();
        setAttackPower();

    }

    private void setHealth(){
        health = level * 100 * rarityMultiplier;
    }

    private void setAttackPower(){
        attackPower = level / 5 * rarityMultiplier;
    }
    public void setAll(){
        setHealth();
        setAttackPower();
    }

}
