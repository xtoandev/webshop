package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.ProductDTO;
import com.phamxuantoan.webshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping(value = "/product")
    public List<ProductDTO> listNew() {
        List<ProductDTO> datas = productService.findAll();
        return datas;
    }
}
