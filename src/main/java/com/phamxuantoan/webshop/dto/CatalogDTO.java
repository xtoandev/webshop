package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogDTO extends BaseDTO<CatalogDTO>{
    private String catalogName;
    private String description;
    private Integer parentID;
    private Integer sortOrder;

}
