package com.phamxuantoan.webshop.controller;


import com.phamxuantoan.webshop.dto.BillsDTO;
import com.phamxuantoan.webshop.entity.BillsEntity;
import com.phamxuantoan.webshop.service.IBillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BillsAPI {
    @Autowired
    private IBillsService billsService;

    @GetMapping("/api-bills")
    public List<BillsDTO> listNew() {
        List<BillsDTO> datas = billsService.findAll();
        return datas;
    }
    @GetMapping("/api-bills/{id}")
    public BillsDTO getBillById(@PathVariable Integer id) {
        return billsService.getBillById(id);
    }


    @GetMapping("/api-bills/user/{id}")
    public List<BillsDTO> getBillByUserId(@PathVariable Integer id) {
        return billsService.getBillByUserId(id);
    }

    @PostMapping("/api-bills")
    public BillsDTO save(@RequestBody BillsEntity user) {
        return billsService.saveOrUpdate(user);
    }

    @PutMapping("/api-bills/{id}")
    public BillsDTO update(@RequestBody BillsEntity user, @PathVariable Integer id) {
        user.setId(id);
        return billsService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-bills")
    public void delete(@RequestBody Integer[] ids) {
        billsService.delete(ids);
    }
}
