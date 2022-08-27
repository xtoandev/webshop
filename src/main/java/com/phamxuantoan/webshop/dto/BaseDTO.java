package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDTO<T> {
    public Integer id;
    private Integer created;
    private List<T> listResult = new ArrayList<>();
}
