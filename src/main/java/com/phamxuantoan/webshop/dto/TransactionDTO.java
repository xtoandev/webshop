package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class TransactionDTO extends BaseDTO<TransactionDTO> {
    private Integer status;
    private Integer userID;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userAddress;
    private String message;
    private double amount;
    private String payment;

}
