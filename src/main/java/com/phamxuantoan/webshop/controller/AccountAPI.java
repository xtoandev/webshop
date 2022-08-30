package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.AccountDTO;
import com.phamxuantoan.webshop.entity.AccountEntity;
import com.phamxuantoan.webshop.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AccountAPI {
    @Autowired
    private IAccountService accountService;

    @GetMapping("/api-account")
    public List<AccountDTO> listNew() {
        List<AccountDTO> datas =  accountService.findAll();
        return datas;
    }
    @GetMapping("/api-account/{id}")
    public AccountDTO getAdminById(@PathVariable Integer id) {
        AccountDTO data = accountService.getAccountById(id);
        return data;
    }

    @PostMapping("/api-account")
    public AccountDTO save(@RequestBody AccountEntity user) {
        return accountService.saveOrUpdate(user);
    }

    @PutMapping("/api-account/{id}")
    public AccountDTO update(@RequestBody AccountEntity user, @PathVariable Integer id) {
        user.setId(id);
        return accountService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-account")
    public void delete(@RequestBody Integer[] ids) {
        accountService.delete(ids);
    }

}
