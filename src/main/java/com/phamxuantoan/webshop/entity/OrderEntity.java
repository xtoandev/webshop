package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity extends BaseEntity{
    @Column(name = "status")
    private Integer status;

    @Column(name = "adressOrder")
    private String addressOrder;
    @Column(name = "message")
    private String message;
    @Column(name = "amount")
    private double amount;
    @Column(name = "payment")
    private String payment;



    /*
    @OneToMany(mappedBy = "orderDetail")
    List<OrderDetailEntity> orderDetails = new ArrayList<>();*/
    @OneToMany(mappedBy = "order")
    List<OrderDetailEntity> details;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
