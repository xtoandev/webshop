package com.phamxuantoan.webshop.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.phamxuantoan.webshop.entity.PermissionEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseDTO<UserDTO> {
    private String userName;
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String address;

    private List<PermissionDTO> permissions;
}
