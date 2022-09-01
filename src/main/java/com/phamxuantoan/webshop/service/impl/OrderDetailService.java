package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.OrderDetailDTO;
import com.phamxuantoan.webshop.entity.OrderDetailEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.OrderDetailRepository;
import com.phamxuantoan.webshop.service.IOrderDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private final ModelMapper mapper;

    public OrderDetailService(ModelMapper mapper) {
        this.mapper = mapper;
    }
    @Override
    public List<OrderDetailDTO> findAll() {
        List<OrderDetailDTO> data = new ArrayList<>();
        List<OrderDetailEntity> entity = orderDetailRepository.findAll();

        for(OrderDetailEntity item:entity) {

            data.add(mapper.map(item, OrderDetailDTO.class));
        }

        return data;
    }

    @Override
    public OrderDetailDTO getBillDetailById(Integer id) {
        List<OrderDetailEntity> entity = orderDetailRepository.findAll();
        for(OrderDetailEntity i:entity){
            if(i.getId() == id){
                OrderDetailDTO data = mapper.map(i, OrderDetailDTO.class);
                return data;
            }

        }throw  new NotFoundException("BILLS_NOT_FOUND_IN");
    }

    public List<OrderDetailDTO> getDetailByBillId(Integer id) {
        List<OrderDetailDTO> data = new ArrayList<>();
        List<OrderDetailEntity> entity = orderDetailRepository.findBillByDetailId(id);
        for(OrderDetailEntity i:entity){

            data.add(mapper.map(i, OrderDetailDTO.class));
        };
        return data;
    }

    @Override
    public OrderDetailDTO saveOrUpdate(OrderDetailEntity billsdetail) {
        OrderDetailDTO data = new OrderDetailDTO();

        OrderDetailEntity entity = orderDetailRepository.save(billsdetail);
        data = mapper.map(entity, OrderDetailDTO.class);
        return data;
    }


    @Override
    public void delete(Integer[] ids) {
        for(Integer item:ids) {

            orderDetailRepository.deleteById(item);
        }
    }
}
