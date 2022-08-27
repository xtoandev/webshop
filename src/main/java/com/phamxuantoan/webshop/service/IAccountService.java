package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.AccountDTO;

import java.util.List;

public interface IAccountService {
    List<AccountDTO> findAll();
    AccountDTO getAdminById(Integer id);
}
