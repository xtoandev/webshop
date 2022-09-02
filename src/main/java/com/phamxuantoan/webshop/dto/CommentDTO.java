package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO extends BaseDTO<CommentDTO>{
    private ProductDTO productComment;
    @NotBlank(message = "Content is mandatory")
    private String content;
    private String imageLink;
    private Integer rate;
    private UserDTO userComment;

}
