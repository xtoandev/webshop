package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class CommentEntity extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity productComment;

    @Column(name = "content")
    private String content;
    @Column(name = "image_link")
    private String imageLink;
    @Column(name = "rate")
    private Integer rate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity userComment;
}
