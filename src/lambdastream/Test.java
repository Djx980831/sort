package lambdastream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2019-10-29 11:43
 */
public class Test {

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


        //遍历
        list.stream().forEach(student -> System.out.println(student));

        //排序
        list.stream().sorted(Comparator.comparing(Student::getId)).forEach(student -> System.out.println(student));

        //过滤
        list.stream().filter(student -> student.getId() > 20).forEach(student -> System.out.println(student));

        //截断
        list.stream().limit(3).forEach(student -> System.out.println(student));

        //跳过
        list.stream().skip(3).forEach(student -> System.out.println(student));

        //去重
        list.stream().distinct().forEach(student -> System.out.println(student));

        //去重之后，对id进行排序，取前两个
        list.stream().distinct().filter(student -> student.getId() < 20).sorted(Comparator.comparing(Student::getId)).limit(2).forEach(student -> System.out.println(student));

        //进行运算
        DoubleSummaryStatistics num = list.stream().mapToDouble(student -> student.getId()).summaryStatistics();
        System.out.println("总数：" + num.getCount());
        System.out.println("平均：" + num.getAverage());
        System.out.println("max：" + num.getMax());

        List<Integer> idList = list.stream().map(student -> student.getId()).collect(Collectors.toList());
        idList.stream().forEach(id -> System.out.println(id));

        Map<Integer, String> map = list.stream().distinct().collect(Collectors.toMap(Student::getId, Student::getName));
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
