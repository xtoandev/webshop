package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.AccountDTO;
import com.phamxuantoan.webshop.dto.ProductDTO;
import com.phamxuantoan.webshop.entity.AccountEntity;
import com.phamxuantoan.webshop.entity.ProductEntity;
import com.phamxuantoan.webshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProductAPI {
    @Autowired
    private IProductService productService;

    @GetMapping( "/api-product")
    public List<ProductDTO> listNew() {
        List<ProductDTO> datas = productService.findAll();
        return datas;
    }
    @GetMapping( "/api-product/{id}")
    public ProductDTO getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping( "/api-product/catalog/{id}")
    public List<ProductDTO> getProductByCatalogId(@PathVariable Integer id) {
        return productService.getProductByCatalogId(id);

    }

    @PostMapping("/api-product")
    public ProductDTO save(@RequestBody ProductEntity product) {
        return productService.saveOrUpdate(product);
    }

    @PutMapping("/api-product/{id}")
    public ProductDTO update(@RequestBody ProductEntity product, @PathVariable Integer id) {
        product.setId(id);
        return productService.saveOrUpdate(product);
    }

    @DeleteMapping("/api-product")
    public void delete(@RequestBody Integer[] ids) {
        productService.delete(ids);
    }
}
