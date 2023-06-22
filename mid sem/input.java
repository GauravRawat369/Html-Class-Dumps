import java.util.*;

class input
{
    public static boolean ispal(int num)
    {
        int rem = 0;
        int val = num;
        while(num > 0)
        {
            rem = rem*10 + num%10;
            num = num/10;
        }
        if(val == rem)
        return true;
        else
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = sc.nextInt();
        if(ispal(a))
        System.out.print("yes");
        else
        System.out.print("no");
    }
}