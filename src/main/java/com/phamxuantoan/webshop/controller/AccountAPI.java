package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.AccountDTO;
import com.phamxuantoan.webshop.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AccountAPI {
    @Autowired
    private IAccountService adminService;

    @GetMapping(value = "/admin")
    public List<AccountDTO> listNew() {
        List<AccountDTO> datas =  adminService.findAll();
        return datas;
    }
    @GetMapping("/admin/{id}")
    public AccountDTO getAdminById(@PathVariable Integer id) {
        return adminService.getAdminById(id);
    }
}
