package com.phamxuantoan.webshop.dto;

import com.phamxuantoan.webshop.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillsDTO extends BaseDTO<BillsDTO> {
    private Integer status;
    private String message;
    private double amount;
    private String payment;

    private UserDTO user;
}
