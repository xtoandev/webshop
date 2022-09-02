package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.PermissionDTO;
import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.PermissionEntity;
import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.jwt.CustomUserDetails;
import com.phamxuantoan.webshop.repository.UserRepository;
import com.phamxuantoan.webshop.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class UserService implements IUserService, UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private final ModelMapper mapper;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService() {
        this.mapper = new ModelMapper();
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        return new CustomUserDetails(user);
    }
    @Transactional
    public UserDetails loadUserById(Long userid) {
        UserEntity user = userRepository.findById(userid).orElseThrow(
                () -> new UsernameNotFoundException("User not found with id : " + userid)
        );

        return new CustomUserDetails(user);
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
    public UserDTO saveOrUpdate(UserEntity user) {
        UserDTO data = new UserDTO();


        UserEntity entity = userRepository.save(user);
        data = mapper.map(entity, UserDTO.class);
        return data;
    }


    @Override
    public void delete(Long[] ids) {
        for(Long item:ids) {

            userRepository.deleteById(item);
        }
    }


}
