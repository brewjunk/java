public class CheckTwoStringArraysEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String checkEqual1 = "";
        String checkEqual2 = "";


        for (String string : word1) {
            checkEqual1 += string;
        }
        for (String string : word2) {
            checkEqual2 += string;
        }

        return (checkEqual1.equals(checkEqual2));
        
        
    }

    public static void main(String[] args) {
        String word1[] = {"ab", "c"};
        String word2[] = {"a", "bc"};
        boolean answer = arrayStringsAreEqual(word1, word2);
        System.out.println(answer);

    }
}
