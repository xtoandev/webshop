package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO extends BaseDTO<CommentDTO>{
    private ProductDTO productComment;
    private String content;
    private String imageLink;
    private Integer rate;
    private UserDTO userComment;

}
