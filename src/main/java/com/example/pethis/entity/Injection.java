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
 * @TableName injection
 */
@TableName(value ="injection")
@Data
public class Injection implements Serializable {
    /**
     * 
     */
    @TableId(value = "InjectionId", type = IdType.AUTO)
    private Integer injectionid;

    /**
     * 
     */
    @TableField(value = "employeeId")
    private Integer employeeid;

    /**
     * 
     */
    @TableField(value = "injectionTime")
    private Date injectiontime;

    /**
     * 
     */
    @TableField(value = "price")
    private BigDecimal price;

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
        Injection other = (Injection) that;
        return (this.getInjectionid() == null ? other.getInjectionid() == null : this.getInjectionid().equals(other.getInjectionid()))
            && (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getInjectiontime() == null ? other.getInjectiontime() == null : this.getInjectiontime().equals(other.getInjectiontime()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInjectionid() == null) ? 0 : getInjectionid().hashCode());
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getInjectiontime() == null) ? 0 : getInjectiontime().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", injectionid=").append(injectionid);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", injectiontime=").append(injectiontime);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}