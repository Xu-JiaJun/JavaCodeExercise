package builder;

import java.util.Date;

public class OperatorLog {
    private int id;
    private String action;
    private String operator;
    private String content;
    private Date time;

    @Override
    public String toString() {
        return "OperatorLog{" +
                "id=" + id +
                ", action='" + action + '\'' +
                ", operator='" + operator + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }

    private OperatorLog (Builder builder){
        this.id = builder.id;
        this.action = builder.action;
        this.operator = builder.operator;
        this.content = builder.content;
        this.time = builder.time;
    }

    public static class Builder{
        private int id;
        private String action;
        private String operator = "";
        private String content = "";
        private Date time = null;

        public Builder(int id, String action) {
            this.id = id;
            this.action = action;
        }

        public OperatorLog build(){
            return new OperatorLog(this);
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder action(String action) {
            this.action = action;
            return this;
        }

        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder time(Date time) {
            this.time = time;
            return this;
        }
    }

}
