package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.OrderDetailDTO;
import com.phamxuantoan.webshop.entity.OrderDetailEntity;

import java.util.List;

public interface IOrderDetailService {
    List<OrderDetailDTO> findAll();
    OrderDetailDTO getBillDetailById(Long id);
    List<OrderDetailDTO> getDetailByBillId(Long id);
    OrderDetailDTO saveOrUpdate(OrderDetailEntity billsdetail);
    void delete(Long[] ids);
}
