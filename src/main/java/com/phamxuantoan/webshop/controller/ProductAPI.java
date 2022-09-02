package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.ProductDTO;
import com.phamxuantoan.webshop.entity.ProductEntity;
import com.phamxuantoan.webshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductAPI {
    @Autowired
    private IProductService productService;

    @GetMapping( "/product")
    public List<ProductDTO> listNew() {
        List<ProductDTO> datas = productService.findAll();
        return datas;
    }
    @GetMapping( "/product/{id}")
    public ProductDTO getProductById(@PathVariable Long  id) {
        return productService.getProductById(id);
    }

    @GetMapping( "/product/catalog/{id}")
    public List<ProductDTO> getProductByCatalogId(@PathVariable Long id) {
        return productService.getProductByCatalogId(id);

    }

    @PostMapping("/product")
    public ProductDTO save(@RequestBody ProductEntity product) {
        return productService.saveOrUpdate(product);
    }

    @PutMapping("/product/{id}")
    public ProductDTO update(@RequestBody ProductEntity product, @PathVariable Long  id) {
        product.setId(id);
        return productService.saveOrUpdate(product);
    }

    @DeleteMapping("/product")
    public void delete(@RequestBody Long [] ids) {
        productService.delete(ids);
    }
}
