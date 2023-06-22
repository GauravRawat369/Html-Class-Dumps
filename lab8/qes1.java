import java.util.Date;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int rollNo;
    private String branch;

    public Student(String name, int age, int rollNo, String branch) {
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

class Employee extends Person {
    private int ecNo;
    private Date doj;

    public Employee(String name, int age, int ecNo, Date doj) {
        super(name, age);
        this.ecNo = ecNo;
        this.doj = doj;
    }

    public void display() {
        super.display();
        System.out.println("Employee Code: " + ecNo);
        System.out.println("Date of Joining: " + doj);
    }
}

class Faculty extends Employee {
    private String designation;

    public Faculty(String name, int age, int ecNo, Date doj, String designation) {
        super(name, age, ecNo, doj);
        this.designation = designation;
    }

    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

class Staff extends Employee {
    private String designation;

    public Staff(String name, int age, int ecNo, Date doj, String designation) {
        super(name, age, ecNo, doj);
        this.designation = designation;
    }

    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

public class qes1 {
    public static void main(String[] args) {
        Person p = new Person("gaurav", 30);
        p.display();
        System.out.println();

        Student s = new Student("sanju", 20, 1234, "Computer Science");
        s.display();
        System.out.println();

        Date doj = new Date();
        Employee e = new Employee("naman", 40, 5678, doj);
        e.display();
        System.out.println();

        Faculty f = new Faculty("naman jain", 50, 9012, doj, "Professor");
        f.display();
        System.out.println();

        Staff st = new Staff("sambuddha", 35, 3456, doj, "Technical");
        st.display();
    }
}
