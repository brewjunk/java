import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    public static List<Integer> findWordsContaining(String[] words, char x){
        int result[] = new int[words.length];
        int index = 0;
        String s_x = String.valueOf(x);

        for (int i = 0; i < words.length; i++){
            if (words[i].contains(s_x)){
                result[index] = i;
                index++;
            }
        }
        //System.out.println("Index:" + index);

        List<Integer> finalResult = new ArrayList<>();


        for (int i = 0; i < index; i++){
            finalResult.add(result[i]);
        }
        result = null;

        return finalResult;

    }

    public static void main(String[] args) {
        String words[] = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> answer = findWordsContaining(words, x);
        System.out.println(answer);
        System.out.println(answer.size());

    }
}
