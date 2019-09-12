package common_interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RMBChange {
    private static final Pattern pattern =
            Pattern.compile("^(0|[1-9]\\d{0,15})\\.(\\d\\d)$"); // 不考虑分隔符的正确性
    private static final char[] units = "零壹贰叁肆伍陆柒捌玖".toCharArray();
    private static final String[] UNITS = {"元", "角", "分", "整"};
    private static final String[] ua = {"", "拾", "佰", "仟"};
    private static final String[] ub = {"", "万", "亿"};

    public static String change(String amount) throws IllegalArgumentException {

        amount = amount.replace(",", "");

        if (amount.equals("0.00")) {
            throw new IllegalArgumentException("金额不能为零.");
        }
        Matcher matcher = pattern.matcher(amount);
        if (!matcher.find()) {
            throw new IllegalArgumentException("输入金额有误.");
        }

        String zhengshu = matcher.group(1); // 整数部分
        String xiaoshu = matcher.group(2); // 小数部分

        String result = "";
        if (!zhengshu.equals("0")) {
            result += changeZhengShu(zhengshu) + UNITS[0]; // 整数部分
        }
        if (xiaoshu.equals("00")) {
            result += UNITS[3]; // 添加[整]
        } else if (xiaoshu.startsWith("0") && zhengshu.equals("0")) {
            result += changeXiaoShu(xiaoshu).substring(1); // 去掉分前面的[零]
        } else {
            result += changeXiaoShu(xiaoshu); // 小数部分
        }

        return result;
    }

    // 将金额小数部分转换为中文大写
    private static String changeXiaoShu(String xiaoshu) {
        char jiao = xiaoshu.charAt(0); // 角
        char fen = xiaoshu.charAt(1); // 分
        return (units[jiao - '0'] + (jiao > '0' ? UNITS[1] : ""))
                + (fen > '0' ? units[fen - '0'] + UNITS[2] : "");
    }

    // 将金额整数部分转换为中文大写
    private static String changeZhengShu(String zhengshu) {
        StringBuilder buffer = new StringBuilder();
        // 从个位数开始转换
        int i, j;
        for (i = zhengshu.length() - 1, j = 0; i >= 0; i--, j++) {
            char n = zhengshu.charAt(i);
            if (n == '0') {
                // 当n是0且n的右边一位不是0时，插入[零]
                if (i < zhengshu.length() - 1 && zhengshu.charAt(i + 1) != '0') {
                    buffer.append(units[0]);
                }
                // 插入[万]或者[亿]
                if (j % 4 == 0) {
                    if (i > 0 && zhengshu.charAt(i - 1) != '0'
                            || i > 1 && zhengshu.charAt(i - 2) != '0'
                            || i > 2 && zhengshu.charAt(i - 3) != '0') {
                        buffer.append(ub[j / 4]);
                    }
                }
            } else {
                if (j % 4 == 0) {
                    buffer.append(ub[j / 4]);     // 插入[万]或者[亿]
                }
                buffer.append(ua[j % 4]);         // 插入[拾]、[佰]或[仟]
                buffer.append(units[n - '0']); // 插入数字
            }
        }
        return buffer.reverse().toString();
    }

    public static String moneyFormat(String money) {//23->23.00
        StringBuffer sb = new StringBuffer();
        if (money == null) {
            return "0.00";
        }
        int index = money.indexOf(".");
        if (index == -1) {
            return money + ".00";
        } else {
            String s0 = money.substring(0, index);//整数部分
            String s1 = money.substring(index + 1);//小数部分
            if (s1.length() == 1) {//小数点后一位
                s1 = s1 + "0";
            } else if (s1.length() > 2) {//如果超过3位小数，截取2位就可以了
                s1 = s1.substring(0, 2);
            }
            sb.append(s0);
            sb.append(".");
            sb.append(s1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String string = str.replaceAll("\"", "");
        String result = string.replace("[", "");
        String finret = result.replace("]", "");

        String[] strings = finret.split(",");

        String[] results = new String[strings.length];

        System.out.print("[\"");
        for (int i = 0; i < strings.length; i++) {
            results[i] = change(strings[i]);
            if (i == strings.length - 1) {
                System.out.print(results[i] + "\"");
            } else
                System.out.print(results[i] + "\",");
        }
        System.out.print("]");
    }
}