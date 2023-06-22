public class q2 {
   static void ProcessInput(int a){
      try{
        if(a<0){
            throw new Exception("Negative Number");
        }
        else{
            System.out.println("Positive Number");
        }
      }
      catch(Exception e){
        System.out.println(e.getMessage()); 
      }
      finally{
        System.out.println("Finally Block");
      }
    }   

    public static void main(String args[]){
        ProcessInput(-1);
    }
   
}