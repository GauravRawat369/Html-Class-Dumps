class teacher   // method overriding 
{
    void speeks()
    {
         System.out.println("hello bachooooo..........");
    }
}
class student extends teacher
{
    void speeks()
    {
        System.out.println("hello maaaaaam............");
    }
}
public class polymorphisum extends student
{
    void speeks()
    {
        System.out.println("hello");
    }
    public static void main(String[] args)
    {
       teacher t = new teacher();
       student s = new student();
       polymorphisum p = new polymorphisum();
       t.speeks();
       s.speeks();
       p.speeks();
    }
}