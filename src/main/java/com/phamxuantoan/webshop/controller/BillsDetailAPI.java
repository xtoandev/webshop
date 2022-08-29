package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.BillsDetailDTO;
import com.phamxuantoan.webshop.entity.BillsDetailEntity;
import com.phamxuantoan.webshop.service.IBillsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BillsDetailAPI {
    @Autowired
    private IBillsDetailService billsdetailService;

    @GetMapping("/api-billsdetail")
    public List<BillsDetailDTO> listNew() {
        List<BillsDetailDTO> datas = billsdetailService.findAll();
        return datas;
    }
    @GetMapping("/api-billsdetail/bills/{id}")
    public List<BillsDetailDTO> getBillDetailById(@PathVariable Integer id) {
        return billsdetailService.getDetailByBillId(id);
    }
    @PostMapping("/api-billsdetail")
    public BillsDetailDTO save(@RequestBody BillsDetailEntity user) {
        return billsdetailService.saveOrUpdate(user);
    }

    @PutMapping("/api-billsdetail/{id}")
    public BillsDetailDTO update(@RequestBody BillsDetailEntity user, @PathVariable Integer id) {
        user.setId(id);
        return billsdetailService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-billsdetail")
    public void delete(@RequestBody Integer[] ids) {
        billsdetailService.delete(ids);
    }
}
