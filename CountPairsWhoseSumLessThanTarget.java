import java.util.List;
import java.util.Arrays;


public class CountPairsWhoseSumLessThanTarget {

    public static int countPairs(List<Integer> nums, int target) {

        int result = 0;

        for (int i = 0; i < nums.size(); i++){
            for (int j = 1; j < nums.size(); j++){
                if (0 <= i && i < j && j < nums.size() && (nums.get(i) + nums.get(j)) < target){
                    result++;
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        int answer = countPairs(nums, target);
        System.out.println(answer);

    }
}
