public class PalindromeNumber {
    
    public static boolean isPalindrome(int x) {
        boolean result = false;
        String posXString = "";
        int counter = 0;

        if (x < 0){
            result = false;
            return result;
        }else{
            posXString = String.valueOf(x);
        }

        System.out.println(posXString);

        if (posXString.length() % 2 == 0){
            for (int i = 0; i < posXString.length()/2; i++){
                if (posXString.charAt(i) == posXString.charAt(posXString.length()-1 - i )){
                    counter++;
                }
            }

            }
            if (counter == posXString.length()/2){
                result = true;
                counter = 0;
                return result;
            }
        if (posXString.length() % 2 != 0){
            int middle = posXString.length() / 2;
            for (int i = 0; i < middle; i++){
                if (posXString.charAt(i) == posXString.charAt(posXString.length()-1 - i )){
                    counter++;
                }
            }


            if (counter == posXString.length()/2){
                result = true;
                counter = 0;
                return result;
            }

        }
        return result;
        

    }
    
    public static void main(String[] args) {
        System.out.println(121/10);
        int x = -1232321;

        boolean answerX = isPalindrome(x);
        //boolean answerY = isPalindrome(y);
        System.out.println(answerX);
        //System.out.println(answerY);

    }
}
