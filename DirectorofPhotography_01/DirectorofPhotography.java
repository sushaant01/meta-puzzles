package DirectorofPhotography_01;

public class DirectorofPhotography {
    
    public static void main(String[] args) {

        int  N = 8;
        String C = ".PBAAP.B" ;
        int X = 1;
        int Y = 3;
        System.out.println(getArtisticPhotographCount(N,C,X,Y));
    }
    public static int getArtisticPhotographCount(int N, String C, int X, int Y) {
        // Write your code here
        int returnValue = 0;
        for (int i = 0 ; i < C.length() ; i ++ ){
            if (C.charAt(i) == 'P' ){
              for (int j = 0 ; j < C.length() ; j ++ ){
                if ( C.charAt(j) == 'A'   && Math.abs(i - j) >=X && Math.abs(i - j) <= Y  ){
                          int intbackstart = 0;
                            int intbackend = C.length();
                            if ( i > j) {
                                intbackend = j ;
                            } else {
                                intbackstart = j + 1;
                            }
                          for (int k = intbackstart ; k< intbackend ; k ++ ){
                       if ( C.charAt(k) == 'B' && Math.abs(k - j) >=X && Math.abs(k - j) <= Y  ){
                          returnValue++;         
                       }   
                  }
                }
            }
            }
        }
        return returnValue;
      }

}
