import java.util.Arrays;

public class RearrangeArray {

    public static int[] rearrangeArray(int[] nums) {
            int positive_nums[] = new int[nums.length];
            int negative_nums[] = new int[nums.length];
            int result[] = new int[nums.length];
            int positive_count = 0;
            int negative_count = 0;
            int result_count = 0;
    
            for (int i = 0; i < nums.length ; i++){
                if (nums[i] > 0){
                    positive_nums[positive_count] = nums[i];
                    positive_count ++;
                }
            }
            
            for (int i = 0; i < nums.length ; i++){
                if (nums[i] < 0){
                    negative_nums[negative_count] = nums[i];
                    negative_count ++;
                }
            }

            for (int i = 0; i < nums.length -1; i = i+2){
                result[i] = positive_nums[result_count];
                result[i+1] = negative_nums[result_count];
                result_count ++;
            }

            // System.out.println(Arrays.toString(positive_nums));
            // System.out.println(Arrays.toString(negative_nums));
            return result;
    
    
        }
        public static void main(String[] args) {
            // int nums[] = {3,1,-2,-5,2,-4};
            int nums[] = {-1,1};
            int answer[];
            answer = rearrangeArray(nums);
            System.out.println(Arrays.toString(answer));
            

    } 
}