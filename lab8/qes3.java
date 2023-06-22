// Write a class Worker and derive classes DailyWorker and
// SalariedWorker from it. Every worker is has a name and a salary rate.
// Write method ComPay( int hours) to computethe week pay of every
// worker.A DailyWorker is paid on the basis of number of days s/he
// work.The SalariedWorker g ets paid the wage for 40 hours a week no
// matter what actual hours is. Test this program to calculate the pay of
// workers. You are expected to use concept of polymorphism to write this
// program.
// Define two different classes
abstract class Worker
{
    // Define the data
    // name
    // salary rate
    // Return type: void
    // Display the values
    String name = "John";
    int salaryRate = 1000;
    Worker()
    {
        System.out.println("Enter name and salary rate ");
        name=System.console().readLine();
        salaryRate=Integer.parseInt(System.console().readLine()); 
    }
    public int ComPay(int hrs) {
        return  salaryRate*hrs;
    }
}
class SalariedWorker extends Worker
{
    public int ComPay(int hrs) {
        return  salaryRate*40;
    }
}
class DailyWorker extends Worker
{
    public int ComPay(int hrs) {
        return  salaryRate*hrs*7;
    }
}
public class qes3 {
    // Main method
    // Create an object of each class
    // Print the values of all objects
    public static void main(String[] args) {
        SalariedWorker a = new SalariedWorker();
        DailyWorker b = new DailyWorker();
        System.out.println("Salaried Worker Salary is " + a.ComPay(1));
        System.out.println("Daily Worker Salary is " + b.ComPay(100));
    }
}
