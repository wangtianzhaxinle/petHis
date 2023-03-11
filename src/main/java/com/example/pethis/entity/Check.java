package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName check
 */
@TableName(value ="check")
@Data
public class Check implements Serializable {
    /**
     * 
     */
    @TableId(value = "checkId", type = IdType.AUTO)
    private Integer checkid;

    /**
     * 
     */
    @TableField(value = "EmployeeId")
    private Integer employeeid;

    /**
     * 
     */
    @TableField(value = "medicalRecordId")
    private Integer medicalrecordid;

    /**
     * 
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 
     */
    @TableField(value = "checktime")
    private Date checktime;

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
        Check other = (Check) that;
        return (this.getCheckid() == null ? other.getCheckid() == null : this.getCheckid().equals(other.getCheckid()))
            && (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckid() == null) ? 0 : getCheckid().hashCode());
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkid=").append(checkid);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", price=").append(price);
        sb.append(", checktime=").append(checktime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}