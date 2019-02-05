import algorytmy.KonwersjaLiczb;
import algorytmy.WczytywanieZPliku;

import java.io.IOException;

public class Main {
    private static WczytywanieZPliku wczytywanieZPliku ;
    private static KonwersjaLiczb konwersjaLiczb;


    public static void main(String[] args) {
        wczytywanieZPliku =new WczytywanieZPliku();
        konwersjaLiczb =new KonwersjaLiczb();
        String[][] array = new String[1000][2];





        try {
           array= wczytywanieZPliku.readFile("plik.txt");
            System.out.println(array[1][1]);

            System.out.println("udalo sie");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
