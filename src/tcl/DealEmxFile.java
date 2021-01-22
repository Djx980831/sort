package tcl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DealEmxFile {

    public static void readTxtFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file));
                BufferedReader bufferedReader = new BufferedReader(read);
                ArrayList<String> stringList = new ArrayList<>(1000);
                String lineTxt = null;
                int count = 1;
                int i = 0;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    System.out.println(lineTxt);
                    System.out.println(i);
                    i++;
                    if (lineTxt.startsWith("#")) {
                        continue;
                    }
                    if (lineTxt.equals("")) {
                        continue;
                    }
                    String resultString = checkString(lineTxt);
                    if ("".equals(resultString)) {
                        continue;
                    }
                    if (stringList.size() < 10000) {
                        stringList.add(resultString);
                    } else {
                        writeFile(stringList, count);
                        stringList.clear();
                        stringList.add(resultString);
                        count++;
                    }
                }
                if (stringList.size() != 0) {
                    writeFile(stringList, count);
                }
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
    }

    public static String checkString(String str) {
        String flag = "";
        String[] strings = str.split("=");
        if (strings.length < 2) {
            return flag;
        }
        String[] strs = strings[0].split("\\.");
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].startsWith("tcl")) {
                if (!(strs[i].contains("tcl_") || strs[i].contains("DR"))) {
                    String string = decodeUnicode(strings[1]);
                    return strings[0] + "=" + string;
                }
            }
        }
        return flag;
    }

    public static boolean writeFile(ArrayList<String> stringArrayList, int count) {
        String filename = "E:\\txt\\";
        filename = filename + count + ".txt";
        System.out.println("-----------" + filename);
        try {
            File f = new File(filename);
            if (!f.exists()) {
                f.createNewFile();
            }
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f));
            BufferedWriter writer = new BufferedWriter(write);
            for (int i = 0; i < stringArrayList.size(); i++) {
                writer.write(stringArrayList.get(i) + "\r\n");
                writer.flush();
            }
            write.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String decodeUnicode(String unicode) {
        List<String> list = new ArrayList<>();
        String reg= "\\\\u[0-9,a-f,A-F]{4}";
        Pattern p = Pattern.compile(reg);
        Matcher m=p.matcher(unicode);
        while (m.find()){
            list.add(m.group());
        }
        for (int i = 0, j = 2; i < list.size(); i++) {
            String code = list.get(i).substring(j, j + 4);
            char ch = (char) Integer.parseInt(code, 16);
            unicode = unicode.replace(list.get(i),String.valueOf(ch));
        }
        return unicode;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\jingxiong.dong\\Desktop\\emxFrameworkStringResource.txt";

        readTxtFile(filePath);

        //System.out.println(decodeUnicode("\\u9519\\u8BEF\\uFF1A<Program> - \\u672A\\u5B9A\\u4E49\\u7684\\u72B6\\u6001"));
    }
}
