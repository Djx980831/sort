package lambdastream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PipilTest {
    public static void main(String[] args) {

        List<Pupil> pupilList = Stream.of(new Pupil("james", 35, 206), new Pupil("djx", 23, 178)).collect(Collectors.toList());
        //System.out.println(pupilList);

        List<Pupil> pupilList1 = new ArrayList<>(3);
        pupilList1.add(new Pupil("james", 35, 206));
        pupilList1.add(new Pupil("djx", 23, 178));
        pupilList1.add(new Pupil("pual", 33, 183));

        //过滤数据
        List<Pupil> list = pupilList1.stream().filter(pupil -> pupil.getAge() < 24).collect(Collectors.toList());
        //System.out.println(list);

        //合并两个list
        List<Pupil> list1 = Stream.of(pupilList, pupilList1).flatMap(pupils -> pupils.stream()).collect(Collectors.toList());
        //System.out.println(list1);

        //取极值
        Optional<Pupil> max = list1.stream().max(Comparator.comparing(pupil -> pupil.getAge()));
        Optional<Pupil> min = list1.stream().min(Comparator.comparing(pupil -> pupil.getAge()));
//        if (max.isPresent()) {
//            System.out.println(max.get());
//        }
//        if (min.isPresent()) {
//            System.out.println(min.get());
//        }

        //计数
        long count = list1.stream().filter(pupil -> pupil.getAge() < 30).count();
        //System.out.println(count);


    }
}
