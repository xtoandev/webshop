package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.CatalogDTO;
import com.phamxuantoan.webshop.entity.CatalogEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.CatalogRepository;
import com.phamxuantoan.webshop.service.ICatalogService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CatalogService implements ICatalogService {
    @Autowired
    private CatalogRepository catalogRepository;

    @Autowired
    private final ModelMapper mapper;

    public CatalogService(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<CatalogDTO> findAll() {
        List<CatalogDTO> data = new ArrayList<>();
        List<CatalogEntity> entity = catalogRepository.findAll();

        for(CatalogEntity item:entity) {

            data.add(mapper.map(item, CatalogDTO.class));
        }

        return data;
    }

    @Override
    public CatalogDTO getCatalogById(Integer id) {
        List<CatalogEntity> entity = catalogRepository.findAll();
        for(CatalogEntity i:entity){
            if(i.getId() == id){
                CatalogDTO data = mapper.map(i, CatalogDTO.class);
                return data;
            }

        }throw  new NotFoundException("Catalog_NOT_FOUND_IN");
    }

    @Override
    public CatalogDTO saveOrUpdate(CatalogEntity catalog) {
        CatalogDTO data = new CatalogDTO();
        CatalogEntity entity = catalogRepository.save(catalog);
        data = mapper.map(entity, CatalogDTO.class);
        return data;
    }

    @Override
    public void delete(Integer[] ids) {
        for(Integer item:ids) {
            catalogRepository.deleteById(item);
        }
    }
}
