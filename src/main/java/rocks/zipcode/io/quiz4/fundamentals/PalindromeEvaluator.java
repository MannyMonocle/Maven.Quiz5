package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
        return string == reverseString(string);
    }

    public static String reverseString(String string) {
        StringBuilder reverse = new StringBuilder();
        return reverse.append(string).reverse().toString();
    }
}
