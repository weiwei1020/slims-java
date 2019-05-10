package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

@Component
public class UpdateStock {
    private Integer id;
    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "UpdateStock{" +
                "id=" + id +
                ", stock=" + stock +
                '}';
    }
}
