import java.util.Objects;

public class GenerateMoves {
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;

    private boolean specialMove = false;
    public GenerateMoves(Slime slime){
        if (GenerateSlime.randomNumber(30)==1){
            specialMove = true;
        }
        int random =GenerateSlime.randomNumber();
        if(Objects.equals(slime.getType(), "Pyro")){
            if(specialMove){
                move1 = ListOfMoves.Combust;
            }
            move1 = ListOfMoves.Seer;

        } else if (Objects.equals(slime.getType(), "Hydro")) {
            move1 = ListOfMoves.Hurricane;

        } else if (Objects.equals(slime.getType(), "Cryo")) {
            move1 = ListOfMoves.Icicle;

        } else if (Objects.equals(slime.getType(), "Electro")) {
            move1 = ListOfMoves.Shock;

        } else if (Objects.equals(slime.getType(),"Shadow")) {
            move1 = ListOfMoves.Crush;
        } else if (Objects.equals(slime.getType(),"Light")) {
            move1 = ListOfMoves.BlindingBeam;
        }

    }


    public Move getMove1(){
        return move1;
    }
    public Move getMove2(){
        return move2;
    }
    public Move getMove3(){
        return move3;
    }
    public Move getMove4(){
        return move4;
    }

}
