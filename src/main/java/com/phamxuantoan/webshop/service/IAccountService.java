package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.AccountDTO;
import com.phamxuantoan.webshop.entity.AccountEntity;

import java.util.List;

public interface IAccountService {
    List<AccountDTO> findAll();
    AccountDTO getAccountById(Integer id);
    AccountDTO saveOrUpdate(AccountEntity account);
    void delete(Integer[] ids);


}
