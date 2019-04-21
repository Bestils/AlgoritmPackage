package codewars;

import java.util.Arrays;

public class PangramChecker {


    //A pangram is a sentence that contains every single letter of the alphabet
    // at least once. For example, the sentence
    // "The quick brown fox jumps over the lazy dog"
    // is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

    public boolean check(String pangram1) {


 boolean[] signs = new boolean[26];
 boolean status =true;
 Arrays.fill(signs, false);


        for (char c : pangram1.toLowerCase().toCharArray()) {


            if (c -'a'<26&& c-'a'>-1)
                signs[c-'a']=true;
            else
                continue;

        }
        for (boolean sign : signs) {
            if(!sign)
                return  false;
        }
        return  true;
    }
}
