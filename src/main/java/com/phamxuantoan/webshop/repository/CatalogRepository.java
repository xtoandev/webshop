package com.phamxuantoan.webshop.repository;

import com.phamxuantoan.webshop.entity.CatalogEntity;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
    Catalog findByCatalogName(String catalogName);
}
