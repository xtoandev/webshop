package com.phamxuantoan.webshop.dto;

import com.phamxuantoan.webshop.entity.PermissionEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseDTO<UserDTO> {
    private String userName;
    private String email;
    private String password;
    private String phone;
    private String address;
}
