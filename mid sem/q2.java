class q2
{
    public static void main(int x)
    {
        System.out.println("one");
    }
    public static void main(int x,int y)
    {
        System.out.println("one and two");
    }
    public static void main(boolean x)
    {
        System.out.println("bool one");
    }
    public static void main(String t[] )
    {
        main(1);
        main(2,2);
        main(false);
    }
}