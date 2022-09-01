package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.PermissionRepository;
import com.phamxuantoan.webshop.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository accountRepository;
    @Autowired
    private PermissionRepository permissionRepository;
    @Autowired
    private final ModelMapper mapper;

    public CustomUserDetailsService() {
        this.mapper = new ModelMapper();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserEntity acc = accountRepository.findByUserName(s);
        User user = mapper.map(acc, User.class);
        if(acc != null){
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            acc.getPermissions().forEach(role->{((ArrayList<SimpleGrantedAuthority>) authorities).add(new SimpleGrantedAuthority(role.getPermissionName()));});
            return new org.springframework.security.core.userdetails.User(acc.getUserName(),acc.getPassword(),authorities);
        }throw  new NotFoundException("ACCOUNT_NOT_FOUND_IN");

    }
}
