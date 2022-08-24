package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.AdminDTO;
import com.phamxuantoan.webshop.entity.AdminEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.mapper.AdminMapper;
import com.phamxuantoan.webshop.repository.AdminRepository;
import com.phamxuantoan.webshop.service.IAdminService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AdminService implements IAdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private final ModelMapper mapper;

    public AdminService() {
            this.mapper = new ModelMapper();
    }


    @Override
    public List<AdminDTO> findAll() {
        List<AdminDTO> data = new ArrayList<>();
        List<AdminEntity> entity = adminRepository.findAll();

        for(AdminEntity item:entity) {
            data.add(mapper.map(item, AdminDTO.class));
        }

        return data;
    }

    @Override
    public AdminDTO getAdminById(Integer id) {
        List<AdminEntity> entity = adminRepository.findAll();
        for(AdminEntity i:entity){
            if(i.getId() == id){
                AdminDTO data = mapper.map(i, AdminDTO.class);
                return data;
            }

        }throw  new NotFoundException("ADMIN_NOT_FOUND_IN");


        /*
        if(entity != null){
            AdminDTO data = mapper.map(entity, AdminDTO.class);
            return data;
        }
        throw  new NotFoundException("ADMIN_NOT_FOUND_IN");*/

    }
}
