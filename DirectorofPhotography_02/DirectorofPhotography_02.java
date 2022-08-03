package DirectorofPhotography_02;

public class DirectorofPhotography_02 {

    // This code is working fine but getting time limit exceeded for 6 test cases , so still working 
    public static void main(String[] args) {

        int  N = 8;
        String C = ".PBAAP.B" ;
        int X = 1;
        int Y = 3;
        System.out.println(getArtisticPhotographCount(N,C,X,Y));
    }

    public static long getArtisticPhotographCount(int N, String C, int X, int Y) {
        // Write your code here
             int returnValue = 0;
             for (int intP = 0 ; intP < N -1 ; intP++) {
                 intP = C.indexOf("P",intP);
                 if (intP >= 0) {
                     int intAStart = intP - Y ;
                     int intAEnd = intP + Y ;
               /*
                     if(intAStart <0) {
                         intAStart =0;
                     }*/
                     if(intAEnd > N) {
                         intAEnd = N-1;
                     }	    			
                     
                     for (int intA = intAStart;  intA <= intAEnd ;intA++) {
                         
                         intA = C.indexOf("A",intA);	
                         if (intA <= intAEnd && intA >=0 ) {
                             
                             int diff = getPositive(intP - intA);
                             if (boolCheck(X, Y, diff)  ){
                                 
                                 int intBStart = intA - Y ;
                                 int intBEnd = intA + Y ;
                     /*
                                 if(intBStart <0) {
                                     intBStart =0;
                                 }*/
                                 if(intBEnd > N) {
                                     intBEnd = N-1;
                                 }
                                 
                                 for (int intB = intBStart ;  intB <= intBEnd ;intB++) {
                                     intB = C.indexOf("B",intB);
                                     
                                     if (intB <= intBEnd && intB >=0  ) {
                           if (intP > intA) {
                             diff = intA - intB;  
                           }else {
                             diff = intB - intA;  
                           }
                           
                           if ( boolCheck(X, Y, diff) ){ 
                             returnValue++;
                           }
                                         
                                     }else {
                                         intB = intBEnd+1;
                                     }
                                     
                                 }
                             }
                             
                         } else {
                             intA = intAEnd+1;
                         }
                         
                     }
                     
                 }else {
                     intP = N+1;
               //intP++;
                 }
             }
             
         return returnValue;
     
     
       }
       
       public static boolean boolCheck(int intX, int intY, int intDiff){
         boolean boolReturn = (intDiff >= intX && intDiff <= intY ) ? true : false;
         return     boolReturn;
     
       }
       public static int getPositive(int intput){
         int returnVal = (intput < 0) ? -intput : intput;
         return returnVal;
       }
}
