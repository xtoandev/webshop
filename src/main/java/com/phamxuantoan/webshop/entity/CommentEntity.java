package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "comment")
public class CommentEntity extends BaseEntity{
    @Column(name = "product_id")
    private Integer productID;
    @Column(name = "content")
    private String content;
    @Column(name = "image_link")
    private String imageLink;
    @Column(name = "rate")
    private Integer rate;
    @Column(name = "user_id")
    private Integer userID;
}
