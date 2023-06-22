import java.util.*;

class vehicle{
   
   String type = "twoweeler";
   public void sound()
   {
       System.out.println("bho.. puu..... bho....... puu.......");
   }
}
class inheritance extends vehicle
{
    private String  brand = "hero honda";
    public static void main(String[] args)
    {
        inheritance i = new inheritance();
        System.out.println(i.type+" "+" "+ i.brand);
        i.sound();
    }
}