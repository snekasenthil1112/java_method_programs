public class function {
    public static int[] sendarray()
    {
        return new int[]{1,2,3};
    }
    public static void main(String args[]){
        int arr[]=sendarray();
        for(int a :arr)
        System.out.println(a);
    }
}
//returning an integer array

/*output:
1
2
3
*/
