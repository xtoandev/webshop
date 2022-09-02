package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogDTO extends BaseDTO<CatalogDTO>{
    @NotEmpty
    private String catalogName;

    private String description;
    private Integer parentID;
    private Integer sortOrder;

}
