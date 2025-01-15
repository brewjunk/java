import java.util.Arrays;

public class MaximumNumberWordsFoundSentence {

    public static int mostWordsFound(String[] sentences){

        int maxWords = 0;
        int wordCounter = 0;
        String words[] = sentences[0].split(" ");
        System.out.println("Checking datatype" + Arrays.toString(words));

        for (String string : sentences) {
            for (String string2 : string.split(" ")){
                System.out.println(string2);
                wordCounter++;
            }
            if (wordCounter > maxWords){
                maxWords = wordCounter;   
            }
            wordCounter = 0;
        }
        return maxWords;

    }
    
    public static void main(String[] args) {
        String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int answer = mostWordsFound(sentences);
        System.out.println(answer);
    }

}
