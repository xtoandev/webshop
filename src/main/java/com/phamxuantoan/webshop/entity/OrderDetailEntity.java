package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderdetail")
public class OrderDetailEntity extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    ProductEntity product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    OrderEntity order;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount")
    private double amount;

    @Column(name = "status")
    private Integer status;


}
