package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order")
public class OrderDetailEntity extends BaseEntity{



    @Column(name = "product_id")
    private Integer productID;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount")
    private double amount;

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;

}
