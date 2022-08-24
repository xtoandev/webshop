package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO extends BaseDTO<OrderDTO> {
    private Integer status;
    private Integer userID;
    private String userName;
    private String emailOrder;
    private String phoneOrder;
    private String addressOrder;
    private String message;
    private double amount;
    private String payment;

}
