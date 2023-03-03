package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName medicine
 */
@TableName(value ="medicine")
@Data
public class Medicine implements Serializable {
    /**
     * 
     */
    @TableId(value = "medicineId", type = IdType.AUTO)
    private Integer medicineid;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "company")
    private String company;

    /**
     * 
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 
     */
    @TableField(value = "amount")
    private Integer amount;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 保质期
     */
    @TableField(value = "Exp")
    private String exp;

    /**
     * 批准文号
     */
    @TableField(value = "authenticationCode")
    private String authenticationcode;

    /**
     * 图片
     */
    @TableField(value = "image")
    private String image;

    /**
     * 是否是处方药
     */
    @TableField(value = "isPrescription")
    private Integer isprescription;

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
        Medicine other = (Medicine) that;
        return (this.getMedicineid() == null ? other.getMedicineid() == null : this.getMedicineid().equals(other.getMedicineid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()))
            && (this.getAuthenticationcode() == null ? other.getAuthenticationcode() == null : this.getAuthenticationcode().equals(other.getAuthenticationcode()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getIsprescription() == null ? other.getIsprescription() == null : this.getIsprescription().equals(other.getIsprescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicineid() == null) ? 0 : getMedicineid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getAuthenticationcode() == null) ? 0 : getAuthenticationcode().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getIsprescription() == null) ? 0 : getIsprescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medicineid=").append(medicineid);
        sb.append(", name=").append(name);
        sb.append(", company=").append(company);
        sb.append(", price=").append(price);
        sb.append(", amount=").append(amount);
        sb.append(", description=").append(description);
        sb.append(", exp=").append(exp);
        sb.append(", authenticationcode=").append(authenticationcode);
        sb.append(", image=").append(image);
        sb.append(", isprescription=").append(isprescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}