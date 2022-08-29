package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.BillsDTO;
import com.phamxuantoan.webshop.entity.BillsEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.BillsRepository;
import com.phamxuantoan.webshop.service.IBillsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillsService implements IBillsService {

    @Autowired
    private BillsRepository billsRepository;

    @Autowired
    private final ModelMapper mapper;

    public BillsService(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<BillsDTO> findAll() {
        List<BillsDTO> data = new ArrayList<>();
        List<BillsEntity> entity = billsRepository.findAll();

        for(BillsEntity item:entity) {

            data.add(mapper.map(item, BillsDTO.class));
        }

        return data;
    }

    @Override
    public BillsDTO getBillById(Integer id) {
        List<BillsEntity> entity = billsRepository.findAll();
        for(BillsEntity i:entity){
            if(i.getId() == id){
                BillsDTO data = mapper.map(i,BillsDTO.class);
                return data;
            }

        }throw  new NotFoundException("BILLS_NOT_FOUND_IN");
    }

    @Override
    public List<BillsDTO> getBillByUserId(Integer id) {
        List<BillsDTO> data = new ArrayList<>();
        List<BillsEntity> entity = billsRepository.findBillByUserId(id);
        for(BillsEntity i:entity){

            data.add(mapper.map(i,BillsDTO.class));
        };
        return data;
    }



    @Override
    public BillsDTO saveOrUpdate(BillsEntity catalog) {
        BillsDTO data = new BillsDTO();
        BillsEntity entity = billsRepository.save(catalog);
        data = mapper.map(entity, BillsDTO.class);
        return data;
    }

    @Override
    public void delete(Integer[] ids) {
        for(Integer item:ids) {
            billsRepository.deleteById(item);
        }
    }
}
