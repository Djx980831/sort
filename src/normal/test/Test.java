package normal.test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("dd", "dd");
        changeMap(map);

        for (String str: map.keySet()) {
            System.out.println(str + "--" + map.get(str));
        }
    }

    private static void changeMap(Map map) {
        map.put("dd", "bb");
    }

    public static String isCheckInteger(String str) {
        String flag = "false";
        int index = 0;
        if (!isNumeric(str)) {
            return flag;
        }
        if ((str.length() == 1 && str.equals("0")) || (isNumber0(str))) {
            return "0";
        } else {
            while (str.startsWith("0")) {
                str = str.substring(index + 1, str.length());
            }
        }
        if (!isRange(Integer.valueOf(str))) {
            return flag;
        }
        return str;
    }

    //检查是否是数字
    private static boolean isNumeric(String string) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(string).matches();
    }

    private static boolean isNumber0(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    //判断数字范围 0<99999
    private static boolean isRange(int num) {
        boolean flag = true;
        if (num > 99999 && num > 0) {
            return false;
        }
        return flag;
    }
}
