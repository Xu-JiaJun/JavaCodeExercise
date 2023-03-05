package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        StreamTest test = new StreamTest();
        List<Student> students = test.generateStudentList();

        //filter
        List<Student> above90score = students.stream()
                .filter(t -> t.getScore() > 90)
                .collect(Collectors.toList());
        System.out.println(above90score);

        //map
        List<String> studentNameList = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(studentNameList);

        //peek
        List<Student> list = students.stream()
                .filter(t -> t.getScore() > 90)
                .peek(System.out::println)
                .collect(Collectors.toList());

        //max
        Student maxScoreStudent = students.stream()
                .max(Comparator.comparing(Student::getScore).reversed())
                .get();
        System.out.println(maxScoreStudent);

        //Collectors.joining
        String joiningStr = Stream.of("first", "second", "third")
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(joiningStr);

        //Collectors.groupingBy
        Map<String, List<Student>> scoreMap = students.stream()
                .collect(Collectors.groupingBy(Student::groupByScore));
        System.out.println(scoreMap);
    }

    public List<Student> generateStudentList(){
        List<Student> list = new ArrayList<>();
        list.add(new Student.StudentBuilder().id(1).name("zhangsan").score(100).build());
        list.add(new Student(2, "lisi", 95));
        list.add(new Student(3, "wangwu", 85));
        return list;
    }
}
