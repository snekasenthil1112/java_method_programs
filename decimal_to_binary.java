import java.util.Scanner;
public class decimal_binary{
    public static void decimaltobinary(int n)
    {
        int[] binarynum = new int[1000];
        int i=0;
        while(n>0) //12>0 6>0 3>0 1>0 0>0
        {
            binarynum[i] = n%2; //0 0 1 1
            n/=2;//6 3 1 0
            i++; //1 2 3 4
        }
        //0 0 1 1
        for(int j=i-1;j>=0;j--)
        System.out.print(binarynum[j]);
    }

    public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the decimal no:");
    int n = in.nextInt();
    System.out.println("The decimal no:" + n);
    System.out.print("the Binary no:");
    decimaltobinary(n);
    } 
}

/*  output
Enter the decimal no:
12
The decimal no:12
the Binary no:1100
*/
