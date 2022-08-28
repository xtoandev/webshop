package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.AccountDTO;
import com.phamxuantoan.webshop.entity.AccountEntity;
import com.phamxuantoan.webshop.entity.PermissionEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.AccountRepository;
import com.phamxuantoan.webshop.repository.PermissionRepository;
import com.phamxuantoan.webshop.service.IAccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private PermissionRepository permissionRepository;
    @Autowired
    private final ModelMapper mapper;

    public AccountService() {
            this.mapper = new ModelMapper();
    }


    @Override
    public List<AccountDTO> findAll() {
        List<AccountDTO> data = new ArrayList<>();
        List<AccountEntity> entity = accountRepository.findAll();

        for(AccountEntity item:entity) {

            data.add(mapper.map(item, AccountDTO.class));
        }

        return data;
    }

    @Override
    public AccountDTO getAccountById(Integer id) {
        List<AccountEntity> entity = accountRepository.findAll();
        for(AccountEntity i:entity){
            if(i.getId() == id){
                AccountDTO data = mapper.map(i, AccountDTO.class);
                return data;
            }

        }throw  new NotFoundException("ACCOUNT_NOT_FOUND_IN");


        /*
        if(entity != null){
            AccountDTO data = mapper.map(entity, AccountDTO.class);
            return data;
        }
        throw  new NotFoundException("ADMIN_NOT_FOUND_IN");*/

    }
    @Override
    public AccountDTO saveOrUpdate(AccountEntity account) {
        AccountDTO data = new AccountDTO();
        PermissionEntity per = new PermissionEntity();
        per = permissionRepository.getById(account.getPermissions().getId());
        account.setPermissions(per);
        AccountEntity entity = accountRepository.save(account);
        data = mapper.map(entity, AccountDTO.class);
        return data;
    }


    @Override
    public void delete(Integer[] ids) {
        for(Integer item:ids) {
            accountRepository.deleteById(item);
        }
    }
}
