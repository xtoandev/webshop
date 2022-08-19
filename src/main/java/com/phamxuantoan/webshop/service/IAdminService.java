package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.AdminDTO;

import java.util.List;

public interface IAdminService {
    List<AdminDTO> findAll();
    AdminDTO getAdminById(Integer id);
}
