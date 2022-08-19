package com.phamxuantoan.webshop.dto;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDTO<T> {
    private Integer id;
    private Integer created;
    private List<T> listResult = new ArrayList<>();

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreated() {
        return created;
    }
    public void setCreated(Integer created) {
        this.created = created;
    }

    public List<T> getListResult() {
        return listResult;
    }
    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }
}
