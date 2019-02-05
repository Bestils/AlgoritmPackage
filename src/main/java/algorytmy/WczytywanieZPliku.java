package algorytmy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WczytywanieZPliku {
    public WczytywanieZPliku() {
    }

    public static String[][] readFile(String file) throws IOException {
        String[][] array = new String[1000][2];
        Scanner data = new Scanner(new File("C:\\Users\\gladius\\javaProjects\\java\\"+file));
        int i = 0;
        while (data.hasNextLine()){
            array[i][0] = data.next();
            array[i][1] = data.next();
            i++;
        }
        data.close();
        return array;
    }

}
