package com.fescar.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:
 * @Description  商品信息
 * @Date Created in 2019/1/13 16:25
 */
@Data
public class CommodityDTO implements Serializable {

    private static final long serialVersionUID = -5297366594297425633L;
    private Integer id;

    private String commodityCode;

    @Override
    public String toString() {
        return "CommodityDTO{" +
                "id=" + id +
                ", commodityCode='" + commodityCode + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    private String name;

    private Integer count;
}
