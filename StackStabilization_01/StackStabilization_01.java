package StackStabilization_01;

public class StackStabilization_01 {
    

    public static void main(String[] args) {

        int N = 4;
        int R[] = {6, 5, 4, 3};
        System.out.println(getMinimumDeflatedDiscCount(N,R));
    }
    public static  int getMinimumDeflatedDiscCount(int N, int[] R) {
        // Write your code here
                int counter = 0;
            for ( int i = R.length -1 ; i >  0  ; i--) {
                
                if (R[i] <= R [i-1]) {
                    counter++;
                    R [i-1] = R[i] -1;
            if (R[i -1] == 0 ) {
                    counter = -1;
              break;
                }
                }
            }
        return counter;
      }

}
