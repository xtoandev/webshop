package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class AdminDTO extends BaseDTO<AdminDTO>{
    private String adminName;
    private String email;
    private String password;
    private String avatar;
    private Integer level;

}
