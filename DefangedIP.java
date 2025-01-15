public class DefangedIP {
    public static String defangedIP(String IP){
        String result = "";
        char[] ipchar = IP.toCharArray();
        for (char c : ipchar) {
            if(c == '.'){  
                result += "[.]"; 
                }else{  
                    result += c;  
                }
            }
        //IP.replace(".", "[.]");


        return result;
    }
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String answer = defangedIP(address);
        System.out.println(answer);
    }
}
