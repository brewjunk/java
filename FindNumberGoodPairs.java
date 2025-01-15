public class FindNumberGoodPairs {

    public static int numberOfPairs(int[] nums1, int[] nums2, int k){

        //You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.
        //A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).
        //Return the total number of good pairs.

        int goodPairs = 0;
        int n = nums1.length;
        int m = nums2.length;


        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (nums1[i] % nums2[j] * k == 0 && 0 <= i && i <= n-1 && 0 <= j && j <= m-1){
                goodPairs++;
                }
            }
        }

        return goodPairs;

    }

    public static void main(String[] args) {
        int nums1[] = {1,3,4};
        int nums2[] = {1,3,4};
        int k = 1;
        int answer = numberOfPairs(nums1, nums2, k);
        System.out.println(answer);
    }
}
