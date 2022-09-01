package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO extends BaseDTO<OrderDTO> {
    private Integer status;
    private String message;
    private double amount;
    private String payment;

    private UserDTO user;
}
