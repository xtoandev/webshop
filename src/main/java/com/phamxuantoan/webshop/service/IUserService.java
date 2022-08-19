package com.phamxuantoan.webshop.service;


import com.phamxuantoan.webshop.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();
}
