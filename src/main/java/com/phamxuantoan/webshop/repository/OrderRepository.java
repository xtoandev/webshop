package com.phamxuantoan.webshop.repository;


import com.phamxuantoan.webshop.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    @Query(value = "select * from bills  where bills.user_id = ?1",nativeQuery = true)
    List<OrderEntity> findBillByUserId(Long id);
}
