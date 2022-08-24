package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "slider")
public class SliderEntity extends BaseEntity{
    @Column(name = "slider_name")
    private String sliderName;
    @Column(name = "image_link")
    private String imageLink;
    @Column(name = "sortOrder")
    private Integer sortOrder;
}
