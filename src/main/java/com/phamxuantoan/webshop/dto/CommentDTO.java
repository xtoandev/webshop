package com.phamxuantoan.webshop.dto;

import lombok.Data;

@Data
public class CommentDTO extends BaseDTO<CommentDTO>{
    private Integer productID;
    private String content;
    private String imageLink;
    private Integer rate;
    private Integer userID;

}
