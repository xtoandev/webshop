package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.OrderDTO;
import com.phamxuantoan.webshop.entity.OrderEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.OrderRepository;
import com.phamxuantoan.webshop.service.IOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private final ModelMapper mapper;

    public OrderService(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<OrderDTO> findAll() {
        List<OrderDTO> data = new ArrayList<>();
        List<OrderEntity> entity = orderRepository.findAll();

        for(OrderEntity item:entity) {

            data.add(mapper.map(item, OrderDTO.class));
        }

        return data;
    }

    @Override
    public OrderDTO getBillById(Long id) {
        List<OrderEntity> entity = orderRepository.findAll();
        for(OrderEntity i:entity){
            if(i.getId() == id){
                OrderDTO data = mapper.map(i, OrderDTO.class);
                return data;
            }

        }throw  new NotFoundException("BILLS_NOT_FOUND_IN");
    }

    @Override
    public List<OrderDTO> getBillByUserId(Long id) {
        List<OrderDTO> data = new ArrayList<>();
        List<OrderEntity> entity = orderRepository.findBillByUserId(id);
        for(OrderEntity i:entity){

            data.add(mapper.map(i, OrderDTO.class));
        };
        return data;
    }



    @Override
    public OrderDTO saveOrUpdate(OrderEntity catalog) {
        OrderDTO data = new OrderDTO();
        OrderEntity entity = orderRepository.save(catalog);
        data = mapper.map(entity, OrderDTO.class);
        return data;
    }

    @Override
    public void delete(Long[] ids) {
        for(Long item:ids) {
            orderRepository.deleteById(item);
        }
    }
}
