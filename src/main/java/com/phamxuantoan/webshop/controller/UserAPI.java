package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@CrossOrigin
@RestController
public class UserAPI {
    @Autowired
    private IUserService userService;

    @GetMapping("/api-user")
    public List<UserDTO> listNew() {
        List<UserDTO> datas =  userService.findAll();
        return datas;
    }
    @GetMapping("/api-user/{id}")
    public UserDTO getAdminById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping("/api-user")
    public UserDTO save(@RequestBody UserEntity user) {
        return userService.saveOrUpdate(user);
    }

    @PutMapping("/api-user/{id}")
    public UserDTO update(@RequestBody UserEntity user, @PathVariable Integer id) {
        user.setId(id);
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/api-user")
    public void delete(@RequestBody Integer[] ids) {
        userService.delete(ids);
    }
}
