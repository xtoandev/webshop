package com.phamxuantoan.webshop.dto;

public class ProductDTO extends BaseDTO<ProductDTO> {
    private Integer catalogID;
    private String productName;
    private String content;
    private double price;
    private Integer discount;
    private String image_link;
    private String image_list;
    private Integer viewCount;
    private Integer buyedCount;
    private Integer rateTotal;
    private Integer rateCount;

    public Integer getCatalogID() {
        return catalogID;
    }

    public void setCatalogID(Integer catalogID) {
        this.catalogID = catalogID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getImage_list() {
        return image_list;
    }

    public void setImage_list(String image_list) {
        this.image_list = image_list;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getBuyedCount() {
        return buyedCount;
    }

    public void setBuyedCount(Integer buyedCount) {
        this.buyedCount = buyedCount;
    }

    public Integer getRateTotal() {
        return rateTotal;
    }

    public void setRateTotal(Integer rateTotal) {
        this.rateTotal = rateTotal;
    }

    public Integer getRateCount() {
        return rateCount;
    }

    public void setRateCount(Integer rateCount) {
        this.rateCount = rateCount;
    }
}
