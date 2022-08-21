package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "catalog")
public class CatalogEntity  extends BaseEntity {

    @Column(name = "catalog_name")
    private String catalog_name;

    @Column(name = "description")
    private String description;

    @Column(name = "parent_id")
    private String parentID;

    @Column(name = "sort_order")
    private String sortOrder;

}
