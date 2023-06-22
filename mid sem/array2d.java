import java.util.*;

class array2d{

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        System.out.print("enter number of colms");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                System.out.print(arr[i][j] + " ");
            }System.out.print("\n");
        }
    }
}