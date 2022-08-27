package com.phamxuantoan.webshop.service;


import com.phamxuantoan.webshop.dto.PermissionDTO;

import java.util.List;

public interface IPermissionService {
    List<PermissionDTO> findAll();
    PermissionDTO getPermissionById(Integer id);
}
