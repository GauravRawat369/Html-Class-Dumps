class teacher
{
    void teaches()
    {
        System.out.println("chapter 1 2 3 ......");
    }
}
class student extends teacher
{
    void teaches()
    {
        System.out.println("studies chapter ......");
    }
}
public class upscaling
{
    public static void main(String[] args)
    {
        teacher a = new teacher();
        a.teaches();
        teacher t = new student();
        t.teaches();
    }
}