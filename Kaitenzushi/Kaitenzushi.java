package Kaitenzushi;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kaitenzushi {
    public static void main(String[] args) {

        int N = 7;
        int D[] = {1, 2, 1, 2, 1, 2, 1};
        int K = 2 ;
        System.out.println(getMaximumEatenDishCount(N,D,K));
    }

    public static int getMaximumEatenDishCount(int N, int[] D, int K) {
        // Write your code here
        int intDishCount = 1;
          Set<Integer> eatenDish = new LinkedHashSet<>();
          eatenDish.add(D[0]);
          for (int i = 1 ; i < N ; i ++){
              if(eatenDish.contains(D[i]) == false) {
                 if ( eatenDish.size() == K ){
                  Integer firstVal = eatenDish.iterator().next();
                   eatenDish.remove(firstVal);
                  }
                  eatenDish.add(D[i]);
                  intDishCount++;
              }            
          }
        return intDishCount;
      }

}
