package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.CatalogDTO;
import com.phamxuantoan.webshop.entity.CatalogEntity;
import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.util.List;

public interface ICatalogService {
    List<CatalogDTO> findAll();
    CatalogDTO getCatalogById(Integer id);
    CatalogDTO saveOrUpdate(CatalogEntity catalog);
    void delete(Integer[] ids);
}
