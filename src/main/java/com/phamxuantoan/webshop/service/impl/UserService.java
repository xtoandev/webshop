package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.PermissionDTO;
import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.PermissionEntity;
import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.repository.UserRepository;
import com.phamxuantoan.webshop.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
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
                UserDTO user = new UserDTO();
                user.setFullName(item.getFullName());
                user.setId(item.getId());
                user.setUserName(item.getUserName());
                user.setAddress(item.getAddress());
                user.setEmail(item.getEmail());
                user.setPassword(item.getPassword());
                user.setPhone(item.getPhone());
                user.setCreated(item.getCreated());

                List<PermissionEntity> list = item.getPermissions();

                if(list==null){
                    user.setPermissions(null);
                }
                else {
                    List<PermissionDTO> news = new ArrayList<>();
                    for (PermissionEntity i:list){
                        news.add(mapper.map(i,PermissionDTO.class));
                    }
                    user.setPermissions(news);
                }
                data.add(user);
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
    public UserDTO saveOrUpdate(UserEntity user) {
        UserDTO data = new UserDTO();


        UserEntity entity = userRepository.save(user);
        data = mapper.map(entity, UserDTO.class);
        return data;
    }


    @Override
    public void delete(Integer[] ids) {
        for(Integer item:ids) {

            userRepository.deleteById(item);
        }
    }
}
