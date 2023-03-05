package com.example.pethis.enums;

/**
 * @projectName: petHis
 * @package: com.example.pethis.enums
 * @className: DepoistStatus
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/5 22:07
 * @version: 1.0
 */
public enum DepositStatus {
    APPOINT(0,"已预约"),
    BREAKPROMISE(1,"失约"),
    DEPOSITING(2,"宠物托管中"),
    UNCLAIMED(3,"已过托管期限,未领回"),
    TAKE_BACK(4,"已经领回宠物");


    private int code;
    private String desc;

    @Override
    public String toString() {
        return "DepositStatus{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }

    DepositStatus() {
    }

    DepositStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
