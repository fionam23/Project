import java.util.ArrayList;

public class ListOfMoves {

    /**ListOfMoves is a class without a constructor made for the sole purpose of defining Moves. All the currently defined moves are below:
     *
     */




    //Hydro moves
;
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
    public static Move FakeOut = new Move("Combat",1, "Neutral", "Fake Out");
    public ListOfMoves(){

    }

    /**Getter Methods for ListOfMoves class. These would be called if you would like to get pre-categorized moves in an array. This might not be the best way to return the categorized moves, since you would have to modify the methods every time you add a move.
     *
     * @return Currently returns a list of Moves corresponding to their elemental types
     */
    public static Move[] getHydroMoves(){
        Move[] hydroMoves = new Move[2];
        hydroMoves[0] = Purify;
        hydroMoves[1] = MudSplat;
        return hydroMoves;
    }
    public static Move[] getPyroMoves(){
        Move[] pyroMoves = new Move[3];
        pyroMoves[0] = Seer;
        pyroMoves[1] = HeatWave;
        pyroMoves[2] = Combust;
        return pyroMoves;
    }

    public static Move[] getCryoMoves(){
        Move[] cryoMoves = new Move[2];
        cryoMoves[0] = Icicle;
        cryoMoves[1] = Shield;
        return cryoMoves;
    }
    public static Move[] getShadowMoves(){
        Move[] shadowMoves = new Move[1];
        shadowMoves[0] = Crush;
        return shadowMoves;
    }
    public static Move[] getLightMoves(){
        Move[] lightMoves = new Move[1];
        lightMoves[0] = BlindingBeam;
        return lightMoves;
    }
    public static Move[] getElectroMoves(){
        Move[] electroMoves = new Move[2];
        electroMoves[0] = Shock;
        electroMoves[1] = SuperCharge;
        return electroMoves;
    }

    public static Move[] getNeutralMoves(){
        Move[] neutralMoves = new Move[2];
        neutralMoves[0] = Bounce;
        neutralMoves[1] = FakeOut;
        return neutralMoves;
    }

}
