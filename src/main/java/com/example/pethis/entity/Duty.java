package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName duty
 */
@TableName(value ="duty")
@Data
public class Duty implements Serializable {
    /**
     * 
     */
    @TableId(value = "dutyId", type = IdType.AUTO)
    private Integer dutyid;

    /**
     * 
     */
    @TableField(value = "employeeId")
    private Integer employeeid;

    /**
     * 
     */
    @TableField(value = "MondayAM")
    private Integer mondayam;

    /**
     * 
     */
    @TableField(value = "MondayPM")
    private Integer mondaypm;

    /**
     * 
     */
    @TableField(value = "TuesdayAM")
    private Integer tuesdayam;

    /**
     * 
     */
    @TableField(value = "TuesdayPM")
    private Integer tuesdaypm;

    /**
     * 
     */
    @TableField(value = "WednesdayAM")
    private Integer wednesdayam;

    /**
     * 
     */
    @TableField(value = "WednesdayPM")
    private Integer wednesdaypm;

    /**
     * 
     */
    @TableField(value = "ThursdayAM")
    private Integer thursdayam;

    /**
     * 
     */
    @TableField(value = "ThursdayPM")
    private Integer thursdaypm;

    /**
     * 
     */
    @TableField(value = "FridayAM")
    private Integer fridayam;

    /**
     * 
     */
    @TableField(value = "FridayPM")
    private Integer fridaypm;

    /**
     * 
     */
    @TableField(value = "SaturdayAM")
    private Integer saturdayam;

    /**
     * 
     */
    @TableField(value = "SaturdayPM")
    private Integer saturdaypm;

    /**
     * 
     */
    @TableField(value = "SundayAM")
    private Integer sundayam;

    /**
     * 
     */
    @TableField(value = "SundayPM")
    private Integer sundaypm;

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
        Duty other = (Duty) that;
        return (this.getDutyid() == null ? other.getDutyid() == null : this.getDutyid().equals(other.getDutyid()))
            && (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getMondayam() == null ? other.getMondayam() == null : this.getMondayam().equals(other.getMondayam()))
            && (this.getMondaypm() == null ? other.getMondaypm() == null : this.getMondaypm().equals(other.getMondaypm()))
            && (this.getTuesdayam() == null ? other.getTuesdayam() == null : this.getTuesdayam().equals(other.getTuesdayam()))
            && (this.getTuesdaypm() == null ? other.getTuesdaypm() == null : this.getTuesdaypm().equals(other.getTuesdaypm()))
            && (this.getWednesdayam() == null ? other.getWednesdayam() == null : this.getWednesdayam().equals(other.getWednesdayam()))
            && (this.getWednesdaypm() == null ? other.getWednesdaypm() == null : this.getWednesdaypm().equals(other.getWednesdaypm()))
            && (this.getThursdayam() == null ? other.getThursdayam() == null : this.getThursdayam().equals(other.getThursdayam()))
            && (this.getThursdaypm() == null ? other.getThursdaypm() == null : this.getThursdaypm().equals(other.getThursdaypm()))
            && (this.getFridayam() == null ? other.getFridayam() == null : this.getFridayam().equals(other.getFridayam()))
            && (this.getFridaypm() == null ? other.getFridaypm() == null : this.getFridaypm().equals(other.getFridaypm()))
            && (this.getSaturdayam() == null ? other.getSaturdayam() == null : this.getSaturdayam().equals(other.getSaturdayam()))
            && (this.getSaturdaypm() == null ? other.getSaturdaypm() == null : this.getSaturdaypm().equals(other.getSaturdaypm()))
            && (this.getSundayam() == null ? other.getSundayam() == null : this.getSundayam().equals(other.getSundayam()))
            && (this.getSundaypm() == null ? other.getSundaypm() == null : this.getSundaypm().equals(other.getSundaypm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDutyid() == null) ? 0 : getDutyid().hashCode());
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getMondayam() == null) ? 0 : getMondayam().hashCode());
        result = prime * result + ((getMondaypm() == null) ? 0 : getMondaypm().hashCode());
        result = prime * result + ((getTuesdayam() == null) ? 0 : getTuesdayam().hashCode());
        result = prime * result + ((getTuesdaypm() == null) ? 0 : getTuesdaypm().hashCode());
        result = prime * result + ((getWednesdayam() == null) ? 0 : getWednesdayam().hashCode());
        result = prime * result + ((getWednesdaypm() == null) ? 0 : getWednesdaypm().hashCode());
        result = prime * result + ((getThursdayam() == null) ? 0 : getThursdayam().hashCode());
        result = prime * result + ((getThursdaypm() == null) ? 0 : getThursdaypm().hashCode());
        result = prime * result + ((getFridayam() == null) ? 0 : getFridayam().hashCode());
        result = prime * result + ((getFridaypm() == null) ? 0 : getFridaypm().hashCode());
        result = prime * result + ((getSaturdayam() == null) ? 0 : getSaturdayam().hashCode());
        result = prime * result + ((getSaturdaypm() == null) ? 0 : getSaturdaypm().hashCode());
        result = prime * result + ((getSundayam() == null) ? 0 : getSundayam().hashCode());
        result = prime * result + ((getSundaypm() == null) ? 0 : getSundaypm().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dutyid=").append(dutyid);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", mondayam=").append(mondayam);
        sb.append(", mondaypm=").append(mondaypm);
        sb.append(", tuesdayam=").append(tuesdayam);
        sb.append(", tuesdaypm=").append(tuesdaypm);
        sb.append(", wednesdayam=").append(wednesdayam);
        sb.append(", wednesdaypm=").append(wednesdaypm);
        sb.append(", thursdayam=").append(thursdayam);
        sb.append(", thursdaypm=").append(thursdaypm);
        sb.append(", fridayam=").append(fridayam);
        sb.append(", fridaypm=").append(fridaypm);
        sb.append(", saturdayam=").append(saturdayam);
        sb.append(", saturdaypm=").append(saturdaypm);
        sb.append(", sundayam=").append(sundayam);
        sb.append(", sundaypm=").append(sundaypm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}