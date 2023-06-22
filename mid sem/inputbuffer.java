import java.util.*;
import java.io.*;
import java.io.IOException;
// import java.io.BufferedReader;
class inputbuffer{
    public static void main(String args[]) throws IOException
    {
       InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br.readLine();    
    System.out.println("Welcome "+name);
    // DataInputStream ds = new DataInputStream(System.in);
    // int a = Integer.parseInt(ds.readLine());   
    }
}