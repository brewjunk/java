public class ReversePrefixOfString {

    public static String ReverseePrefix(String s, String d){
        String result = "";
        int index_of_d = s.indexOf(d);
        char[] chararray = s.toCharArray();
        for (int i = index_of_d; i >= 0; i--){
            result += chararray[i];
        }
        for (int i = index_of_d+1; i < s.length(); i++){
            result += chararray[i];
        }
        return result;

    }
    public static void main(String[] args) {
        String word = "abcdefd"; String ch = "d";
        String answer = ReverseePrefix(word,ch);
        System.out.println(answer);

    }
}
