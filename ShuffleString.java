public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        String result = "";
        char[] sArray = s.toCharArray();
        String[] sArrayFinal = new String[indices.length];
        for (int i = 0; i < indices.length; i++){
            String letter = ""+sArray[i];
            sArrayFinal[indices[i]] = letter;
        }
        result = String.join("", sArrayFinal);
        return result;
    }

    public static void main(String[] args) {
        String s = "codeleet"; int[] indices = {4,5,6,7,0,2,1,3};
        String answer = restoreString(s, indices);
        System.out.println(answer);
    }
}
