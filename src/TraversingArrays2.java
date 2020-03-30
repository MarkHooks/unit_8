public class TraversingArrays2 {
    public static boolean square(int[][] arr){
        boolean square = false;
        for(int row = 0; row<arr.length; row++){
            for (int col = 0; col <arr[0].length; col++)
                if(arr[row].length ==arr[col].length){
                    square= true;
                }else{
                    square = false;
                }
        }
        return square;

    }
    public static void main(String[] args){
        int[][] arr = {{21,-4, 89}, {65,33,1}, {8,3,99}, {-2,3,1}};
        System.out.println(square(arr));
    }
}
