import java.util.Arrays;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int result[] = new int[n * 2];
        int index = 0;

        //System.out.println(Arrays.toString(result));

        for (int i = 0; i < n; i++ ){
            // System.out.println("a)"+i);
            // System.out.println("b)"+(i+n));
            result[index] = nums[i];
            result[index+1] = nums[i+n];
            index += 2;
            //System.out.println(Arrays.toString(result));
        }


        return result;

    }
    
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        int n = 3;
        int answer[] = shuffle(nums, n);
        System.out.println(Arrays.toString(answer));


    }
    
}
