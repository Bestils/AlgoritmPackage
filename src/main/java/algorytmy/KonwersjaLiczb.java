package algorytmy;

import java.math.BigDecimal;
import java.util.Arrays;

public class KonwersjaLiczb {
    public static int convertToInt(String number, int base){
        return Integer.parseInt(number, base);

        }
    public static String convertInt(int number, int base){
        return Integer.toString(number, base);
    }
    public static void mathPrecision(int number, int roundPrecision){

        switch (roundPrecision)
        {
            case 1:
                System.out.printf("%.1f%n", number);
                break;
            case 2:
                System.out.printf("%.2f%n", number);
                break;
            case 3:
                System.out.printf("%.3f%n", number);
                break;
            case 4:
                System.out.printf("%.4f%n", number);
                break;
                default:
                    System.out.printf("%.0f%n", number);

        }
    }

    public static double  mathRound (int number){
        return  (Math.round((number*10))/10.0);
}
    public  static  int max(int[] array){
        return Arrays.stream(array).max().getAsInt();

    } public  static  int min(int[] array){
        return Arrays.stream(array).min().getAsInt();

    }
    public  static  int sum(int[] array){
        return Arrays.stream(array).sum();

    }
    public BigDecimal calculate(double operand){
        BigDecimal ret = null;
        return ret;
    }

}
