package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.CatalogDTO;
import com.phamxuantoan.webshop.entity.CatalogEntity;
import com.phamxuantoan.webshop.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
public class CatalogAPI extends BaseAPI{
    @Autowired
    private ICatalogService catalogService;

    @GetMapping("/catalog")
    public List<CatalogDTO> listNew() {
        List<CatalogDTO> datas =  catalogService.findAll();
        return datas;
    }
    @GetMapping("/catalog/{id}")
    public CatalogDTO getAdminById(@PathVariable Long id) {
        return catalogService.getCatalogById(id);
    }

    @PostMapping("/catalog")
    public CatalogDTO save(@Valid @RequestBody CatalogEntity catalog) {
        return catalogService.saveOrUpdate(catalog);
    }

    @PutMapping("/catalog/{id}")
    public CatalogDTO update(@RequestBody CatalogEntity catalog, @PathVariable Long id) {
        catalog.setId(id);
        return catalogService.saveOrUpdate(catalog);
    }

    @DeleteMapping("/catalog")
    public void delete(@RequestBody Long[] ids) {
        catalogService.delete(ids);
    }
}
