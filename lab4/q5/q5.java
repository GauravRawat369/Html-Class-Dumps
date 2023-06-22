package WT_LAB;
/**
 * 
 */

/**
 * @author KIIT
 * 
 */

public class Prg5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks = 76;
        System.out.println("GRADE");
        if (marks > 90)
            System.out.println("O");
        else if ((int) (marks / 10) == 8)
            System.out.println("E");
        else if ((int) (marks / 10) == 7)
            System.out.println("A");
        else if ((int) (marks / 10) == 6)
            System.out.println("B");
        else if ((int) (marks / 10) == 5)
            System.out.println("C");
        else
            System.out.println("F");
	}

}