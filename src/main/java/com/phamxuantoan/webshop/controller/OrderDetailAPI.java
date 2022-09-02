package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.OrderDetailDTO;
import com.phamxuantoan.webshop.entity.OrderDetailEntity;
import com.phamxuantoan.webshop.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrderDetailAPI {
    @Autowired
    private IOrderDetailService billsdetailService;

    @GetMapping("/orderdetail")
    public List<OrderDetailDTO> listNew() {
        List<OrderDetailDTO> datas = billsdetailService.findAll();
        return datas;
    }
    @GetMapping("/orderdetail/order/{id}")
    public List<OrderDetailDTO> getBillDetailById(@PathVariable Long id) {
        return billsdetailService.getDetailByBillId(id);
    }

    @PostMapping("/orderdetail")
    public OrderDetailDTO save(@RequestBody OrderDetailEntity user) {
        return billsdetailService.saveOrUpdate(user);
    }

    @PutMapping("/orderdetail/{id}")
    public OrderDetailDTO update(@RequestBody OrderDetailEntity user, @PathVariable Long id) {
        user.setId(id);
        return billsdetailService.saveOrUpdate(user);
    }

    @DeleteMapping("/orderdetail")
    public void delete(@RequestBody Long[] ids) {
        billsdetailService.delete(ids);
    }
}
