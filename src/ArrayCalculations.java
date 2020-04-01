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
    public static int columnSum(int[][] arr, int column){
        if(column < 0 || arr[0].length - 1< column){
            return -1;
        }
        else{
            int tot = 0;
            for(int i = 0; i < arr.length; i++){
                tot += arr[i][column];

            }
            return tot;
        }
    }
    public static int diagnolSum(int[][] arr, int direction){
        int t = 0;
        if(direction ==  1){
            int column = 0;
            int row = arr.length - 1;
            while(column < arr.length){
                t += arr[row][column];
                column++;
                row--;
            }

        }
        else if(direction == 0){
            int column = 0;
            int row = 0;
            while(column<arr.length){
                t += arr[row][column];
                column++;
                row++;


            }
        }else{
            t = -1;
        }
        return t;
    }



}
