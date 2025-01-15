import java.lang.Math;


public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
            Double num1_sqrt = Math.sqrt(Double.parseDouble(num1))*Math.sqrt(Double.parseDouble(num1));
            Double num2_sqrt = Math.sqrt(Double.parseDouble(num2))*Math.sqrt(Double.parseDouble(num2));

            Double combined = (num1_sqrt) * (num2_sqrt);
            String answer = "hello";
            System.out.println(num1_sqrt);
            System.out.println(num2_sqrt);
            System.out.println(combined);
            //Zero multiplication
            if (num1.equals("0")){
                return "0";
            }
    
            return answer;
    
        }
        public static void main(String[] args) {
    
            String num1 = "123456789";
            String num2 = "987654321";
            String answer = multiply(num1, num2);
            System.out.println("Multiply Strings :  "+num1+" "+num2+ " " +answer);
}
}