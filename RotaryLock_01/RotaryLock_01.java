package RotaryLock_01;


public class RotaryLock_01 {
    public static void main(String[] args) {

        int N = 10;
        int M = 4;
        int C[] = {9, 4, 4, 8};
        System.out.println(getMinCodeEntryTime(N,M,C));
    }

    public static long getMinCodeEntryTime(int N, int M, int[] C) {
        // Write your code here
        int intLastDigit = 1;
        int intMiddle = N / 2;
        long intReturnCounter = 0;
        int intDiff  = 0;
        for ( int i = 0; i < M ; i++){
          intDiff = Math.abs(C[i] - intLastDigit);
          if ( intDiff > 0 ){
            if ( intDiff > intMiddle ){
              intReturnCounter = intReturnCounter + N - intDiff;
            } else {
              intReturnCounter = intReturnCounter + intDiff;
            }
          }
          intLastDigit = C[i];
        }
        return intReturnCounter;
      }
      

}
