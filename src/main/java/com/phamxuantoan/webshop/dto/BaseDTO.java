package com.phamxuantoan.webshop.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public abstract class BaseDTO<T> {
    private Integer id;
    private Integer created;
    private List<T> listResult = new ArrayList<>();
}
