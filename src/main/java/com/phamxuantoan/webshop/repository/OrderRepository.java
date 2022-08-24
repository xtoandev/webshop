package com.phamxuantoan.webshop.repository;

import com.phamxuantoan.webshop.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetailEntity, Integer> {
}
