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
    @TableField(value = "Monday")
    private Integer monday;

    /**
     * 
     */


    /**
     * 
     */
    @TableField(value = "Tuesday")
    private Integer tuesday;

    /**
     * 
     */


    /**
     * 
     */


    /**
     * 
     */
    @TableField(value = "Wednesday")
    private Integer wednesday;

    /**
     * 
     */

    /**
     * 
     */
    @TableField(value = "Thursday")
    private Integer thursday;

    /**
     * 
     */


    /**
     * 
     */
    @TableField(value = "Friday")
    private Integer friday;

    /**
     * 
     */


    /**
     * 
     */
    @TableField(value = "Saturday")
    private Integer saturday;

    /**
     * 
     */


    /**
     * 
     */
    @TableField(value = "Sunday")
    private Integer sunday;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}