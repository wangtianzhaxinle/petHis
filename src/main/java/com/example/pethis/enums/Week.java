package com.example.pethis.enums;

public enum Week {
    SUNDAY_AM(1,"星期天上午"),
    SUNDAY_PM(2,"星期天下午"),

    MONDAY_AM(3,"星期一上午"),
    MONDAY_PM(4,"星期一下午"),

    TUESDAY_AM(5,"星期二上午"),
    TUESDAY_PM(6,"星期二下午"),

    WEDNESDAY_AM(7,"星期三上午"),
    WEDNESDAY_PM(8,"星期三下午"),

    THURSDAY_AM(9,"星期四上午"),
    THURSDAY_PM(10,"星期四下午"),

    FRIDAY_AM(11,"星期五上午"),
    FRIDAY_PM(12,"星期五下午"),

    SATURDAY_AM(13,"星期六上午"),
    SATURDAY_PM(14,"星期六下午");



    private Integer code;
    private String desc;

    private Week(Integer code,String desc){
        this.code=code;
        this.desc=desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Week{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
