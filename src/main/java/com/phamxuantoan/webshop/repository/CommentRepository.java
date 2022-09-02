package com.phamxuantoan.webshop.repository;


import com.phamxuantoan.webshop.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    @Query(value ="select * from comment  where comment.user_id = ?1", nativeQuery = true)
    public List<CommentEntity> findCommentByUserID(Long uid);

    @Query(value ="select * from comment  where comment.product_id = ?1", nativeQuery = true)
    public List<CommentEntity> findCommentByProductID(Long uid);
}
