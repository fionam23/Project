/**
 * The UserStats class will hold every bit of relevant info about the player. Currently holding only one value.
 */

public class UserStats {
    private int userLevel = 1;

    /**Constructor for userLevel class. Just contains the user level.
     *
     */


    public UserStats(){
        userLevel = 1;
    }

    /**
     * Getter Method
     * @return returns user level.
     */
    public int getUserLevel(){
        return userLevel;
    }

    /**
     * Setter Method
     * @param userLevel new userlevel value to set to.
     */
    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }
}
