package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "order")
public class OrderEntity extends BaseEntity{

    @Column(name = "transaction_id")
    private Integer transactionID;

    @Column(name = "product_id")
    private Integer productID;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount")
    private double amount;

    @Column(name = "status")
    private Integer status;
}
