package codewars;

import java.util.Stack;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        String odp="";
        Stack<String> time = null;
String answer="";
        for (int i=0;i<2;i++) {
            String timeTemp = Integer.toString(seconds % 60);

    if (timeTemp.length() < 2) {
        odp += 0;
        odp += timeTemp;
    } else {
        odp += timeTemp;
    }

seconds/=60;
            odp+=":";
        }
        if(seconds>99)
            odp+="99";
        else{
            if (Integer.toString(seconds).length() < 2) {
                odp += 0;
                odp += Integer.toString(seconds);
            } else {
                odp += Integer.toString(seconds);
            }
        }


        for (String s : new StringBuffer(odp).reverse().toString().split(":")) {
            answer+= new StringBuffer(s).reverse().toString();
            answer+=":";
        }


        return answer.substring(0,answer.length()-1);
    }

}