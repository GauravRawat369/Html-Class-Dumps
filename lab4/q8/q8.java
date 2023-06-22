public class Main{
public static void formatName ( String name ) {
 Scanner scan = new Scanner ( System.in);

 String firstName;
 String lastName;
 int index;


 System.out.println(" Enter First Name : ");
 firstName = scan.nextLine();

 System.out.println(" Enter Last Name : ");
 lastName = scan.nextLine();

 for ( int i = 0; i < lastName (); i++){
    for ( int x = 0; x < firstName(); x++){

 name += firstName.charAt(i);
 name += lastName.charAt(x);

 return name;
    }
 }
}