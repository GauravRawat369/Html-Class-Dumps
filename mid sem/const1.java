class teacher1
{
    public teacher1(int a)
    {
        System.out.println("hello bacchooo........"+a+".. bar");
    }
}
public class const1 extends teacher1
{
    public const1(int a)
    {
        super(a);
        System.out.println("hi");
    }
    public static void main(String [] args)
    {
        // teacher1 q = new const1(2);  //dynamic binding
        const1 q = new const1(2);     // static binding
    }
}