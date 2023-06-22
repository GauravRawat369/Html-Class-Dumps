class outter{
    int x = 10;
    class inner
    {
        int y = 20;
    }
}
public class innerclass{
    public static void main(String[] args)
    {
        outter out = new outter();
        // inner in = new inner();  error
        outter.inner in = out.new inner();
        System.out.println(out.x + in.y);
    }
}