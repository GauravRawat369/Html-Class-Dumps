class teacher
{
    public teacher()
    {
        System.out.println("teacher");
    }
}
class student extends teacher
{
    public student()
    {
        super();//call to super must be first statement in constructor
        System.out.println("student");
    }
}
public class super2{
    public static void main(String [] args)
    {
        student s = new student();
    }
}