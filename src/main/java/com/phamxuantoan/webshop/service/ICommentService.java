package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.CommentDTO;
import com.phamxuantoan.webshop.entity.CommentEntity;

import java.util.List;

public interface ICommentService {
    List<CommentDTO> findAll();
    List<CommentDTO> getCommentByUserId(Long id);
    List<CommentDTO> getCommentByProductId(Long id);
    CommentDTO saveOrUpdate(CommentEntity comment);
    void delete(Long[] ids);
}
