package common_interview;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {

    public static String getMax(TreeMap<String, Integer> map, String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.remove(String.valueOf(chars[i]));
        }
        String result = "";
        result = get(map);
        return result;
    }

    public static String get(TreeMap<String, Integer> map) {
        String result = "";
        Integer max = 0;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            Integer i = m.getValue();
            if (i > max) {
                max = i;
            }
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == max) {
                result = m.getKey();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String string = s.nextLine();
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("A", new Integer(s.nextInt()));
        map.put("B", new Integer(s.nextInt()));
        map.put("C", new Integer(s.nextInt()));
        map.put("D", new Integer(s.nextInt()));
        map.put("E", new Integer(s.nextInt()));
        map.put("F", new Integer(s.nextInt()));
        map.put("G", new Integer(s.nextInt()));
        map.put("H", new Integer(s.nextInt()));
        map.put("I", new Integer(s.nextInt()));
        map.put("J", new Integer(s.nextInt()));
        map.put("K", new Integer(s.nextInt()));
        map.put("L", new Integer(s.nextInt()));
        map.put("M", new Integer(s.nextInt()));

        System.out.println(getMax(map, string));
    }
}
