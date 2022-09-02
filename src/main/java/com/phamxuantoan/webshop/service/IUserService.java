package com.phamxuantoan.webshop.service;


import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();
    UserDTO getUserById(Long id);
    UserDTO saveOrUpdate(UserEntity user);
    void delete(Long[] ids);

    UserDetails loadUserById(Long userId);
}
