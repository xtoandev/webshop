package com.phamxuantoan.webshop.repository;

import com.phamxuantoan.webshop.entity.BillsDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsRepository extends JpaRepository<BillsDetailEntity, Integer> {
}