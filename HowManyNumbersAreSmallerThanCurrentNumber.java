import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        int counter;
        for (int i = 0; i < nums.length; i++){
            counter = 0;
            //System.out.println(i);
            for (int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i]){
                    //System.out.println("J : "+j);
                    counter++;
                }
            }
            result[i] = counter;
        }
        //System.out.println(Arrays.toString(result));
        return result;

    }

    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int answer[] = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(answer));
        //Output: [4,0,1,1,3]

        

    }
}
