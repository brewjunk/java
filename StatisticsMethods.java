public class StatisticsMethods {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] data = {10, 15, 15, 20, 25, 30};
        double mean = mean(data);
        double median = median(data);
        double sample_variance = variance(0,data, mean);
        double population_variance = variance(1, data, mean);
        double sample_standardDeviation = standardDeviation(sample_variance);
        double population_standardDeviation = standardDeviation(population_variance);

        System.out.println("Mean : " + mean);
        System.out.println("Median : " + median);
        System.out.println("Sample Variance : " + sample_variance);
        System.out.println("Population Variance : " + population_variance);
        System.out.println("Sample Standard Deviation : " + sample_standardDeviation);
        System.out.println("Population Standard Deviation : " + population_standardDeviation);
        }
                                                                        
        private static double median(int[] data) {
            if (data.length % 2 == 0) {
                return (data[data.length/2] + data[data.length/2 - 1])/2.0;
            } else {
                return data[data.length/2];
            }
        }
                  
        private static double variance(int type, int[] data, double meanValue){
            double sum = 0;
            for (int i = 0; i < data.length; i++) {
                sum += Math.pow(data[i] - meanValue, 2);
            }
            if (type == 0) {
                return sum / (data.length - 1);
            } else {
                return sum / data.length;
            }
        }

        private static double standardDeviation(double varianceValue) {
            return Math.sqrt(varianceValue);
        }

        private static double mean(int[] data) {
            double sum = 0;
            for (int i = 0; i < data.length; i++) {
                sum += data[i];
            }
            return sum / data.length;
        }
}
