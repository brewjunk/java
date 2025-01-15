public class FinaValueAfterOperations {
    public static int finalValueAfterOperations(String[] operations){
        int result = 0;

        for (int i = 0; i < operations.length; i++){
            //System.out.println(operations[i]);
            if (operations[i].equals("++X") || operations[i].equals("X++")){
                result ++;
            }
            if (operations[i].equals("--X") || operations[i].equals("X--")){
                result = result - 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String[] ops = {"--X","X++","X++"};
        int answer;
        answer = finalValueAfterOperations(ops);
        System.out.println(answer);
    }
}
