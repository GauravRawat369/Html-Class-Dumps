class teacher
{
    int teacher_id;
    String name;
    public teacher(int teacher_id, String name)
    {
       this.teacher_id = teacher_id;
       this.name = name;
    }
}
class student extends teacher
{
    int salary;
    public student(int teacher_id,String name,int salary)
    {
        super(teacher_id,name);
        this.salary = salary;
    }
    void display(){System.out.println(teacher_id+" "+name+" "+salary);}  
}
public class super3{
    public static void main(String [] args)
    {
        student s = new student(123,"gaurav",100000);
        s.display();
    }

}