import java.util.ArrayList;

public class TwoDArray {
    public static void main(String[] args){
        int[][] arr = {{21,-4, 89}, {65,33,1}, {8,3,99}, {-2,3,1}};
        System.out.println(maxValue(arr));
    }
    public static int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row++){
            for (int col = 0; col <arr[0].length; col++)
                  if(arr[row][col]> max){
                max = arr[row][col];
            }
        }
        return max;
    }
    public static int sumAll(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row++){
            for (int col = 0; col <arr[0].length; col++)
                if(arr[row][col]> max){
                    max = arr[row][col];
                }
        }
        return max;
    }




}
