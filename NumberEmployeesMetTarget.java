public class NumberEmployeesMetTarget {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target){
        int result = 0;

        for (int i : hours) {
            if (i >= target){
                result++;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        int hours[] = {0,1,2,3,4};
        int target = 2;
        int answer = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println("NumberEmployeesMetTarget.main() :  "+ answer);



        
    }
    
}
