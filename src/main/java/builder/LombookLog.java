package builder;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class LombookLog {
    private int id;
    private String action;
    private String operator;
    private String content;
    private Date time;
}
