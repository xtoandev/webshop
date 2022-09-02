package com.phamxuantoan.webshop.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.phamxuantoan.webshop.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionDTO extends BaseDTO<PermissionDTO>{

    private String permissionName;
}
