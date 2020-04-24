public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        n = 0;
        int y = 0;
        while(n>1){
            if(n %2 ==0){
                n=n/2;
            }else{
                n*=3;
                n+=1;
            }
            y++;
        }
        return y;

    }



    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        boolean x = false;
        if(hailstoneLength(n)>n){
            x = true;
        }
        return x;
    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
        double d = 0.0;
        int c = 0;
        for(int i = 0; i<= n; i++) {
            if (isLongSeq(n)) {
                c++;
            }
            d = (double) c/n;
        }
        return d;

    }

    // There may be instance variables, constructors, and methods not shown.
}
