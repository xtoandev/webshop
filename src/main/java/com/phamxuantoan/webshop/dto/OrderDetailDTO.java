package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO extends BaseDTO<OrderDetailDTO> {
    private OrderDTO bill;
    @NotBlank(message = "Quantity is mandatory")
    private Integer quantity;
    private double amount;
    private Integer status;
    private ProductDTO product;


}
