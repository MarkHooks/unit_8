public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max)
    {
        int result;
        result = (int)(Math.random()*max)+min;

        return result;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int num =0;
        int player = spin(1,10);
        int computer = spin(2,8);
        boolean tie = false;
        while(num<2) {
            if (player < computer) {
                System.out.println("Computer wins by"+(computer-player)+"points");
            } else if (player > computer) {
                System.out.println("User wins by "+(player-computer)+"points");
            } else if (player==computer){
                tie = true;
                System.out.println("tie");
            }
            num++;
        }


    }
}
