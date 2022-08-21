package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class ShippingDTO extends BaseDTO<ShippingDTO> {
    private double shippingCode;
    private Integer provinceID;
    private Integer districtID;
    private String provinceName;
    private String districtName;
}