package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class UserDTO extends BaseDTO<UserDTO> {
    private String userName;
    private String email;
    private String password;
    private String phone;
    private String address;

}
