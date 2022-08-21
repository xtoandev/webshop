package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "shipping")
public class ShippingEntity extends BaseEntity{
    @Column(name = "shipping_code")
    private double shippingCode;
    @Column(name = "province_id")
    private Integer provinceID;
    @Column(name = "district_id")
    private Integer districtID;
    @Column(name = "province_name")
    private String provinceName;
    @Column(name = "district_name")
    private String districtName;
}
