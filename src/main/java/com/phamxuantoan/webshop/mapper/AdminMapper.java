package com.phamxuantoan.webshop.mapper;

import com.phamxuantoan.webshop.dto.AdminDTO;
import com.phamxuantoan.webshop.entity.AdminEntity;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {
    public AdminEntity toEntity(AdminDTO dto) {
        AdminEntity entity = new AdminEntity();

        entity.setAdminName(dto.getAdminName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setAvatar(dto.getAvatar());
        entity.setLevel(dto.getLevel());
        entity.setCreated(dto.getCreated());
        return entity;
    }
    public AdminDTO toDTO(AdminEntity entity) {
        AdminDTO dto = new AdminDTO();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setAdminName(entity.getAdminName());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setAvatar(entity.getAvatar());
        dto.setLevel(entity.getLevel());
        dto.setCreated(entity.getCreated());
        return dto;
    }
}
