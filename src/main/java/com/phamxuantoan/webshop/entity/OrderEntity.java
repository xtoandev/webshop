package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class OrderEntity extends BaseEntity{
    @Column(name = "status")
    private Integer status;

    @Column(name = "user_name")
    private String userName;
    @Column(name = "phone_order")
    private String phoneOrder;
    @Column(name = "adress_order")
    private String addressOrder;
    @Column(name = "message")
    private String message;
    @Column(name = "amount")
    private double amount;
    @Column(name = "payment")
    private String payment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userOrder;

    @OneToMany(mappedBy = "order")
    List<OrderDetailEntity> orders = new ArrayList<>();

}
