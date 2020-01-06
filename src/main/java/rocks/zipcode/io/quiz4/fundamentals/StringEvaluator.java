package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i+1; j <= string.length(); j++){
                String sub = string.substring(i,j);
                if(!list.contains(sub)){list.add(sub);}
            }
        }

        return list.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        ArrayList<String> list = new ArrayList<>();
        String[] one = getAllSubstrings(string1);
        String[] two = getAllSubstrings(string2);
        for(String sub : one){
            if(Arrays.asList(two).contains(sub)){ list.add(sub); }
        }
        return list.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
