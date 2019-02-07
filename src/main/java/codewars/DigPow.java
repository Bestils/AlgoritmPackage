package codewars;
public class DigPow {

    public static long digPow(int n, int p) {

        int suma = 0;
        String liczba = (Integer.toString(n));
        for (int i = 0; i < liczba.length(); i++) {

            int w = liczba.charAt(i) - '0';
            suma += Math.pow(w, p + i);


        }
        if (n > suma) {
            if (n % suma == 0)
                return n / suma;
            else
                return -1;
        }

    else{

        if (suma % n == 0)
            return suma / n;
        else
            return -1;
    }

    }
}
