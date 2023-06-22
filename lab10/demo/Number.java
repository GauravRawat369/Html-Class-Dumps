package mypack;
import java.util.Scanner;
// import java.util.*;

// Define the MyPack package
// Define the Number class within the MyPack package
class Number {
  private int value;

  // Constructor
  public Number(int value) {
    this.value = value;
  }

  // Method to find factorial
  public int find_factorial() {
    int factorial = 1;
    for (int i = 1; i <= this.value; i++) {
      factorial *= i;
    }
    return factorial;
  }
}

// Define the application class
