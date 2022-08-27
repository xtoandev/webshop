package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.AccountDTO;
import com.phamxuantoan.webshop.entity.AccountEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.AccountRepository;
import com.phamxuantoan.webshop.service.IAccountService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository adminRepository;

    @Autowired
    private final ModelMapper mapper;

    public AccountService() {
            this.mapper = new ModelMapper();
    }


    @Override
    public List<AccountDTO> findAll() {
        List<AccountDTO> data = new ArrayList<>();
        List<AccountEntity> entity = adminRepository.findAll();

        for(AccountEntity item:entity) {

            data.add(mapper.map(item, AccountDTO.class));
        }

        return data;
    }

    @Override
    public AccountDTO getAdminById(Integer id) {
        List<AccountEntity> entity = adminRepository.findAll();
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
}
