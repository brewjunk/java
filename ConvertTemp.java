public class ConvertTemp {

    public static double[] convertTemperature(double celsius){
        double results[] = new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius + 1.80 + 32.00;

        results[0] = Kelvin;
        results[1] = Fahrenheit;


        
        return results;
    }
public static void main(String[] args) {
    
}
}
