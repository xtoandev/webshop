package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.OrderDetailDTO;
import com.phamxuantoan.webshop.entity.OrderDetailEntity;
import com.phamxuantoan.webshop.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OrderDetailAPI {
    @Autowired
    private IOrderDetailService billsdetailService;

    @GetMapping("/api-orderdetail")
    public List<OrderDetailDTO> listNew() {
        List<OrderDetailDTO> datas = billsdetailService.findAll();
        return datas;
    }
    @GetMapping("/api-orderdetail/order/{id}")
    public List<OrderDetailDTO> getBillDetailById(@PathVariable Integer id) {
        return billsdetailService.getDetailByBillId(id);
    }

    @PostMapping("/api-orderdetail")
    public OrderDetailDTO save(@RequestBody OrderDetailEntity user) {
        return billsdetailService.saveOrUpdate(user);
    }

    @PutMapping("/api-orderdetail/{id}")
    public OrderDetailDTO update(@RequestBody OrderDetailEntity user, @PathVariable Integer id) {
        user.setId(id);
        return billsdetailService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-orderdetail")
    public void delete(@RequestBody Integer[] ids) {
        billsdetailService.delete(ids);
    }
}
