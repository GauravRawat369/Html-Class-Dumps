// public class q1 {
//     public static void main(String[] args) {
//         String s = "1DS09CS010";

//         if (!Character.isDigit(s.charAt(0)) || (s.charAt(0) != '1' && s.charAt(0) != '2')) {
//             System.out.println("Failure: First character must be a digit and have value either '1' or '2'");
//         }
//         else if (s.length() != 10) {
//             System.out.println("more than 10 char or less than 10");
//         }else if (!s.substring(5, 7).matches("CS|IS|EC|ME")) {
//             System.out.println("failure beacuse it not contain cs is ec me");
//         } else if (!Character.isDigit(s.charAt(7)) || !Character.isDigit(s.charAt(8)) || !Character.isDigit(s.charAt(9))) {
//             System.out.println("Failure");
//         } else {
//             System.out.println("Success");
//         }
//     }

// }
// //implement this using catch block
public class q1 {
    public static void main(String[] args) {
        String s = "1DS09CS010";

        try {
            if (!Character.isDigit(s.charAt(0)) || (s.charAt(0) != '1' && s.charAt(0) != '2')) {
                throw new Exception("first digit must have value either '1' or '2'");
            } else if (s.length() != 10) {
                throw new Exception("more than 10 char or less than 10");
            } else if (!s.substring(5, 7).matches("CS|IS|EC|ME")) {
                throw new Exception("not contain cs is ec me");
            } else if (!Character.isDigit(s.charAt(7)) || !Character.isDigit(s.charAt(8)) || !Character.isDigit(s.charAt(9))) {
                throw new Exception("Failure");
            } else {
                System.out.println("Success");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


