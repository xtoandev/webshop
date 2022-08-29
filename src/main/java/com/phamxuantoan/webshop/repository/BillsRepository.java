package com.phamxuantoan.webshop.repository;


import com.phamxuantoan.webshop.entity.BillsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillsRepository extends JpaRepository<BillsEntity, Integer> {

    @Query(value = "select * from bills  where bills.user_id = ?1",nativeQuery = true)
    List<BillsEntity> findBillByUserId(Integer id);
}
