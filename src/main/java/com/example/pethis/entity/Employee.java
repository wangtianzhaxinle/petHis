package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * 
     */
    @TableId(value = "employeeId", type = IdType.AUTO)
    private Integer employeeid;

    /**
     * 入职时间
     */
    @TableField(value = "hiredate")
    private Date hiredate;

    /**
     * 薪水
     */
    @TableField(value = "salary")
    private Long salary;

    /**
     * 银行卡
     */
    @TableField(value = "bankcard")
    private String bankcard;

    /**
     * 最大可预约人数
     */
    @TableField(value = "maxAppoint")
    private Integer maxappoint;

    /**
     * 
     */
    @TableField(value = "card")
    private String card;

    /**
     * 籍贯
     */
    @TableField(value = "nativePlace")
    private String nativeplace;

    /**
     * 
     */
    @TableField(value = "educationBackground")
    private String educationbackground;

    @TableField(value = "image")
    private String image;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getHiredate() == null ? other.getHiredate() == null : this.getHiredate().equals(other.getHiredate()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getBankcard() == null ? other.getBankcard() == null : this.getBankcard().equals(other.getBankcard()))
            && (this.getMaxappoint() == null ? other.getMaxappoint() == null : this.getMaxappoint().equals(other.getMaxappoint()))
            && (this.getCard() == null ? other.getCard() == null : this.getCard().equals(other.getCard()))
            && (this.getNativeplace() == null ? other.getNativeplace() == null : this.getNativeplace().equals(other.getNativeplace()))
            && (this.getEducationbackground() == null ? other.getEducationbackground() == null : this.getEducationbackground().equals(other.getEducationbackground()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getHiredate() == null) ? 0 : getHiredate().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getBankcard() == null) ? 0 : getBankcard().hashCode());
        result = prime * result + ((getMaxappoint() == null) ? 0 : getMaxappoint().hashCode());
        result = prime * result + ((getCard() == null) ? 0 : getCard().hashCode());
        result = prime * result + ((getNativeplace() == null) ? 0 : getNativeplace().hashCode());
        result = prime * result + ((getEducationbackground() == null) ? 0 : getEducationbackground().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeid=").append(employeeid);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", salary=").append(salary);
        sb.append(", bankcard=").append(bankcard);
        sb.append(", maxappoint=").append(maxappoint);
        sb.append(", card=").append(card);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", educationbackground=").append(educationbackground);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}