package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.repository.UserRepository;
import com.phamxuantoan.webshop.service.IUserService;
import org.apache.catalina.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.awt.print.Book;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private final ModelMapper mapper;

    public UserService() {
        this.mapper = new ModelMapper();
    }

    @Override
    public List<UserDTO> findAll() {
        List<UserDTO> data = new ArrayList<>();
        try {
            List<UserEntity> entity = userRepository.findAll();
            for(UserEntity item:entity) {
                data.add(mapper.map(item, UserDTO.class));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return data;
    }

    @Override
    public UserDTO getUserById(Integer id) {
        UserEntity entity = userRepository.getById(id);
        UserDTO data = mapper.map(entity, UserDTO.class);
        return data;
    }

    @Override
    public UserDTO save(UserEntity user) {
        UserDTO data = new UserDTO();
        UserEntity entity = userRepository.save(user);
        data = mapper.map(entity, UserDTO.class);

        return data;
    }
}
