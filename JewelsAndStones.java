public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones){
        int result = 0;
        char[] charArray = stones.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
            boolean check = jewels.contains(""+c);
            if (check == true){
                result ++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String jewels = "aA"; String stones = "aAAbbbb";
        int answer = numJewelsInStones(jewels, stones);
        System.out.println(answer);
    }
}
