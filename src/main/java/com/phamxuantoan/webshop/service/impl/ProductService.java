package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.ProductDTO;
import com.phamxuantoan.webshop.entity.ProductEntity;
import com.phamxuantoan.webshop.repository.ProductRepository;
import com.phamxuantoan.webshop.service.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private final ModelMapper mapper;

    public ProductService() {
        this.mapper = new ModelMapper();
    }

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> data = new ArrayList<>();
        List<ProductEntity> entity = productRepository.findAll();

        for(ProductEntity item:entity) {
            data.add(mapper.map(item, ProductDTO.class));
        }

        return data;
    }
}
