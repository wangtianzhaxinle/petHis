package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName prescribe
 */
@TableName(value ="prescribe")
@Data
public class Prescribe implements Serializable {
    /**
     * 
     */
    @TableId(value = "prescribeId", type = IdType.AUTO)
    private Integer prescribeid;

    /**
     * 
     */
    @TableField(value = "medicalRecordId")
    private Integer medicalrecordid;

    /**
     * 
     */
    @TableField(value = "medicineId")
    private Integer medicineid;

    /**
     * 
     */
    @TableField(value = "count")
    private Integer count;

    /**
     * 配药师id
     */
    @TableField(value = "employeeId")
    private Integer employeeid;

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
        Prescribe other = (Prescribe) that;
        return (this.getPrescribeid() == null ? other.getPrescribeid() == null : this.getPrescribeid().equals(other.getPrescribeid()))
            && (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getMedicineid() == null ? other.getMedicineid() == null : this.getMedicineid().equals(other.getMedicineid()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescribeid() == null) ? 0 : getPrescribeid().hashCode());
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        result = prime * result + ((getMedicineid() == null) ? 0 : getMedicineid().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescribeid=").append(prescribeid);
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", medicineid=").append(medicineid);
        sb.append(", count=").append(count);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}