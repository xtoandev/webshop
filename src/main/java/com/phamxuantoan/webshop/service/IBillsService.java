package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.BillsDTO;
import com.phamxuantoan.webshop.entity.BillsEntity;

import java.util.List;

public interface IBillsService {
    List<BillsDTO> findAll();
    BillsDTO getBillById(Integer id);
    List<BillsDTO> getBillByUserId(Integer id);
    BillsDTO saveOrUpdate(BillsEntity catalog);
    void delete(Integer[] ids);
}
