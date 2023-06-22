import java.util.*;
class array
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of your array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}