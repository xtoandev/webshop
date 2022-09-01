package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO extends BaseDTO<OrderDetailDTO> {
    private OrderDTO bill;
    private Integer quantity;
    private double amount;
    private Integer status;
    private ProductDTO product;


}
