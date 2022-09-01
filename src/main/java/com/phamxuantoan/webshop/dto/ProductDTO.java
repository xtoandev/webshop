package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO extends BaseDTO<ProductDTO> {

    private String productName;
    private CatalogDTO catalog;
    private String content;
    private double price;
    private Integer discount;
    private String imageLink;
    private String imageList;
    private Integer viewCount;
    private Integer buyedCount;
    private Integer rateTotal;
    private Integer rateCount;
}
