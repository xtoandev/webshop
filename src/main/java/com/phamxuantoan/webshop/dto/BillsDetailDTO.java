package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillsDetailDTO extends BaseDTO<BillsDetailDTO> {
    private Integer orderID;
    private Integer productID;
    private Integer quantity;
    private double amount;
    private Integer status;


}
