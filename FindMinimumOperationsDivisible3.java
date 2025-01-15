

public class FindMinimumOperationsDivisible3 {

    public static int minimumOperations(int[] nums){
        int result = 0;
        
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] % 3 != 0){
                result ++;
            }

        }


        return result;
    }

    public static void main(String[] args) {
        int answer;
        int nums[] = {0,3,9};
        answer = minimumOperations(nums);
        System.out.println(answer);


    }
    
}
