package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.OrderDetailDTO;
import com.phamxuantoan.webshop.entity.OrderDetailEntity;

import java.util.List;

public interface IOrderDetailService {
    List<OrderDetailDTO> findAll();
    OrderDetailDTO getBillDetailById(Integer id);
    List<OrderDetailDTO> getDetailByBillId(Integer id);
    OrderDetailDTO saveOrUpdate(OrderDetailEntity billsdetail);
    void delete(Integer[] ids);
}
