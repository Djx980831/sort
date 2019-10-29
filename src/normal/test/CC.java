package normal.test;

import java.util.Arrays;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2019-10-23 09:52
 */
public class CC {

    public static void main(String[] args) {
        BackgroundSerachParams backgroundSerachParams = new BackgroundSerachParams();
        backgroundSerachParams.setStartTime(null);
        backgroundSerachParams.setEndTime("111");
        String[] strings = new String[2];
        strings[0] = backgroundSerachParams.getStartTime();
        strings[1] = backgroundSerachParams.getEndTime();
        System.out.println(backgroundSerachParams);
        boolean flag = false;
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (null == strings[i]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}
