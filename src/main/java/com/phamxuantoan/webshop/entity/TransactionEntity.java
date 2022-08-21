package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "transaction")
public class TransactionEntity extends BaseEntity{
    @Column(name = "status")
    private Integer status;
    @Column(name = "user_id")
    private Integer userID;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_phone")
    private String userPhone;
    @Column(name = "user_adress")
    private String userAddress;
    @Column(name = "message")
    private String message;
    @Column(name = "amount")
    private double amount;
    @Column(name = "payment")
    private String payment;
}
