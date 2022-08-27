package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "billsdetail")
public class BillsDetailEntity extends BaseEntity{


    @ManyToOne
    @JoinColumn(name = "product_id")
    ProductEntity product;

    @ManyToOne
    @JoinColumn(name = "bills_id")
    BillsEntity bill;


    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount")
    private double amount;

    @Column(name = "status")
    private Integer status;
}
