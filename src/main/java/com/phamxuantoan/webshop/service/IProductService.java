package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
}
