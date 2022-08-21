package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity{
    @Column(name = "catalog_id")
    private Integer catalogID;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "content")
    private String content;
    @Column(name = "price")
    private double price;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "image_link")
    private String imageLink;
    @Column(name = "image_list")
    private String imageList;
    @Column(name = "view_count")
    private Integer viewCount;
    @Column(name = "buyedCount")
    private Integer buyedCount;
    @Column(name = "rateTotal")
    private Integer rateTotal;
    @Column(name = "rateCount")
    private Integer rateCount;
}
