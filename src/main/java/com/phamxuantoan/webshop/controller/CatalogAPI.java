package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.CatalogDTO;
import com.phamxuantoan.webshop.entity.CatalogEntity;
import com.phamxuantoan.webshop.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CatalogAPI {
    @Autowired
    private ICatalogService catalogService;

    @GetMapping("/api-catalog")
    public List<CatalogDTO> listNew() {
        List<CatalogDTO> datas =  catalogService.findAll();
        return datas;
    }
    @GetMapping("/api-catalog/{id}")
    public CatalogDTO getAdminById(@PathVariable Integer id) {
        return catalogService.getCatalogById(id);
    }

    @PostMapping("/api-catalog")
    public CatalogDTO save(@RequestBody CatalogEntity catalog) {
        return catalogService.saveOrUpdate(catalog);
    }

    @PutMapping("/api-catalog/{id}")
    public CatalogDTO update(@RequestBody CatalogEntity catalog, @PathVariable Integer id) {
        catalog.setId(id);
        return catalogService.saveOrUpdate(catalog);
    }

    @DeleteMapping("/api-catalog")
    public void delete(@RequestBody Integer[] ids) {
        catalogService.delete(ids);
    }
}
