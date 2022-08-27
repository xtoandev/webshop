package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.PermissionDTO;
import com.phamxuantoan.webshop.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class PermissionAPI {
    @Autowired
    private IPermissionService permissionService;

    @GetMapping(value = "/permission")
    public List<PermissionDTO> listNew() {
        List<PermissionDTO> datas =  permissionService.findAll();
        return datas;
    }
    @GetMapping("/permission/{id}")
    public PermissionDTO getPermissionById(@PathVariable Integer id) {
        return permissionService.getPermissionById(id);
    }
}
