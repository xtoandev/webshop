package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.BillsDetailDTO;
import com.phamxuantoan.webshop.service.IBillsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class BillsDetailAPI {
    @Autowired
    private IBillsDetailService billsdetailService;

    @GetMapping(value = "/api-billsdetail")
    public List<BillsDetailDTO> listNew() {
        List<BillsDetailDTO> datas = billsdetailService.findAll();
        return datas;
    }
}
