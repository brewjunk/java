import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int array[] = new int[nums.length];
        int index = 0;
        int count = 0;

        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length ; j ++){
                // System.out.println(">>"+ i);
                // System.out.println(nums[i]);
                // System.out.println(">>"+ j);
                // System.out.println(nums[j]);
                
                if (nums[i] + nums[j] == target) {
                    System.out.println("Arrived");
                    array[index] = i;
                    array[index+1] = j;
                    count = count + 2;
                    index ++;
                    index ++;
                }
            }
        }
        
        //System.out.println(Arrays.toString(array));
        int resultsArray[] = new int[count];

        for (int i = 0; i < resultsArray.length; i ++){
            resultsArray[i] = array[i];
        }
        array = null;
        return resultsArray;
    }
    public static void main(String[] args) {

        // int nums[] = {2,7,11,15};
        // int target = 9;
        // int[] returnedArray = twoSum(nums,target);
        // System.out.println(Arrays.toString(returnedArray));
        // int nums2[] = {3,2,4};
        // int target2 = 6;
        // int[] returnedArray2 = twoSum(nums2,target2);
        // System.out.println(Arrays.toString(returnedArray2));
        // //[1,2]
        // int nums3[] = {3,3};
        // int target3 = 6;
        // int[] returnedArray3 = twoSum(nums3,target3);
        // System.out.println(Arrays.toString(returnedArray3));
        // //[0,1]
        // int nums4[] = {3,2,3};
        // int target4 = 6;
        // int[] returnedArray4 = twoSum(nums4,target4);
        // System.out.println(Arrays.toString(returnedArray4));
        int nums5[] = {2,5,5,11};
        int target5 = 10;
        int[] returnedArray5 = twoSum(nums5,target5);
        System.out.println(Arrays.toString(returnedArray5));




    }
}
