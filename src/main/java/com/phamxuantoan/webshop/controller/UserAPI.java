package com.phamxuantoan.webshop.controller;

import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin
@RestController
public class UserAPI extends BaseAPI{
    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public List<UserDTO> listNew() {
        List<UserDTO> datas =  userService.findAll();
        return datas;
    }
    @GetMapping("/user/{id}")
    public UserDTO getAdminById(@PathVariable Long  id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public UserDTO save(@RequestBody @Valid UserDTO user) {
        return userService.saveOrUpdate(user);
    }

    @PutMapping("/user/{id}")
    public UserDTO update(@RequestBody UserDTO user, @PathVariable Long  id) {
        user.setId(id);
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/user")
    public void delete(@RequestBody Long[] ids) {
        userService.delete(ids);
    }
}
