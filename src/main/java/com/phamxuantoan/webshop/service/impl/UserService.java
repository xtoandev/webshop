package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.CustomUserDetails;
import com.phamxuantoan.webshop.entity.UserEntity;
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
        // Kiểm tra xem user có tồn tại trong database không?
        UserEntity user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);
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

    // JWTAuthenticationFilter sẽ sử dụng hàm này
    @Transactional
    public UserDetails loadUserById(Long id) {
        String uid = id.toString();

        UserEntity user = userRepository.getById(Integer.parseInt(uid));

        return new CustomUserDetails(user);
    }
}
