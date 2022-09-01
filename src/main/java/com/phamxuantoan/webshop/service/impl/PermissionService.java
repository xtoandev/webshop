package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.PermissionDTO;
import com.phamxuantoan.webshop.entity.PermissionEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.PermissionRepository;
import com.phamxuantoan.webshop.service.IPermissionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service
public class PermissionService implements IPermissionService {
    @Autowired
    private PermissionRepository permissionRepository;
    @Autowired
    private final ModelMapper mapper;

    public PermissionService() {
        this.mapper = new ModelMapper();
    }

    @Override
    public List<PermissionDTO> findAll() {
        List<PermissionDTO> data = new ArrayList<>();
        List<PermissionEntity> entity = permissionRepository.findAll();

        for(PermissionEntity item:entity) {

            data.add(mapper.map(item,PermissionDTO.class));
        }

        return data;
    }

    @Override
    public PermissionDTO getPermissionById(Integer id) {
        List<PermissionEntity> entity = permissionRepository.findAll();
        for(PermissionEntity i:entity){
            if(i.getId() == id){
                PermissionDTO data = mapper.map(i, PermissionDTO.class);
                return data;
            }

        }throw  new NotFoundException("PERMISSION_NOT_FOUND_IN");
    }

}
