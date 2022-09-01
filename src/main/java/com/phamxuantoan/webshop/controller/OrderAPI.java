package com.phamxuantoan.webshop.controller;


import com.phamxuantoan.webshop.dto.OrderDTO;
import com.phamxuantoan.webshop.entity.OrderEntity;
import com.phamxuantoan.webshop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OrderAPI {
    @Autowired
    private IOrderService billsService;

    @GetMapping("/api-order")
    public List<OrderDTO> listNew() {
        List<OrderDTO> datas = billsService.findAll();
        return datas;
    }
    @GetMapping("/api-order/{id}")
    public OrderDTO getBillById(@PathVariable Integer id) {
        return billsService.getBillById(id);
    }


    @GetMapping("/api-order/user/{id}")
    public List<OrderDTO> getBillByUserId(@PathVariable Integer id) {
        return billsService.getBillByUserId(id);
    }

    @PostMapping("/api-order")
    public OrderDTO save(@RequestBody OrderEntity user) {
        return billsService.saveOrUpdate(user);
    }

    @PutMapping("/api-order/{id}")
    public OrderDTO update(@RequestBody OrderEntity user, @PathVariable Integer id) {
        user.setId(id);
        return billsService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-order")
    public void delete(@RequestBody Integer[] ids) {
        billsService.delete(ids);
    }
}
