package com.phamxuantoan.webshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalog")
public class CatalogEntity  extends BaseEntity {

    @Column(name = "catalog_name")
    private String catalogName;

    @Column(name = "description")
    private String description;

    @Column(name = "parent_id")
    private String parentID;

    @Column(name = "sort_order")
    private String sortOrder;

    @OneToMany(mappedBy = "catalog",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<ProductEntity> products = new ArrayList<>();
}
