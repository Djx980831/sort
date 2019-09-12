package normal.string;

import java.util.HashSet;

public class RepeString {

    public static void getString(String string) {
        char[] chars = string.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (!set.contains(chars[i])) {
                set.add(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }
}
