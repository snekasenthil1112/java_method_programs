public class bin_dec {
    public static int bin2dec(int binary)
    {
      int decimal = 0,power = 0;
      while (binary !=0)
      {
          int remainder = binary % 10;
          decimal += remainder + Math.pow(2,power);
          binary = binary/ 10;
          power++;
      }
      return decimal;
    }
    public static void main(String args[])
    {
        System.out.println("The decimal no:" + bin2dec(1110));
    }
}

/* output
The decimal no:18
*/
