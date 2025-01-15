import java.util.Arrays;

public class PivotArray {

    public static int[] pivotArray(int[] nums, int pivot) {
            int result[] = new int[nums.length];
            int count = 0;
    
            for (int i = 0; i < nums.length ; i++){
                if (nums[i] < pivot){
                    result[count] = nums[i];
                    count ++;
                }
            }

            for (int i = 0; i < nums.length; i++){
                if (nums[i] == pivot){
                    result[count] = nums[i];
                    count++;
                }
            }
    
            for (int i = 0; i < nums.length; i++){
                if (nums[i] > pivot){
                    result[count] = nums[i];
                    count ++;
                }
            }

            return result;
    
    
        }
        public static void main(String[] args) {
            int nums[] = {9,12,5,10,14,3,10};
            int pivot = 10;
            int answer[];
            answer = pivotArray(nums, pivot);
            System.out.println(Arrays.toString(answer));

            int nums2[] = {-3,4,3,2};
            int pivot2 = 2;
            int answer2[];
            answer2 = pivotArray(nums2, pivot2);
            System.out.println(Arrays.toString(answer2));






    } 
}