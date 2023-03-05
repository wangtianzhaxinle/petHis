package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName appoint
 */
@TableName(value ="appoint")
@Data
public class Appoint implements Serializable {
    /**
     * 
     */
    @TableId(value = "appointId", type = IdType.AUTO)
    private Integer appointid;

    /**
     * 
     */
    @TableField(value = "itemId")
    private Integer itemid;

    /**
     * 
     */
    @TableField(value = "userId")
    private Integer userid;

    /**
     * 预约状态
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 预约时间
     */
    @TableField(value = "appointTime")
    private Date appointtime;

    @TableField(value = "createtime")
    private Date createtime;

    /**
     * 预约医生
     */
    @TableField(value = "employeeId")
    private Integer employeeid;

    /**
     * 数量
     */
    @TableField(value = "count")
    private Integer count;

    /**
     * 总价
     */
    @TableField(value = "totalPrice")
    private BigDecimal totalprice;


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
        Appoint other = (Appoint) that;
        return (this.getAppointid() == null ? other.getAppointid() == null : this.getAppointid().equals(other.getAppointid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppointtime() == null ? other.getAppointtime() == null : this.getAppointtime().equals(other.getAppointtime()))
            && (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getTotalprice() == null ? other.getTotalprice() == null : this.getTotalprice().equals(other.getTotalprice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppointid() == null) ? 0 : getAppointid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppointtime() == null) ? 0 : getAppointtime().hashCode());
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getTotalprice() == null) ? 0 : getTotalprice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appointid=").append(appointid);
        sb.append(", itemid=").append(itemid);
        sb.append(", userid=").append(userid);
        sb.append(", status=").append(status);
        sb.append(", appointtime=").append(appointtime);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", count=").append(count);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}