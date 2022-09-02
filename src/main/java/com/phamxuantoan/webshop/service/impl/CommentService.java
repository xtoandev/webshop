package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.CommentDTO;
import com.phamxuantoan.webshop.entity.CommentEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.CommentRepository;
import com.phamxuantoan.webshop.service.ICommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@Service
public class CommentService implements ICommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private final ModelMapper mapper;

    public CommentService(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<CommentDTO> findAll() {
        List<CommentDTO> data = new ArrayList<>();
        List<CommentEntity> entity = commentRepository.findAll();

        for(CommentEntity item:entity) {

            data.add(mapper.map(item, CommentDTO.class));
        }

        return data;
    }

    @Override
    public List<CommentDTO> getCommentByUserId(Long id) {
        List<CommentDTO> data = new ArrayList<>();
        List<CommentEntity> entity = commentRepository.findCommentByUserID(id);
        for(CommentEntity i:entity){

                data.add(mapper.map(i,CommentDTO.class));
        };
        return data;

    }

    @Override
    public List<CommentDTO> getCommentByProductId(Long id) {
        List<CommentDTO> data = new ArrayList<>();
        List<CommentEntity> entity = commentRepository.findCommentByProductID(id);
        for(CommentEntity i:entity){

            data.add(mapper.map(i,CommentDTO.class));
        };
        return data;
    }

    @Override
    public CommentDTO saveOrUpdate(CommentEntity comment) {
        CommentDTO data = new CommentDTO();
        CommentEntity entity = commentRepository.save(comment);
        data = mapper.map(entity, CommentDTO.class);
        return data;
    }

    @Override
    public void delete(Long[] ids) {
        for(Long item:ids) {
            commentRepository.deleteById(item);
        }
    }

}
