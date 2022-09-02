package com.phamxuantoan.webshop.controller;


import com.phamxuantoan.webshop.dto.OrderDTO;
import com.phamxuantoan.webshop.entity.OrderEntity;
import com.phamxuantoan.webshop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrderAPI {
    @Autowired
    private IOrderService billsService;

    @GetMapping("/order")
    public List<OrderDTO> listNew() {
        List<OrderDTO> datas = billsService.findAll();
        return datas;
    }
    @GetMapping("/order/{id}")
    public OrderDTO getBillById(@PathVariable Long id) {
        return billsService.getBillById(id);
    }


    @GetMapping("/order/user/{id}")
    public List<OrderDTO> getBillByUserId(@PathVariable Long id) {
        return billsService.getBillByUserId(id);
    }

    @PostMapping("/order")
    public OrderDTO save(@RequestBody OrderEntity user) {
        return billsService.saveOrUpdate(user);
    }

    @PutMapping("/order/{id}")
    public OrderDTO update(@RequestBody OrderEntity user, @PathVariable Long id) {
        user.setId(id);
        return billsService.saveOrUpdate(user);
    }

    @DeleteMapping("/order")
    public void delete(@RequestBody Long[] ids) {
        billsService.delete(ids);
    }
}
