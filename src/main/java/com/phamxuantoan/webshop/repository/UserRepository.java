package com.phamxuantoan.webshop.repository;

import com.phamxuantoan.webshop.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserName(String username);
    Optional<UserEntity> findById(Long userid);
}
