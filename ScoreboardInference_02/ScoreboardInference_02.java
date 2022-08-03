package ScoreboardInference_02;

import java.util.Arrays;

public class ScoreboardInference_02 {

    // I tried all possible test cases and its working fine , but when I submit my code I get 1 wrong test case 
    public static void main(String[] args) {

        int N = 4;
        int S[] = {2, 4, 6, 8};
        System.out.println(getMinProblemCount(N,S));
    }
    public static int getMinProblemCount(int N, int[] S) {
        Arrays.sort(S);
      int intSingle =0; 
      int intDouble = 0;
      int intTripple = 0;
      int modOne = 0;
      int modTwo = 0;
      int modOdd = 0;
      int counter = 0;
      
      for (int i = 0 ; i< N ; i++){
          if (  modOne > 0 && modTwo > 0 && modOdd > 0) {
              break;
          }
          
          if (  S[i]  % 3 == 2){
              modTwo++;
          }
          if ( S[i]  % 3 == 1){
              modOne++;
          }
        
            if ( S[i]  % 2 == 1){
                modOdd++;
            }
      }
      
      int lastDigit = S[N -1];
      intTripple = lastDigit / 3;
  
      if (lastDigit % 3 == 2 ){
          intDouble++;
      }else  if (lastDigit % 3 == 1 ){
          intSingle++;
      }

        if(intTripple > 0){
          
         if(modOne > 0 &&  intSingle == 0 ){
            intDouble++;
            intSingle++;
            intTripple--;
            }
          
            if (modTwo > 0 && intDouble == 0){
                intDouble++;
                intSingle++;
                intTripple--;
                
            }
          
                          if (intSingle == 2 && S[0] != 1 && intTripple > 0 ) {
                intDouble++;
                intSingle = 0;            	
              }
          

        }else {
               if(modOne > 0 &&  intSingle == 0 && intDouble >=1 ){
                      intDouble--;
                      intSingle = 2;
               }
              
          }
  
           if (intSingle >= 2 && S[0] != 1  && intTripple > 0 ) {
            intDouble++;
            intSingle = intSingle -2;            	
          }
  
              if (intSingle == 1 && intDouble == 2 ) {
              intSingle++;
              intDouble = 0;
              intTripple++;
          }
  
              if ( modOdd == 0 && intTripple == 0 && intSingle == 2 && intDouble == 1) {
              intDouble++;
              intSingle = 0 ;
          }
      counter = intSingle + intDouble + intTripple;

  return counter ;


}

}
