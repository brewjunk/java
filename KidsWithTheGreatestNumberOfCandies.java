import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    
    public static Boolean isMax(int[] candies, int num){

        for (int i : candies) {
            if (num < i){
            return false;
            }   
        }
        return true;

    }

    /**
     * @param candies
     *      An array of number of candies.
     * @param extraCandies
     * @return result
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++){
            result.add(isMax(candies, candies[i]+extraCandies));

        }
        return result;
    }

    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> answer = kidsWithCandies(candies, extraCandies);
        System.out.println(answer);


    }
    
}
