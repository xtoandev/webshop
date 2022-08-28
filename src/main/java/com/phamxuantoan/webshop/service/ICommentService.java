package com.phamxuantoan.webshop.service;

import com.phamxuantoan.webshop.dto.CommentDTO;
import com.phamxuantoan.webshop.entity.CommentEntity;

import java.util.List;

public interface ICommentService {
    List<CommentDTO> findAll();
    List<CommentDTO> getCommentByUserId(Integer id);
    List<CommentDTO> getCommentByProductId(Integer id);
    CommentDTO saveOrUpdate(CommentEntity comment);
    void delete(Integer[] ids);
}
