import java.util.HashMap;

public class ReduceArraySizetoHalf {

    public static int minSetSize(int[] arr){
        int result = 0;
        int halvedLength = arr.length/2;
        int getSum = 0;


        //System.out.println(halvedLength);

        HashMap<Integer, Integer> intFreq = new HashMap<>();
        for (int i : arr) {
            if (!intFreq.containsKey(i)){
                intFreq.put(i, 1);}
            else{
                intFreq.put(i, intFreq.get(i) + 1);
            }
        }
        for (int i : intFreq.keySet()) {
            //System.out.println("Unique Key i : " + i + " Count: "+intFreq.get(i));
            for (int j : intFreq.keySet()){
                //System.out.println("Unique Key j : " + j + " Count: "+intFreq.get(j));
                getSum = (intFreq.get(i) + intFreq.get(j));
                //System.out.println(getSum);
                if (getSum >= halvedLength && !(i == j)){
                    System.out.println("[ " + i +" , "+ j +" ]");
                }
            }
        }

        System.out.println(intFreq);


        return result;
    }

    public static void main(String[] args) {
        int arr[] = {3,3,3,3,5,5,5,2,2,7};
        int result = minSetSize(arr);
        System.out.println(result);
    }
}
