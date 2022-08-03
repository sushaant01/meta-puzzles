package ScoreboardInference_01;

import java.util.Arrays;

public class ScoreboardInference_01 {
    
    public static void main(String[] args) {

        int N = 4;
        int S[] = {2, 4, 6, 8};
        System.out.println(getMinProblemCount(N,S));
    }

    public static int getMinProblemCount(int N, int[] S) {
        // Write your code here
            int intSingle =0; 
            int intDouble = 0;
            int intOddCount = 0;
            Arrays.sort(S);
            for ( int i = 0 ; i < S.length ; i ++){
                if ( S[i] % 2 == 1 ){
                    intOddCount ++;
                    break;
                }
    
            }
    
            intDouble = S[N-1]/2;
            intSingle = S[N-1] % 2;
            if (intOddCount > 0 && intSingle == 0 ){
              intSingle = 2;
              intDouble --;
            }
        return (intSingle + intDouble) ;
      }
      
}
