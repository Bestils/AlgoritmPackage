package algorytmy;

public class Stringi {
    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static char[] anagram(String string) {
        return   string.toCharArray();

    }
    public static boolean allAfter(String string,String word) {
        return   string.startsWith(word);

    }
    public static boolean allBefore(String string,String word) {
        return   string.endsWith(word);

    }

}
