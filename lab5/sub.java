//Q.4) Write a program in Java to overload subtract method with various parameters in a class.?
// Java program to demonstrate working of method
// overloading in Java

public class sub {

	// Overloaded sub(). This sub takes two int parameters
	public int sub(int x, int y) { return (x + y); }

	// Overloaded sub(). This sub takes three int parameters
	public int sub(int x, int y, int z)	
	{
		return (x + y + z);
	}

	// Overloaded sub(). This sub takes two double
	// parameters
	public double sub(double x, double y)
	{
		return (x + y);
	}

	// Driver code
	public static void main(String args[])
	{
		sub s = new sub();
		System.out.println(s.sub(10, 20));
		System.out.println(s.sub(10, 20, 30));
		System.out.println(s.sub(10.5, 20.5));
	}
}
