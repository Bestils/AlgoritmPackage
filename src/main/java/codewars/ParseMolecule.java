package codewars;

import org.apache.commons.lang.*;


import   java.lang.Object;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class ParseMolecule {

    public static boolean checkIfOpenMacher(CharSequence characterSequence) {
        Pattern between = Pattern.compile("[\\]\\)\\>\\}]");
        Matcher macher = between.matcher(characterSequence);

        return macher.matches();

    }

    public static int howLongSubString(String string, char bracket) {
        int i = 0;
        if( bracket==')'){
            while (string.charAt(i) != bracket - 1) {
                i++;
            }
        }
        else {
        while (string.charAt(i) != bracket - 2) {
            i++;
        }}
        return i;
    }

    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    private static String giveMeStringWithMultiplies(String string) {
        Stack<String> strings=new Stack<String>();

        int k = 0, w = 0;
        String copyString = new String();
        int multiplayer = string.charAt(0)-'0';

        for (int i = 3; i <= string.length() ; i++) {


            if (Character.isDigit(string.charAt(i - 1))) {
                if (StringUtils.isNumeric(strings.lastElement())) {

                    w++;
                    strings.push(((string.charAt(i - 1) - '0') * multiplayer + ""));
                    copyString += string.charAt(i);
                    i++;

                } else {

                    w++;
                    copyString += (string.charAt(i - 1) - '0') * multiplayer;
                    copyString += string.charAt(i);
                    i++;

                }
            } else {

                copyString += multiplayer;
                copyString += string.charAt(i - 1);
            }


        }
        for (int i = 3; i <= string.length() ; i++) {
        if (checkIfOpenMacher(string.subSequence(i-1, i))) {
            int hw = howLongSubString(string.substring(i - 2), string.charAt(i - 1));

            string.replaceAll((string.substring(i - 2, hw + i - 2)), giveMeStringWithMultiplies(string.substring(i - 2, hw + i - 2)));
            i -= 1;

        }}

            return copyString;

    }

    public static Map<String, Integer> getAtoms(String formula) {

        String reversedCopy = new String(reverse(formula));
        ArrayList<String> subStrings = new ArrayList<String>();
        String finalString = new String();
        HashMap<String,Integer> atoms = new HashMap();
        int last=0;
        for (int i = 1; i < reversedCopy.length(); i++) {


            if (checkIfOpenMacher(reversedCopy.subSequence(i-1, i))) {

                subStrings.add(reversedCopy.substring(0, i-2));
                int hw = howLongSubString(reversedCopy.substring(i-2), reversedCopy.charAt(i-1));
                subStrings.add(giveMeStringWithMultiplies(reversedCopy.substring(i-2, hw + i-2)));

               last=i+hw-1;


            }  if(i==formula.length()-1&&last<i) {
                subStrings.add(reversedCopy.substring(last));
            }

        }
        for (String subs : subStrings) {


            finalString += subs;
        }
        finalString=reverse(finalString);
        int k = 0;
        int multiplier = 0;
        for (int i = 0; i < finalString.length(); i++) {
            String sign = Character.toString(finalString.charAt(i));
            if (i < finalString.length() - 1) {
                if (Character.isLowerCase(finalString.charAt(i + 1))) {


                    if (Character.isDigit(finalString.charAt(i + 2))) {
                        multiplier = finalString.charAt(i + 2) - '0';
                        if (atoms.containsKey(sign)) {
                            k = Integer.parseInt(atoms.get(sign).toString());
                            atoms.put(sign +""+ finalString.charAt(i + 1), ++k * multiplier);
                        } else {
                            atoms.put(sign +""+ finalString.charAt(i + 1), multiplier);

                        }
                        i += 2;
                    } else {
                        if (atoms.containsKey(sign)) {
                            k = Integer.parseInt(atoms.get(sign).toString());
                            atoms.put(sign +""+ finalString.charAt(i + 1), ++k);
                        } else {
                            atoms.put(sign +""+ finalString.charAt(i + 1), ++k);

                        }
                        i++;
                    }
                } else if (Character.isDigit(finalString.charAt(i + 1))) {
                    multiplier = finalString.charAt(i + 1) - '0';
                    if (atoms.containsKey(sign)) {
                        k = Integer.parseInt(atoms.get(sign).toString());
                        atoms.put(sign, ++k + multiplier);
                    } else {
                        atoms.put(sign, multiplier);

                    }
                    i += 1;
                } else {
                    if (atoms.containsKey(sign)) {
                        k = Integer.parseInt(atoms.get(sign).toString());


                        atoms.put(sign, ++k);
                    } else
                        atoms.put(sign, 1);

                }
                k = 0;


            } else {
                if (atoms.containsKey(sign)) {
                    k = Integer.parseInt(atoms.get(sign).toString());


                    atoms.put(sign, ++k);
                } else
                    atoms.put(sign, 1);


            }

        }
        return atoms;


    }
}


