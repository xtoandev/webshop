package com.phamxuantoan.webshop.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO extends BaseDTO<AccountDTO>{
    private String accountName;
    private String email;
    private String password;
    private String avatar;

    private PermissionDTO permissions;


}
