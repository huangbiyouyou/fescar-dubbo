package com.fescar.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author:
 * @Description
 * @Date Created in 2019/1/14 17:26
 */
@Data
public class BusinessDTO implements Serializable {

    private static final long serialVersionUID = -2684287942115599803L;
    private String userId;

    private String commodityCode;

    private String name;

    private Integer count;

    private BigDecimal amount;
}
