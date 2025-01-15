import java.util.Arrays;

/**
 * RankTransformation
 */
public class RankTransformation {

    public static int[] rankTransformation(int arr[]){
        int sorted_arr [] = new int[arr.length];
        int result[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length-1; i++){
            sorted_arr[i] = arr[i];
        }
        Arrays.sort(sorted_arr);


        for (int num : arr) {
            
            for (int i = 0; i < arr.length; i++){
                if (sorted_arr[i] == num){
                    //System.out.println("Num : "+num+ " is at index " + (i+1) + " in sorted arr");
                    result[index] = (i+1);
                    index++;
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        // int arr[] = {40,10,20,30};
        // //[4, 1, 2, 3]
        // System.out.println(Arrays.toString(rankTransformation(arr)));

        int arr2[] = {37,12,28,9,100,56,80,5,12};
        //[5,3,4,2,8,6,7,1,3]
        System.out.println(Arrays.toString(rankTransformation(arr2)));


    }
}