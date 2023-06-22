// **************************************************************** 
// Dog.java 
// 
// A class that holds a dog's name and can make it speak. 
// 
// **************************************************************** 
public class Dog 
{ 
 protected String name; 
 // ------------------------------------------------------------ 
 // Constructor -- store name 
 // ------------------------------------------------------------ 
 public Dog(String name) 
 { 
 this.name = name; 
 } 
 // ------------------------------------------------------------ 
 // Returns the dog's name 
 // ------------------------------------------------------------ 
 public String getName() 
 { 
 return name; 
 } 
 // ------------------------------------------------------------ 
 // Returns a string with the dog's comments 
 // ------------------------------------------------------------ 
 public String speak() 
 { 
 return "Woof"; 
 } 
} 
// **************************************************************** 
// Labrador.java 
// 
// A class derived from Dog that holds information about 
// a labrador retriever. Overrides Dog speak method and includes 
// information about avg weight for this breed. 
// 
// **************************************************************** 
public class Labrador extends Dog 
{ 
 private String color; //black, yellow, or chocolate? 
 private int breedWeight = 75; 
 public Labrador(String name, String color) 
 { 
 this.color = color; 
 } 
 // ------------------------------------------------------------ 
 // Big bark -- overrides speak method in Dog 
 // ------------------------------------------------------------ 
 public String speak() 
 { 
 return "WOOF"; 
 } 
 // ------------------------------------------------------------ 
 // Returns weight 
 // ------------------------------------------------------------ 
 public static int avgBreedWeight() 
 { 
 return breedWeight; 
 } 
} 

// **************************************************************** 
// Yorkshire.java 
// 
// A class derived from Dog that holds information about 
// a Yorkshire terrier. Overrides Dog speak method. 
// 
// **************************************************************** 
public class Yorkshire extends Dog 
{ 
    private int breedWeight = 75; 
 public Yorkshire(String name) 
 { 
 super(name); 
 } 
 // ------------------------------------------------------------ 
 // Small bark -- overrides speak method in Dog 
 // ------------------------------------------------------------ 
 public String speak() 
 { 
 return "woof"; 
 }
 public static int avgBreedWeight() 
 { 
 return breedWeight; 
 } 
} 
// **************************************************************** 
// DogTest.java 
// 
// A simple test class that creates a Dog and makes it speak. 
// 
// **************************************************************** 
public class DogTest 
{ 
 public static void main(String[] args) 
 { 
    Dog dog = new Dog("Spike"); 
    Labrador Labrador = new Labrador("Labrador","white");
    Yorkshire Yorkshire = new Yorkshire("Yorkshire");
    System.out.println(labrador.avgBreedWeight());
    System.out.println(Yorkshire.avgBreedWeight());
    System.out.println(dog.getName() + " says " + dog.speak()); 
    System.out.println(Labrador.speak()+ " says " + labrador.speak());
 }
}
 