package com.example.demo.lims.vo;

import org.springframework.stereotype.Component;

/*
@WeiJie
修改库存
 */
@Component
public class UpdateStock {
    //修改库存id
    private Integer id;

    //修改库存数量
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
