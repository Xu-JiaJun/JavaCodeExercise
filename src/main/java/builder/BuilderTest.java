package builder;

import java.util.Date;

public class BuilderTest {
    public static void main(String[] args) {
        //Builder
        OperatorLog logWithRequiredParam = new OperatorLog.Builder(1, "test").build();
        System.out.println(logWithRequiredParam);

        OperatorLog logWithAllParam = new OperatorLog.Builder(2, "test")
                                                        .action("testAction")
                                                        .content("testContent")
                                                        .time(new Date())
                                                        .build();
        System.out.println(logWithAllParam);

        //Lombook Builder
        LombookLog lombookLogWithRequiredParam = new LombookLog.LombookLogBuilder()
                .id(3)
                .action("test")
                .content("testLombookBuilder")
                .build();
        System.out.println(lombookLogWithRequiredParam);
    }
}
