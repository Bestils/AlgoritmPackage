package codewars;

public class WeightSort {


    public static int giveSumOfDigits(String s) {

        int sumOfDigits = 0;

        for (char c : s.toCharArray()) {
            sumOfDigits += (int) c-'0';







        }
        return sumOfDigits;
    }

    public static String compare(String[][] weights) {
        for (int k = 0; k < weights.length ; k++) {
        for (int i = 0; i < weights.length - 1; i++) {
            int a = Integer.parseInt(weights[i][1]), b = Integer.parseInt(weights[i+1][1 ]);


            if (a ==b&& weights[i][0].equals("22")) {

                String[][] temp = new String[1][2];
                temp[0] = weights[i];
                weights[i] = weights[i + 1];
                weights[i + 1] = temp[0];

            }
          else  if (a ==b ) {



            }
            else if (a > b) {
                String[][] temp = new String[1][2];
                temp[0] = weights[i];
                weights[i] = weights[i + 1];
                weights[i + 1] = temp[0];
            }
        }}
        String value = "";
        for (String[] weight : weights) {
            value += weight[0];

            value += " ";
        }

        return value.substring(0,value.length()-1);
    }

    public static String orderWeight(String s) {


        String[] array =
                new StringBuffer(s).reverse().toString().split(" ");
        String[][] wages = new String[array.length][2];

        int i = 0;
        for (String s1 : array) {


            wages[i][0] =        new StringBuffer(s1).reverse().toString();
            wages[i][1] = Integer.toString(giveSumOfDigits(s1));
i++;
        }

        return compare(wages);
    }

    public static String abbrevName(String name) {

        String[] names = name.split(" ");

        return names[0].toUpperCase().substring(0,1) + "." +names[1].toUpperCase().substring(0,1);
    }
}
