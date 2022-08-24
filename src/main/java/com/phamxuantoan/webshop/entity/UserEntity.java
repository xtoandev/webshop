package com.phamxuantoan.webshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends  BaseEntity{
    @Column(name = "user_name")
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "avatar")
    private String avatar;

    @OneToMany(mappedBy = "userComment")
    private List<CommentEntity> commnents = new ArrayList<>();

    @OneToMany(mappedBy = "userOrder")
    private List<OrderEntity> transactions = new ArrayList<>();
}
