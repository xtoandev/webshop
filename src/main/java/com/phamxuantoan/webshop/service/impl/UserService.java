package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.PermissionDTO;
import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.PermissionEntity;
import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.repository.PermissionRepository;
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
    private PermissionRepository permissionRepository;
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
    public UserDTO getUserById(Long id) {
        UserEntity entity = userRepository.getById(id);
        UserDTO data = mapper.map(entity, UserDTO.class);
        return data;
    }

    @Override
    public UserDTO saveOrUpdate(UserDTO user) {
        UserDTO data = new UserDTO();
        UserEntity entity = new UserEntity();
        entity.setFullName(user.getFullName());
        entity.setId(user.getId());
        entity.setUserName(user.getUserName());
        entity.setAddress(user.getAddress());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
        entity.setCreated(user.getCreated());
        List<PermissionEntity>  perlist = new ArrayList<>();
        for(PermissionDTO item:user.getPermissions()){
            PermissionEntity per = new PermissionEntity();
            per = permissionRepository.getById(item.getId());
            perlist.add(per);
        }
        entity.setPermissions(perlist);
        UserEntity newentity = userRepository.save(entity);
        data = mapper.map(newentity, UserDTO.class);
        return data;
    }


    @Override
    public void delete(Long[] ids) {
        for(Long item:ids) {

            userRepository.deleteById(item);
        }
    }
}
