/**
 * @param {number} N
 * @param {number} K
 * @param {number} M
 * @param {number[]} S
 * @return {number}
 */
 function getMaxAdditionalDinersCount(N, K, M, S) {
    // Write your code here
      var returnCount = 0;
      S.sort(function(a, b){return a-b});
      //int arrayCounter =0;
      
      var distance = K + 1;
      returnCount = returnCount +  Math.floor(( S[0] / distance )) ;
      if (( S[0] % distance ) == 0 ){
        returnCount--;
      }
     if ( S.length > 1 ){
      for ( i = 0 ; i < S.length - 1; i ++){
        returnCount = returnCount +  Math.floor( (S[i + 1]- S[i ]) / distance )-1;
          
      }
     }
      returnCount = returnCount +  Math.floor(( (N- S[S.length - 1]) / distance ));
      // var longExtra = ((N- S[S.length - 1] ) % distance);
     // if ( longExtra > K){
      //  returnCount++;
     //}
    return returnCount ;
  }