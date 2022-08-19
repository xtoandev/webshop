package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.AdminDTO;
import com.phamxuantoan.webshop.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @GetMapping(value = "/admin")
    public List<AdminDTO> listNew() {
        List<AdminDTO> datas =  adminService.findAll();
        return datas;
    }
    @GetMapping("/admin/{id}")
    public AdminDTO getAdminById(@PathVariable Integer id) {
        return adminService.getAdminById(id);
    }
}
