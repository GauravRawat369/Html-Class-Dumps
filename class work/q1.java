
Q2. Read a character from file f1 and write it in another file f2.
2.import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyCharFile {
 public static void main(String[] args) {
 try {
 FileReader reader = new FileReader("f1");
 FileWriter writer = new FileWriter("f2");
 int character = reader.read();
 writer.write(character);
 reader.close();
 writer.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}
Q3. Read two characters from different files f1 and f2 , concat them and write it in
another file f3.
import java.io.*;
public class File3 {
public static void main(String[] args) {
String file1Path = "f1.txt";
String file2Path = "f2.txt";
String file3Path = "f3.txt";
try {
FileReader file1Reader = new FileReader(file1Path);
BufferedReader file1BufferedReader = new BufferedReader(file1Reader);
FileReader file2Reader = new FileReader(file2Path);
BufferedReader file2BufferedReader = new BufferedReader(file2Reader);
FileWriter file3Writer = new FileWriter(file3Path);
BufferedWriter file3BufferedWriter = new BufferedWriter(file3Writer);
int c1 = file1BufferedReader.read();
int c2 = file2BufferedReader.read();
while (c1 != -1 && c2 != -1) {
char char1 = (char) c1;
char char2 = (char) c2;
String concatenatedString = String.valueOf(char1) + String.valueOf(char2);
file3BufferedWriter.write(concatenatedString);
c1 = file1BufferedReader.read();
c2 = file2BufferedReader.read();
}
file1BufferedReader.close();
file2BufferedReader.close();
file3BufferedWriter.close();
System.out.println("File concatenation completed successfully!");
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
System.out.println(e);
}
}
}
Q4. Read two strings from different files f1 and f2 , concat them and write it in
another file f3.
import java.io.*;
public class File4 {
public static void main(String[] args) {
String f1Path = "f1.txt";
String f2Path = "f2.txt";
String f3Path = "f3.txt";
try {
BufferedReader f1Reader = new BufferedReader(new FileReader(f1Path));
String f1Content = f1Reader.readLine();
f1Reader.close();
BufferedReader f2Reader = new BufferedReader(new FileReader(f2Path));
String f2Content = f2Reader.readLine();
f2Reader.close();
String concatenatedContent = f1Content + f2Content;
FileWriter f3Writer = new FileWriter(f3Path);
f3Writer.write(concatenatedContent);
f3Writer.close();
System.out.println("Concatenation successful. Result written to f3.txt.");
} catch (Exception e) {
System.out.println(e);
}
}
}
Q5. Read two single digit numbers from two different files f1 and f2 and display
their addition in another file f3.
import java.io.*;
public class File5 {
public static void main(String[] args) {
try {
BufferedReader br1 = new BufferedReader(new FileReader("f1.txt"));
BufferedReader br2 = new BufferedReader(new FileReader("f2.txt"));
int num1 = Integer.parseInt(br1.readLine());
int num2 = Integer.parseInt(br2.readLine());
int sum = num1 + num2;
BufferedWriter bw = new BufferedWriter(new FileWriter("f3.txt"));
bw.write("Sum: " + sum);
br1.close();
br2.close();
bw.close();
System.out.println("The sum has been written to f3.txt.");
} catch (Exception e) {
System.err.println("Error: " + e.getMessage());
System.out.println(e);
}
}
}