package com.phamxuantoan.webshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "permission")
public class PermissionEntity extends BaseEntity{
    @Column(name = "permission_name")
    private String permissionName;


    @OneToMany(
            mappedBy = "permissions",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<AccountEntity> admins = new ArrayList<>();

}
