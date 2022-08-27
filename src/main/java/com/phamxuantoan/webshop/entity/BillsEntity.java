package com.phamxuantoan.webshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bills")
public class BillsEntity extends BaseEntity{
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
    List<BillsDetailEntity> orderDetails = new ArrayList<>();*/
    @OneToMany(mappedBy = "bill")
    List<BillsDetailEntity> details;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
