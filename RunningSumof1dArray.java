import java.util.Arrays;

public class RunningSumof1dArray {

    public static int[] runningSum(int[] nums){
        int result[] = new int[nums.length];
        int sumTotal = 0;
        for (int i = 0; i < nums.length; i++){
            sumTotal += nums[i];
            result[i] = sumTotal;
            
        }
        return result;

    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int answer[] = runningSum(nums);
        System.out.println(Arrays.toString(answer));

        //Output: [1,3,6,10]

    }
}
