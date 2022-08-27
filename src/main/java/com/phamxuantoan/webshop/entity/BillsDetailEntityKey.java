package com.phamxuantoan.webshop.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BillsDetailEntityKey implements Serializable {
    @Column(name = "product_id",columnDefinition = "int(11) NOT NULL")
    Integer productId;

    @Column(name = "order_id",columnDefinition = "int(11) NOT NULL")
    Integer orderId;
}
