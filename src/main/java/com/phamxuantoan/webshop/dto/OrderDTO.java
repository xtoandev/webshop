package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class OrderDTO extends BaseDTO<OrderDTO> {
    private Integer transactionID;
    private Integer productID;
    private Integer quantity;
    private double amount;
    private Integer status;


}
