import mypack.*;

public class MyClass {
  public static void main(String[] args) {
    // Create Number objects for n, r, and n-r
    Number num_n = new Number(5);
    Number num_r = new Number(2);
    Number num_n_minus_r = new Number(3);

    // Find the factorials of n, r, and n-r
    int n_factorial = num_n.find_factorial();
    int r_factorial = num_r.find_factorial();
    int n_minus_r_factorial = num_n_minus_r.find_factorial();

    // Calculate nCr
    int ncr = n_factorial / (r_factorial * n_minus_r_factorial);

    // Print the result
    System.out.println("nCr = " + ncr);
  }
}
