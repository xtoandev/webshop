package com.phamxuantoan.webshop.repository;

import com.phamxuantoan.webshop.entity.SliderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SliderRepository extends JpaRepository<SliderEntity, Integer> {
}
