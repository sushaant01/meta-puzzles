package UniformIntegers;

public class UniformIntegers {
    public static void main(String[] args) {

        long A = 999999999999L ;
        long B = 999999999999L ;
        System.out.println(getUniformIntegerCountInInterval(A,B));
    }

      
  public static int getUniformIntegerCountInInterval(long A, long B) {
    // Write your code here
    //int returnCount = 0;
		//int returnCount = 0;
    long mindigits = (long)Math.log10(A)+1;
		long maxdigits = (long)Math.log10(B)+1;
		long firstDigit = (long) (A / (Math.pow(10,mindigits-1)));
		long lastDigit = (long) (B / (Math.pow(10,maxdigits-1)));
    long possiblecount =  ((maxdigits - mindigits )* 9) + lastDigit - firstDigit + 1;
		long firstUniform = firstDigit;
		long lastUniform = lastDigit;
		for (int i = 1 ; i < mindigits ; i ++ ) {
			firstUniform = (firstUniform * 10) + firstDigit;
		}
		
		for (int i = 1 ; i < maxdigits ; i ++ ) {
			lastUniform = (lastUniform * 10) + lastDigit;
		}
		
		if ( A > firstUniform ) {
			possiblecount--;
		}
		
		if ( B < lastUniform ) {
			possiblecount--;
		}
    
    
    return Long.valueOf(possiblecount).intValue();
  }
}
