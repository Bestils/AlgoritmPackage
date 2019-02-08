package codewars;

import algorytmy.Stringi;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ParseMolecule {

    public static boolean checkIfOpenMacher(CharSequence characterSequence) {
        Pattern between = Pattern.compile("[\\[\\]\\(\\)\\<\\>\\{\\}]");
        Matcher macher = between.matcher(characterSequence);

        return macher.matches();

    }
    public static String reverse(String string) {
       StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    private String giveMeStringWithMultiplis(String string) {

        if

    }

    public static Map<String, Integer> getAtoms(String formula) {

        StringBuilder sb = new StringBuilder(formula);
        String revers = sb.reverse().toString();
        HashMap atoms = new HashMap();
        for (int i = 0; i < formula.length(); i++) {


            // Your code here!


            Character sign = formula.charAt(i);
            String bracketsOpen = "[\\[\\]\\(\\)\\<\\>\\{\\}]";
            String bracketsClose = "[\\\\]\\\\)\\\\>\\\\}]";
            int k = 0, multiplier = 1, shift = 0;

            CharSequence charSequence = formula.subSequence(i, i + 1);
            if (Character.isDigit(sign))
                continue;
            if (multiplier > 1 && bracketsClose.contains(formula.subSequence(i - 2, i))) {
                multiplier = 1;
            }
            if (bracketsOpen.contains(charSequence)) {
                while (bracketsClose.contains(formula.subSequence(i, i + 1))) {
                    i++;
                    shift++;


                }
                multiplier = formula.charAt(i);
                i -= shift - 1;
            }

            if (bracketsClose.contains(charSequence)) {
                multiplier = formula.charAt(i) - '0';
                continue;
            } //"K4[ON(SO3)2]2", problem jest bo zaczyna kwadratowym a konczy ] plus podwójne zaczęcie więc błędna pętla trzeba dorobić switch


            if (i < formula.length() - 1) {
                if (Character.isLowerCase(formula.charAt(i + 1))) {
                    i++;
                    if (atoms.containsKey(sign)) {
                        k = Integer.parseInt(atoms.get(sign).toString());


                        atoms.put(sign + "" + formula.charAt(i), ++k * multiplier);
                    } else {
                        atoms.put(sign + "" + formula.charAt(i), ++k * multiplier);

                    }
                } else if (Character.isDigit(formula.charAt(i + 1))) {
                    i++;
                    if (atoms.containsKey(sign)) {
                        k = Integer.parseInt(atoms.get(sign).toString());
                        atoms.put(sign, ++k + 1 * (formula.charAt(i) - '0') * multiplier);
                    } else {
                        atoms.put(sign, ++k * (formula.charAt(i) - '0') * multiplier);
                    }
                } else if (Character.isUpperCase(formula.charAt(i))) {
                    if (atoms.containsKey(sign)) {
                        k = Integer.parseInt(atoms.get(sign).toString());

                        atoms.put(sign, ++k * multiplier);
                    } else {
                        atoms.put(sign, ++k * multiplier);
                        i++;
                    }
                }
            } else {
                if (atoms.containsKey(sign)) {
                    k = Integer.parseInt(atoms.get(sign).toString());


                    atoms.put(sign, ++k + 1 * multiplier);
                } else
                    atoms.put(sign, ++k * multiplier);

            }
            k = 0;

        }


        return atoms;
    }
}