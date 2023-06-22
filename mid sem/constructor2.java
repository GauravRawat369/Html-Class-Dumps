class teacher
{
    public teacher()
    {
        System.out.println("hello bachhooooo .........");
    }
}
class student extends teacher
{
    public student()
    {
        System.out.println("hello maaaaaammm .........");
    }
}
public class constructor2 extends student
{
    public constructor2()
    {
        System.out.println("hiiiii...........");
    }
    public static void main(String [] args)
    {
        constructor2 c1 = new constructor2();// automatically partents class constructor are called 
    }
}