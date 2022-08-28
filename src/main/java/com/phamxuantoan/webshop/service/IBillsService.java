package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.BillsDTO;

import java.util.List;

public interface IBillsService {
    List<BillsDTO> findAll();
    BillsDTO getBillById(Integer id);
}
