import javax.swing.*;

/**
 * @author Mark Hooks
 * @since 4/7/2020
 */
public class MagicSquare {
    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     *
     * @param row finds what row to get the sum of
     * @return returns the sum of the row
     */

    public int rowSum(int row) {
        // <<< Complete the code >>>
        int s = 0;
        for(int i = 0; i<grid[row].length; i++){
            s += grid[row][i];
        }
        return s;
    }

    /**
     *
     * @param col finds the column in which to get the sum
     * @return returns the sum of the column
     */

    public int colSum(int col) {
        // <<< Complete the code >>>
        int s = 0;
        for(int i = 0; i<grid.length; i++){
            s += grid[i][col];
        }
        return s;
    }

    /**
     * finds the the upward diagonal sum of the square
     * @return returns the sum
     */

    public int upDiagSum() {
        // <<< Complete the code >>>
        int s = 0;
        int row= grid[0].length - 1;
        int col = 0;
        while(col< grid[0].length){
            s += grid[row][col];
            col++;
            row--;
        }
        return s;
    }

    /**
     * this finds the downward diagonal sum of the square
     * @return returns the sum
     */
    public int downDiagSum() {
        // <<< Complete the code >>>
        int s = 0;
        int row= 0;
        int col = 0;
        while(col< grid.length){
            s += grid[row][col];
            row++;
            col++;

        }
        return s;
    }

    /**
     * this finds whether or not all sums are equal to eachotther
     * @return returns wether or not its a magic square
     */
    public boolean isMagicSquare() {
        // <<< Complete the code >>>
        boolean t = true;
        int row = 0;
        int col =0;
        for(int i = 0; i<grid.length; i ++){
            if(rowSum(i) != colSum(i)){
                return false;
            }else if (rowSum(i)!=downDiagSum()){
                return false;
            }else if (rowSum(i)!= upDiagSum()){
                return false;
            }
        }
        return true;

    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

