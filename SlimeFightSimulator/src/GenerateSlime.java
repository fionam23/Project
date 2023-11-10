public class GenerateSlime {


    private int level;
    private int health;
    private int attackPower;

    private String type;

    private Slime newSlime;
    private int rarityMultiplier;

    int random0to4 = (int) Math.random()*10;


    //multipliers


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


    public Slime getNewSlime(){
        return newSlime;
    }

}
