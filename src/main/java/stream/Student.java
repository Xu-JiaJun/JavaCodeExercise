package stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private int id;
    private String name;
    private int score;

    public String groupByScore(){
        switch (this.score / 10){
            case 10:{
                return "S";
            }
            case 9:{
                return "A";
            }
            case 8:{
                return "B";
            }
            default:{
                return null;
            }
        }
    }
}
