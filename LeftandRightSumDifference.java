import java.util.Arrays;


public class LeftandRightSumDifference {

    public static int[] leftRightDifference(int[] nums) {

        int result[] = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        int differenceLR = 0;
        int absDifferenceLR = 0;

        // INDEX POINTER MOVES ONCE FOR EACH VALUE.
        for (int i = 0; i < nums.length; i++){ 
            //LEFT SIDE
            for (int l = 0; l < i; l++){
                //System.out.println("Left Side : " + nums[l]);
                leftSum += nums[l];
            }
            //RIGHT SIDE
            for (int r = i+1; r < nums.length; r++){
                //System.out.println("Right Side : " + nums[r]);
                rightSum += nums[r];
            }
            //CALCULATE ABSOLUTE VALUE DIFFERENCE AND ADD TO RESULTS
            differenceLR = leftSum - rightSum;
            absDifferenceLR = Math.abs(differenceLR);
            result[i] = absDifferenceLR;
            leftSum = 0;
            rightSum = 0;


        }

        return result;

    }

    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        //[15,1,11,22] answer[i] = |leftSum[i] - rightSum[i]|.
        int answer[] = leftRightDifference(nums);
        System.out.println(Arrays.toString(answer));

        int nums2[] = {1};
        //[0] answer[i] = |leftSum[i] - rightSum[i]|.
        int answer2[] = leftRightDifference(nums2);
        System.out.println(Arrays.toString(answer2));
    }
}
