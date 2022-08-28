package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.CommentDTO;
import com.phamxuantoan.webshop.entity.CommentEntity;
import com.phamxuantoan.webshop.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CommentAPI {
    @Autowired
    private ICommentService commentService;

    @GetMapping("/api-comment")
    public List<CommentDTO> listNew() {
        List<CommentDTO> datas = commentService.findAll();
        return datas;
    }

    @GetMapping("/api-comment/user/{id}")
    public List<CommentDTO> getCommentByUserId(@PathVariable Integer id) {
        return commentService.getCommentByUserId(id);
    }
    @GetMapping("/api-comment/product/{id}")
    public List<CommentDTO> getCommentByProductId(@PathVariable Integer id) {
        return commentService.getCommentByProductId(id);
    }
    @PostMapping("/api-comment")
    public CommentDTO save(@RequestBody CommentEntity  comment) {
        return commentService.saveOrUpdate(comment);
    }

    @PutMapping("/api-comment/{id}")
    public CommentDTO update(@RequestBody CommentEntity comment, @PathVariable Integer id) {
        comment.setId(id);
        return commentService.saveOrUpdate(comment);
    }

    @DeleteMapping("/api-comment")
    public void delete(@RequestBody Integer[] ids) {
        commentService.delete(ids);
    }
}
