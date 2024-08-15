import java.util.Arrays;
import java.util.Scanner;
public class function {
    public static int[] sendarray()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        int [] a =new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value" + i +";");
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        return a;
    }
    public static void main(String args[]){
        int arr[]=sendarray();
        for(int a :arr)
        System.out.println(a);
    }
}

/* output
Enter the limit
3
Enter the value0;
10
Enter the value1;
9
Enter the value2;
1
1
9
10
/*
