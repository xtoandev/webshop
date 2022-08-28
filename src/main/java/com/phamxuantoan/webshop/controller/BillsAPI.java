package com.phamxuantoan.webshop.controller;


import com.phamxuantoan.webshop.dto.BillsDTO;
import com.phamxuantoan.webshop.service.IBillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class BillsAPI {
    @Autowired
    private IBillsService billsService;

    @GetMapping(value = "/api-bills")
    public List<BillsDTO> listNew() {
        List<BillsDTO> datas = billsService.findAll();
        return datas;
    }
    @GetMapping("/api-bills/{id}")
    public BillsDTO getAdminById(@PathVariable Integer id) {
        return billsService.getBillById(id);
    }
}
