package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

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
    @TableField(value = "petId")
    private Integer petid;

    /**
     * 预约状态
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 预约日期
     */
    @TableField(value = "appointDate")
    private Date appointdate;

    /**
     * 记录生成的时间
     */
    @TableField(value = "createtime")
    private Date createtime;

    /**
     * 
     */
    @TableField(value = "businessKey")
    private String businesskey;

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
            && (this.getPetid() == null ? other.getPetid() == null : this.getPetid().equals(other.getPetid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppointdate() == null ? other.getAppointdate() == null : this.getAppointdate().equals(other.getAppointdate()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getBusinesskey() == null ? other.getBusinesskey() == null : this.getBusinesskey().equals(other.getBusinesskey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppointid() == null) ? 0 : getAppointid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getPetid() == null) ? 0 : getPetid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppointdate() == null) ? 0 : getAppointdate().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getBusinesskey() == null) ? 0 : getBusinesskey().hashCode());
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
        sb.append(", petid=").append(petid);
        sb.append(", status=").append(status);
        sb.append(", appointdate=").append(appointdate);
        sb.append(", createtime=").append(createtime);
        sb.append(", businesskey=").append(businesskey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}