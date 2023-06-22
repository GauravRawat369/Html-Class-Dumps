//Create an user defined exception named Check Argument to check the number of arguments
// passed through command line. If the number of arguments is less than four, throw the Check
// Argument exception, else print the addition of squares of all the four elements.

class CheckArgument extends Exception{
}

class q4
{
     public static void main(String arg[]){
         
         try
        {
            if(arg.length<4)
            throw new CheckArgument();
            else
            {
                int ans=0;
                for(int i=0;i<arg.length;i++)
                {
                    int a=Integer.parseInt(arg[i]);
                    ans=ans+a*a;
                }
                System.out.println("The sum is"+ans);
            }
   }
   catch(CheckArgument m)
   {
         System.out.println("exception caught :");
   }    
  }
}