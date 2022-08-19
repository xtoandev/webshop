package com.phamxuantoan.webshop.dto;

public class ShippingDTO extends BaseDTO<ShippingDTO> {
    private double shipping_code;
    private Integer provinceID;
    private Integer districtID;
    private String provinceName;
    private String districtName;

    public double getShipping_code() {
        return shipping_code;
    }

    public void setShipping_code(double shipping_code) {
        this.shipping_code = shipping_code;
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public Integer getDistrictID() {
        return districtID;
    }

    public void setDistrictID(Integer districtID) {
        this.districtID = districtID;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
