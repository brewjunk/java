/**
 * FindFirstPalindromicStringinArray
 */
public class FindFirstPalindromicStringinArray {

    public static String firstPalindrome(String[] words) {
        String result = "";
        int wordSplit;
        String firstPart = "";
        //String middlePart = "";
        String secondPart = "";
        String secondPartReversed = "";
        StringBuilder reverseString = new StringBuilder();


        for (String string : words) {
            wordSplit = string.length() / 2;
            if (string.length() % 2 != 0){
                firstPart = string.substring(0, wordSplit);
                //middlePart = string.substring(wordSplit, wordSplit+1);
                secondPart = string.substring(wordSplit+1, string.length());
            }
            if (string.length() % 2 == 0){
                firstPart = string.substring(0, wordSplit);
                secondPart = string.substring(wordSplit, string.length());
            }
            reverseString.setLength(secondPart.length());
            reverseString.append(secondPart);
            reverseString.reverse();
            reverseString.setLength(secondPart.length());

            secondPartReversed = reverseString.toString();

            reverseString.setLength(0);

            //System.out.println(firstPart+middlePart+secondPart+ " Reversed second part : "+secondPartReversed);
            //middlePart = "";
            if (firstPart.equals(secondPartReversed)){
                result = string;
                return result;

            }
        }//End of the Foreach Loop.

        return result;
    }

    public static void main(String[] args) {
        String words[] = {"abc","car","ada","racecar","cool"};
        //"ada"
        String answer = firstPalindrome(words);
        System.out.println(answer);
        
    }
}