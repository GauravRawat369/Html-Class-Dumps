class teacher{
    void speeks()  // same function 2 different functionality
    {
        System.out.println("hello bachhooooo........");
    }
    void speeks(String name)
    {
        System.out.println("hello : "+ name);
    }
}
public class methodoverloading extends teacher{
    public static void main(String[] args)
    {
         methodoverloading m = new methodoverloading();
         m.speeks();
         m.speeks("gaurav");
    }
}