package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.BillsDetailDTO;
import com.phamxuantoan.webshop.entity.BillsDetailEntity;

import java.util.List;

public interface IBillsDetailService {
    List<BillsDetailDTO> findAll();
    BillsDetailDTO getBillDetailById(Integer id);
    List<BillsDetailDTO> getDetailByBillId(Integer id);
    BillsDetailDTO saveOrUpdate(BillsDetailEntity billsdetail);
    void delete(Integer[] ids);
}
