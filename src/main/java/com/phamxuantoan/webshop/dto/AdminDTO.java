package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO extends BaseDTO<AdminDTO>{
    private String adminName;
    private String email;
    private String password;
    private String avatar;
    private Integer permissionID;

}
