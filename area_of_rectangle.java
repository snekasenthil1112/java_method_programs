class rectangle 
{
    int length,width;
    void getdetails(int x,int y)
    {
        length = x;
        width = y;
    }
    int area() 
    { 
        int a = length * width;
        return a;
    }
}
public class class_object
{
public static void main(String[] args)
{
    rectangle o1 = new rectangle();
    o1.length = 10;
    o1.width = 20;
    System.out.println("Area of racctangle:" + o1.area());
}
}

/*   output 
  Area of racctangle:200
*/
