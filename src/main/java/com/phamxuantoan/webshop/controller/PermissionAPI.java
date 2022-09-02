package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.PermissionDTO;
import com.phamxuantoan.webshop.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class PermissionAPI {
    @Autowired
    private IPermissionService permissionService;

    @GetMapping("/permission")
    public List<PermissionDTO> listNew() {
        List<PermissionDTO> datas =  permissionService.findAll();
        return datas;
    }
    @GetMapping("/permission/{id}")
    public PermissionDTO getPermissionById(@PathVariable Long id) {
        return permissionService.getPermissionById(id);
    }
}
