package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.CommentDTO;
import com.phamxuantoan.webshop.entity.CommentEntity;
import com.phamxuantoan.webshop.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CommentAPI extends BaseAPI{
    @Autowired
    private ICommentService commentService;

    @GetMapping("/comment")
    public List<CommentDTO> listNew() {
        List<CommentDTO> datas = commentService.findAll();
        return datas;
    }

    @GetMapping("/comment/user/{id}")
    public List<CommentDTO> getCommentByUserId(@PathVariable Long id) {
        return commentService.getCommentByUserId(id);
    }
    @GetMapping("/comment/product/{id}")
    public List<CommentDTO> getCommentByProductId(@PathVariable Long id) {
        return commentService.getCommentByProductId(id);
    }
    @PostMapping("/comment")
    public CommentDTO save(@RequestBody CommentEntity  comment) {
        return commentService.saveOrUpdate(comment);
    }

    @PutMapping("/comment/{id}")
    public CommentDTO update(@RequestBody CommentEntity comment, @PathVariable Long id) {
        comment.setId(id);
        return commentService.saveOrUpdate(comment);
    }

    @DeleteMapping("/comment")
    public void delete(@RequestBody Long[] ids) {
        commentService.delete(ids);
    }
}
