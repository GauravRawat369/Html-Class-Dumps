// A plastic manufacturer sells plastic in different shapes like 2D sheet
// and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of
// box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost
// of plastic as per the dimensions given by the user where 3D inherits

// from 2D.?
// Java Program to illustrate Inheritance (concise)

import java.io.*;

// Base or Super Class
class towD {
	int cost1 = 3*4*40;
}

// Inherited or Sub Class
class threeD extends towD {
	int  cost2 = 4*5*6*60;
}

// Driver Class
class qes9 {
	public static void main(String args[])
	{
		threeD E1 = new threeD();
		System.out.println("2d cost : " + E1.cost1
						+ "\n3d cost : " + E1.cost2);
        System.out.println("total cost : "+ (E1.cost1 + E1.cost2));
	}
}




