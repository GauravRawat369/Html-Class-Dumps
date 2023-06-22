class string1{
    public static void main(String[] args) {
        // comparing string in normal way
        String s1 = "Hello";
        String s2 = "Hello";
        if(s1 == s2)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
        System.out.println(s1.equals(s2));

        //compare using compair opertaor
        if(s1.compareTo(s2) == 0)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
        // comparing string using new keyword

        String st1 = new String("gauarav");
        String st2 = new String("gauarav");
        if(st1 == st2)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
        System.out.println(st1.equals(st2));
         if(st1.compareTo(st2) == 0)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
        String newstring = st1.concat(" " + st2);
        System.out.println(newstring);
        String str = "Hello World!";
        String newStr = str.replace("l", "x");
        System.out.println(newStr); // Output: "Hexxo Worxd!"
        String str1 = "Hello World!";
        String str2 = new String("Hello World!").intern();
        System.out.println(str1 == str2); // Output: true


    }
}