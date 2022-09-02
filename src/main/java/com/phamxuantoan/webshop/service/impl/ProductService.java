package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.ProductDTO;
import com.phamxuantoan.webshop.entity.CatalogEntity;
import com.phamxuantoan.webshop.entity.ProductEntity;
import com.phamxuantoan.webshop.repository.CatalogRepository;
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
    private CatalogRepository catalogRepository;
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

    @Override
    public ProductDTO getProductById(Long id) {
        ProductDTO data = new ProductDTO();
        ProductEntity entity = productRepository.getById(id);
        data = mapper.map(entity,ProductDTO.class);
        return data;
    }

    @Override
    public List<ProductDTO> getProductByCatalogId(Long id) {
        List<ProductDTO> data = new ArrayList<>();
        List<ProductEntity> entity = productRepository.findProductByCatalogId(id);
        for(ProductEntity i:entity){
            data.add(mapper.map(i,ProductDTO.class));
        };
        return data;
    }


    @Override
    public ProductDTO saveOrUpdate(ProductEntity product) {
        ProductDTO data = new ProductDTO();
        if(product.getCatalog().getId() != null){
            CatalogEntity catalog = catalogRepository.getById(product.getCatalog().getId());
            product.setCatalog(catalog);
        }
        ProductEntity entity = productRepository.save(product);
        data = mapper.map(entity, ProductDTO.class);
        return data;
    }

    @Override
    public void delete(Long[] ids) {
        for(Long item:ids) {
            productRepository.deleteById(item);
        }
    }


}
