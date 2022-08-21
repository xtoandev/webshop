package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class CatalogDTO extends BaseDTO<CatalogDTO>{
    private String catalogName;
    private String description;
    private Integer parentID;
    private Integer sortOrder;

}
