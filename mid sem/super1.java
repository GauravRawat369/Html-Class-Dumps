class teacher
{
    void speeks()
    {
        System.out.println("teacher");
    }
}
class student extends teacher
{
    void listen()
    {
        System.out.println("student");
        super.speeks();
    }
}
public class super1{
    public static void main(String [] args)
    {
        student s = new student();
        s.listen();
    }
}