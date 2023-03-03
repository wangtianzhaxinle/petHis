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
 * @TableName medicalrecord
 */
@TableName(value ="medicalrecord")
@Data
public class Medicalrecord implements Serializable {
    /**
     * 
     */
    @TableId(value = "medicalRecordId", type = IdType.AUTO)
    private Integer medicalrecordid;

    /**
     * 
     */
    @TableField(value = "petId")
    private Integer petid;

    /**
     * 
     */
    @TableField(value = "emplyeeId")
    private Integer emplyeeid;

    /**
     * 
     */
    @TableField(value = "medicalHistory")
    private String medicalhistory;

    /**
     * 诊断
     */
    @TableField(value = "diagnose")
    private String diagnose;

    /**
     * 就诊时间
     */
    @TableField(value = "visitTime")
    private Date visittime;

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
        Medicalrecord other = (Medicalrecord) that;
        return (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getPetid() == null ? other.getPetid() == null : this.getPetid().equals(other.getPetid()))
            && (this.getEmplyeeid() == null ? other.getEmplyeeid() == null : this.getEmplyeeid().equals(other.getEmplyeeid()))
            && (this.getMedicalhistory() == null ? other.getMedicalhistory() == null : this.getMedicalhistory().equals(other.getMedicalhistory()))
            && (this.getDiagnose() == null ? other.getDiagnose() == null : this.getDiagnose().equals(other.getDiagnose()))
            && (this.getVisittime() == null ? other.getVisittime() == null : this.getVisittime().equals(other.getVisittime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        result = prime * result + ((getPetid() == null) ? 0 : getPetid().hashCode());
        result = prime * result + ((getEmplyeeid() == null) ? 0 : getEmplyeeid().hashCode());
        result = prime * result + ((getMedicalhistory() == null) ? 0 : getMedicalhistory().hashCode());
        result = prime * result + ((getDiagnose() == null) ? 0 : getDiagnose().hashCode());
        result = prime * result + ((getVisittime() == null) ? 0 : getVisittime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", petid=").append(petid);
        sb.append(", emplyeeid=").append(emplyeeid);
        sb.append(", medicalhistory=").append(medicalhistory);
        sb.append(", diagnose=").append(diagnose);
        sb.append(", visittime=").append(visittime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}