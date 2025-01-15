public class StringScorer {
    //Class name is StringScorer, filename is StringScorer
    
    public static int scoreOfString(String s) {
        //scoreOfString is a function in the body of class.
        int arr_size = s.length();
        int totalResult = 0;
        int results[];
        results = new int[arr_size];
        for (int i = 0; i < s.length();i ++){
            char c = s.charAt(i);
            results[i] = ((int) c);
        }
        //System.out.println(Arrays.toString(results));


        for (int j = 0; j < results.length-1; j++){
            totalResult = totalResult + Math.abs(results[j]-results[j+1]);
            //System.out.println(results[j]);
            //System.out.println(results[j+1]);

        }
        return totalResult;
	}

	public static void main(String[] args) {

        int result;
        int result2;
		String str = "hello";
        result = scoreOfString(str);
        System.out.println(result);
        String str2 = "zaz";
        result2 = scoreOfString(str2);
        System.out.println(result2);
	}
    
    
}