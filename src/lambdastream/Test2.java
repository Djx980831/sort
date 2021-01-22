package lambdastream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2019-11-04 09:49
 */
public class Test2 {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, "zhangsan", "is"),
                new Student(1, "zhangsan", "is"),
                new Student(1, "zhangsan", "is"),
                new Student(71, "lisi", "math"),
                new Student(32, "wangwu", "is"),
                new Student(14, "liming", "is"),
                new Student(55, "yaoming", "is"),
                new Student(6, "james", "is"),
                new Student(17, "owen", "is"),
                new Student(8, "dd", "is"),
                new Student(9, "ww", "is")
        );

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        List<Integer> idsList = list.stream().map(student -> student.getId()).collect(Collectors.toList());
//
//        Map<Integer, String> map = list.stream().distinct().collect(Collectors.toMap(Student::getId, Student::getName));
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}
