package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.OrderDetailDTO;
import com.phamxuantoan.webshop.entity.OrderDetailEntity;
import com.phamxuantoan.webshop.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OrderDetailAPI extends BaseAPI{
    @Autowired
    private IOrderDetailService orderdetailService;

    @GetMapping("/orderdetail")
    public List<OrderDetailDTO> listNew() {
        List<OrderDetailDTO> datas = orderdetailService.findAll();
        return datas;
    }
    @GetMapping("/api-orderdetail/order/{id}")
    public List<OrderDetailDTO> getBillDetailById(@PathVariable Long id) {
        return orderdetailService.getDetailByBillId(id);
    }

    @PostMapping("/api-orderdetail")
    public OrderDetailDTO save(@RequestBody OrderDetailEntity user) {
        return orderdetailService.saveOrUpdate(user);
    }

    @PutMapping("/api-orderdetail/{id}")
    public OrderDetailDTO update(@RequestBody OrderDetailEntity user, @PathVariable Long id) {
        user.setId(id);
        return orderdetailService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-orderdetail")
    public void delete(@RequestBody Long[] ids) {
        orderdetailService.delete(ids);
    }
}
