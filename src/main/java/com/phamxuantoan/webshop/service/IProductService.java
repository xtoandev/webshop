package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.ProductDTO;
import com.phamxuantoan.webshop.entity.ProductEntity;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
    ProductDTO getProductById(Long id);
    List<ProductDTO> getProductByCatalogId(Long id);
    ProductDTO saveOrUpdate(ProductEntity product);
    void delete(Long[] ids);

}
