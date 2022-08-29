package com.phamxuantoan.webshop.repository;

import com.phamxuantoan.webshop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    @Query(value = "select * from product  where product.catalog_id = ?1",nativeQuery = true)
    List<ProductEntity> findProductByCatalogId(Integer id);
}
