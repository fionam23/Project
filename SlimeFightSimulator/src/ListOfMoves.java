public class ListOfMoves {

    //Hydro moves
    public static Move Hurricane = new Move("Combat", 2, "Hydro", "Hurricane");
    public static Move Purify = new Move("Healing", 3 , "Hydro", "Purify");
    public static Move MudSplat = new Move ("Combat", 3, "Hydro", "Mud Splat");


    //Pyro moves
    public static Move Seer = new Move("Combat", 2, "Pyro", "Seer");

    public static Move HeatWave = new Move("Combat", 3, "Pyro", "Heat Wave");
    public static Move Combust = new Move("Combat",5,"Pyro", "Combust");

    //Electro moves


    public static Move Shock = new Move("Combat",2, "Electro", "Shock");
    public static Move SuperCharge = new Move("Combat", 3, "Electro", "Super Charge");

    //Cryo moves

    public static Move Icicle = new Move("Combat", 3, "Cryo", "Icicle");
    public static Move Shield = new Move("Defense", 50, "Cryo", "Shield");

    //Shadow moves
    public static Move Crush = new Move("Combat", 3, "Shadow", "Crush");

    //Light moves
    public static Move BlindingBeam = new Move("Combat", 3, "Light", "Blinding Beam");

    //Neutral moves

    public static Move Bounce = new Move("Combat",1, "Neutral", "Bounce");

    public static Move pickRandomPyroMove(){
        int random = GenerateSlime.randomNumber();
        if(random)
        return
    }
}
