package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.*;

@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "created")
    private Integer created;

}
