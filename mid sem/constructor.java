import java.util.*;
class constructor{

    int x;
    public constructor()
    {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        // x = 10;
    }
    public static void main(String[] args)
    {
        constructor c1 = new constructor();
        System.out.println(c1.x);   

    }
}