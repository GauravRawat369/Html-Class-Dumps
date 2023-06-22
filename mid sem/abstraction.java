abstract class teacher//abstract class cannot be instantiated
{
    abstract void speeks();//abstract methods cannot have a body
    void says()
    {
        System.out.println("hello bacchooooo.......");
    }
    teacher()
    {
        System.out.println("constructor called at teacher...");
    }
}
class student extends teacher
{
    void speeks()
    {
        System.out.println("i am student ");
    }
}
public class abstraction{
    public static void main(String[] args)
    {
        teacher s = new student();//dynamic binding
        s.speeks();
        student s1 = new student();//static binding
        s1.speeks();
    }
}