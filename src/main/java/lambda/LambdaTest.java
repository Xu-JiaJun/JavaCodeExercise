package lambda;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println("Path: " + file.getAbsolutePath());
        //traditional
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xml");
            }
        });
        System.out.println(Arrays.stream(files).map(File::getName).collect(Collectors.toList()));

        //lambda
        File[] fileList = file.listFiles((dir, name) -> name.endsWith(".xml"));
        System.out.println(Arrays.stream(fileList).map(File::getName).collect(Collectors.toList()));
    }
}
