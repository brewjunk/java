import java.util.Arrays;

public class BuildArrayPermutations {

    public static int[] buildArray(int[] nums){
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            result[i] = nums[nums[i]];
        }

        return result;

    }
    public static void main(String[] args) {
        int nums[] = {5,0,1,2,3,4};
        int answer[];
        answer = buildArray(nums);
        System.out.println(Arrays.toString(answer));

    } 
}
