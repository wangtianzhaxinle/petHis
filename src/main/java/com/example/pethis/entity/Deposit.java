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
 * @TableName deposit
 */
@TableName(value ="deposit")
@Data
public class Deposit implements Serializable {
    /**
     * 
     */
    @TableId(value = "depositId", type = IdType.AUTO)
    private Integer depositid;

    /**
     * 
     */
    @TableField(value = "petId")
    private Integer petid;

    /**
     * 托管开始日期
     */
    @TableField(value = "startDate")
    private Date startdate;

    /**
     * 托管结束日期
     */
    @TableField(value = "endDate")
    private Date enddate;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 
     */
    @TableField(value = "depositTime")
    private Date deposittime;

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
        Deposit other = (Deposit) that;
        return (this.getDepositid() == null ? other.getDepositid() == null : this.getDepositid().equals(other.getDepositid()))
            && (this.getPetid() == null ? other.getPetid() == null : this.getPetid().equals(other.getPetid()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDeposittime() == null ? other.getDeposittime() == null : this.getDeposittime().equals(other.getDeposittime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepositid() == null) ? 0 : getDepositid().hashCode());
        result = prime * result + ((getPetid() == null) ? 0 : getPetid().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDeposittime() == null) ? 0 : getDeposittime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", depositid=").append(depositid);
        sb.append(", petid=").append(petid);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", status=").append(status);
        sb.append(", price=").append(price);
        sb.append(", deposittime=").append(deposittime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}