public class q1 {

    public static void main(String[] args) {
        String[] arr = { "Rohit", "Shikar", "Virat", "Dhoni" };

        for (int i = 0; i <= arr.length; i++) {

            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } finally {
                System.out.println("Finally Block");
            }
        }
    }
}