package rocks.zipcode.io.quiz4.fundamentals;
import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> list = new ArrayList<>();
        String[] all = StringEvaluator.getAllSubstrings(string);
        for(String sub : all){
            if(isPalindrome(sub)){ list.add(sub);}
        }
        return list.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder reverse = new StringBuilder();
        return reverse.append(string).reverse().toString();
    }
}
