public class ArrayCalculations {
    public static int rowSum(int[][] arr, int row) {
        int sum = 0;
        if(row < 0 || arr[0].length - 1< row){
            return -1;
        }
        else{
            int tot = 0;
            for(int i = 0; i < arr[row].length; i++){
                tot += arr[row ][i];

            }
            return tot;
        }


    }


}
