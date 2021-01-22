package bytedance;

import java.util.Scanner;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-07-10 08:20
 */
public class RemoveK {
    public static String removeKDigits(String num, int k) {
        String numNew = num;
        for (int i = 0; i < k; i++) {
            boolean hasCut = false;
            //从左到右遍历，找到比自己右侧数字大的数字，并进行删除
            for (int j = 0; j < numNew.length(); j++) {
                if (numNew.charAt(j) > numNew.charAt(j + 1)) {
                    numNew = numNew.substring(0, j) + numNew.substring(j + 1, numNew.length());
                    hasCut = true;
                    break;
                }
            }

            //如果没有找到要删除的数字
            if (!hasCut) {
                numNew = numNew.substring(0, numNew.length() - 1);
            }
            //清除最前面的0
            numNew = removeZero(numNew);
        }

        //如果整数所有数字都被删除，则直接返回0
        if (numNew.length() == 0) {
            return "0";
        }

        return numNew;
    }

    private static String removeZero(String numNew) {
        for (int i = 0; i < numNew.length(); i++) {
            if (numNew.charAt(i) != '0') {
                break;
            }
            numNew = numNew.substring(1, numNew.length());
        }
        return numNew;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(removeKDigits(s, 3));
    }
}
