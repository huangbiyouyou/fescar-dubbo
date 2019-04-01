package com.fescar.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author:
 * @Description  订单信息
 * @Date Created in 2019/1/13 16:33
 */
@Data
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = -5214155705666050749L;
    private String orderNo;

    private String userId;

    private String commodityCode;

    private Integer orderCount;

    private BigDecimal orderAmount;
}
