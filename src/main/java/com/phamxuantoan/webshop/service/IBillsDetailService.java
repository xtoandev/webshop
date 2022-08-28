package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.BillsDetailDTO;

import java.util.List;

public interface IBillsDetailService {
    List<BillsDetailDTO> findAll();
    BillsDetailDTO getDetailByBillId(Integer id);
}
