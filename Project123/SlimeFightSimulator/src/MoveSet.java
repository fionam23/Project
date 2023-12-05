public class MoveSet {

    private Move move1;

    private Move move2;

    private Move move3;

    private Move move4;

    /**Constructor for MoveSet class. This class is like a container for the Moves a slime will have.
     *
     * @param slime represents the Slime you will be generating a Move Set for.
     */

    public MoveSet(Slime slime){
        generateNewMoves(slime.getType(), slime.getHealthCap());
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

    /**generateNewMoves method for MoveSet class. This method's purpose is to create randomized moves. It will also give more moves as they level up. It starts with one move.
     *
     * @param type reprents the slime's elemental type. Determines the list of moves they have to choose from.
     * @param health represents the slime's health. This is the standard for measuring the level of the slime.
     */
    public void generateNewMoves(String type, int health){
        if (health>=400){
            if(type.equals("Pyro")){
                move1 = randomPyroMove();
                while(move2.equals(move1)){
                    move2 = randomPyroMove();
                }
                move3 = randomNeutralMove();
                move4 = randomShadowMove();
            } else if (type.equals("Hydro")) {
                move1 = randomHydroMove();
                move2 = randomHydroMove();
                while (move2.equals(move1)){
                    move2 = randomHydroMove();
                }
                move3 = randomNeutralMove();
                move4 = randomNeutralMove();
                while (move4.equals(move3)){
                    move4 = randomNeutralMove();
                }

            }
            else {
                move1 = randomNeutralMove();
            }

        } else if (health>=300) {
            
        } else if (health>=200) {
            if(type.equals("Pyro")){
                move1 = randomPyroMove();
                move2 = randomNeutralMove();
            } else if (type.equals("Hydro")) {
                move1 = randomHydroMove();
                move2 = randomNeutralMove();

            }
            else if(type.equals("Cryo")){
                move1 = randomCryoMove();
                move2 = randomNeutralMove();
            } else if (type.equals("Electro")) {
                move1 = randomElectroMove();
                move2 = randomNeutralMove();
            } else if (type.equals("Shadow")) {
                move1 = randomShadowMove();
                move2 = randomNeutralMove();
            } else if (type.equals("Light")) {
                move1 = randomLightMove();
                move2 = randomNeutralMove();
            }

        } else {
            move1 =  randomNeutralMove();
            move2 = null;
            move3 = null;
            move4 = null;
        }

    }

    public Move randomNeutralMove(){
        return ListOfMoves.getNeutralMoves()[GenerateSlime.randomNumber(ListOfMoves.getNeutralMoves().length)];
    }
    public Move randomPyroMove(){
        return ListOfMoves.getPyroMoves()[GenerateSlime.randomNumber(ListOfMoves.getPyroMoves().length)];
    }
    public Move randomCryoMove(){
        return ListOfMoves.getCryoMoves()[GenerateSlime.randomNumber(ListOfMoves.getCryoMoves().length)];
    }
    public Move randomHydroMove(){
        return ListOfMoves.getHydroMoves()[GenerateSlime.randomNumber(ListOfMoves.getHydroMoves().length)];
    }
    public Move randomElectroMove(){
        return ListOfMoves.getElectroMoves()[GenerateSlime.randomNumber(ListOfMoves.getElectroMoves().length)];
    }
    public Move randomShadowMove(){
        return ListOfMoves.getShadowMoves()[GenerateSlime.randomNumber(ListOfMoves.getShadowMoves().length)];
    }
    public Move randomLightMove(){
        return ListOfMoves.getLightMoves()[GenerateSlime.randomNumber(ListOfMoves.getLightMoves().length)];
    }
}
