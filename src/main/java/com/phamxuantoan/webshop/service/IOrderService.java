package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.OrderDTO;
import com.phamxuantoan.webshop.entity.OrderEntity;

import java.util.List;

public interface IOrderService {
    List<OrderDTO> findAll();
    OrderDTO getBillById(Integer id);
    List<OrderDTO> getBillByUserId(Integer id);
    OrderDTO saveOrUpdate(OrderEntity catalog);
    void delete(Integer[] ids);
}
