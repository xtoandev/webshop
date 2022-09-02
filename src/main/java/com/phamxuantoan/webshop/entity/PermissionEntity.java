package com.phamxuantoan.webshop.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "permission")
public class PermissionEntity extends BaseEntity{
    @Column(name = "permission_name")
    private String permissionName;




    @ManyToMany(mappedBy = "permissions")
    private List<UserEntity> users;

}
