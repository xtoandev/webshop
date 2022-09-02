package com.phamxuantoan.webshop.controller;


import com.phamxuantoan.webshop.dto.OrderDTO;
import com.phamxuantoan.webshop.entity.OrderEntity;
import com.phamxuantoan.webshop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OrderAPI extends BaseAPI{
    @Autowired
    private IOrderService orderService;

    @GetMapping("/api-order")
    public List<OrderDTO> listNew() {
        List<OrderDTO> datas = orderService.findAll();
        return datas;
    }
    @GetMapping("/api-order/{id}")
    public OrderDTO getBillById(@PathVariable Long id) {
        return orderService.getBillById(id);
    }


    @GetMapping("/api-order/user/{id}")
    public List<OrderDTO> getBillByUserId(@PathVariable Long id) {
        return orderService.getBillByUserId(id);
    }

    @PostMapping("/api-order")
    public OrderDTO save(@RequestBody OrderEntity user) {
        return orderService.saveOrUpdate(user);
    }

    @PutMapping("/api-order/{id}")
    public OrderDTO update(@RequestBody OrderEntity user, @PathVariable Long id) {
        user.setId(id);
        return orderService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-order")
    public void delete(@RequestBody Long[] ids) {
        orderService.delete(ids);
    }
}
