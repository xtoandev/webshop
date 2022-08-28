package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.ProductDTO;
import com.phamxuantoan.webshop.entity.ProductEntity;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
    ProductDTO getProductById(Integer id);
    ProductDTO saveOrUpdate(ProductEntity product);
    void delete(Integer[] ids);

}
