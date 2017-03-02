// Description:

// Convert number to reversed array of digits

// Given a random number:

// C#: long;
// C++: unsigned long;
// You have to return the digits of this number within an array in reverse order.
// Example:

348597 => [7,9,5,8,4,3]

public class Kata {
static long ipow(long base, long exp)
{
   long result = 1;
   while (exp != 0)
   {
       if ((exp & 1) != 0)
           result *= base;
       exp >>= 1;
       base *= base;
   }

   return result;
}
  public static int[] digitize(long n) {
  System.out.println (n);
    int[] result = new int[String.valueOf(n).length()];
    int current = 0;
    for (int i = 0; i < result.length; i++){
    result[i] = (int)( (n %  (long)(ipow(10, (i + 1))) /(long)ipow(10, i)));
    System.out.println (result[i]);
    }
    System.out.println (result);
    return result;
  }
}