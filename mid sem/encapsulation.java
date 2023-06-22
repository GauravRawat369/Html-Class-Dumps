class veiw
{
    private String password = "ans123";

    public String getter()
    {
      return password;
    }

    public void setter(String password)
    {
        this.password = password;
    }
}
public class encapsulation{

    public static void main(String[] args)
    {
        veiw e1 = new veiw();
        System.out.println(e1.getter());
        e1.setter("new123");
        System.out.println(e1.getter());
    }
}