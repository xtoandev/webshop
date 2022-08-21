package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class SliderDTO extends BaseDTO<SliderDTO> {
    private String sliderName;
    private String imageLink;
    private Integer sortOrder;

}
