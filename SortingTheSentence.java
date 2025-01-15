public class SortingTheSentence {

    public static String SortingSentence(String s){
        String answer = "";
        char[] chars = s.toCharArray();
        int currentMax = 0;
        for (char c : chars) {
            String sc = ""+c;
            if (sc.matches("[0-9]+") == true){
                int currentc = Character.getNumericValue(c);
                if (currentc > currentMax){
                    currentMax = currentc;}
            }
            }
        String sarray[] = new String[currentMax];
        String wordtoadd = "";
        for (char c : chars){
            String sc = ""+c;
            if (sc.matches("[0-9]+") == false) {
                wordtoadd += sc;
                System.out.println(">>"+sc);
            }else{int currentc = Character.getNumericValue(c);
                sarray[currentc-1] = wordtoadd.trim();
                wordtoadd = "";
                }
            }

        answer = String.join(" ", sarray);
        return answer;
    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String result = SortingSentence(s);
        System.out.println(result);
    }
}
