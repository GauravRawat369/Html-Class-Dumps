/**
 * 
 */
package WT_LAB;

/**
 * @author KIIT
 *
 */
public class Prg6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day_no=1;
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thurshday","Friday","Saturday","Sunday"};
		switch(day_no)
		{
		case 0: System.out.print(days[0]);break;
		case 1: System.out.print(days[1]);break;
		case 2: System.out.print(days[2]);break;
		case 3: System.out.print(days[3]);break;
		case 4: System.out.print(days[4]);break;
		case 5: System.out.print(days[5]);break;
		case 6: System.out.print(days[6]);break;
		default : System.out.print("Invalid Input");
		}
	}

}