package com.phamxuantoan.webshop.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.phamxuantoan.webshop.entity.PermissionEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseDTO<UserDTO> {
    @NotEmpty(message = "Thiếu username")
    private String userName;

    @NotEmpty
    private String fullName;

    @Email(message = "Email không hợp lệ")
    private String email;

    @NotEmpty(message = "Thiếu password")
    @Min(value = 8, message = "Password phải từ 8 kí tự trở lên")
    private String password;

    private String phone;
    private String address;

    @NotEmpty(message = "Thiếu quyền")
    private List<PermissionDTO> permissions;
}
