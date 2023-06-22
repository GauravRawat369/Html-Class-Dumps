public class JavaExceptionExample2{

public static void main(String[] args){

    try{

    //code that may raise exception

    String data= null;

    }catch(Exception e){System.out.println(e.getMessage());}

    //rest code of the program

    System.out.println("rest of the code...");

    }

}