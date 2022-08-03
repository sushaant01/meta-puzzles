// Write any import statements here
import java.util.*;

class Cafeteria {
  
    public static void main(String[] args) {
        long N = 15;
        long K = 2;
        int M = 3;
        long S []= {11, 6, 14};
        System.out.println(getMaxAdditionalDinersCount(N,K,M,S));
    }
    public static long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
      // Write your code here
      long returnCount = 0;
      Arrays.sort(S);
      //int arrayCounter =0;
      
      long distance = K + K + 1;
      returnCount = (long) (returnCount +  Math.floor(( S[0] / distance )));
      if ( ( S[0] % distance ) > K ){
        returnCount++;
      }
      for (int i = 0 ; i < S.length - 1; i ++){
        returnCount = (long) (returnCount +  Math.floor( (S[i + 1]- S[i ]) / distance ));
        if (( (S[i + 1]- S[i ]) % distance )  == 0  ){
          returnCount--;
        }
      }
      returnCount = (long) (returnCount +  Math.floor(( (N- S[S.length - 1]) / distance )));
      long longExtra = ((N- S[S.length - 1] ) % distance);
      if ( longExtra > K){
        returnCount++;
      }
      return returnCount;
    
    }
    
  }
  