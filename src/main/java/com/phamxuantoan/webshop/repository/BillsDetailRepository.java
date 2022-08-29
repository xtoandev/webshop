package com.phamxuantoan.webshop.repository;

import com.phamxuantoan.webshop.entity.BillsDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillsDetailRepository extends JpaRepository<BillsDetailEntity, Integer> {
    @Query(value = "select * from billsdetail  where billsdetail.bills_id = ?1",nativeQuery = true)
    List<BillsDetailEntity> findBillByDetailId(Integer id);
}
