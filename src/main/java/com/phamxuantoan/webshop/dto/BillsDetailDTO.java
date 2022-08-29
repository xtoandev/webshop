package com.phamxuantoan.webshop.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillsDetailDTO extends BaseDTO<BillsDetailDTO> {
    private BillsDTO bill;
    private Integer quantity;
    private double amount;
    private Integer status;
    private ProductDTO product;


}
