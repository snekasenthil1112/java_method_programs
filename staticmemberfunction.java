class mathematics{
    public static int power(int base,int power)
    {
        int result = 1;
        for(int i=1;i<=base;i++)
        {
            result*=base;
        }
    return result;
    }
}
public class example{

public static void main(String[] args)
{
    System.out.println("mathematics"+ mathematics.power(2,5));
    
}
}
