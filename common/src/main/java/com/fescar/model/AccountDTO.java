package com.fescar.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author:
 * @Description  账户信息
 * @Date Created in 2019/1/13 16:39
 */
@Data
public class AccountDTO implements Serializable {

    private static final long serialVersionUID = 2405383795032418415L;
    private Integer id;

    private String userId;

    private BigDecimal amount;
}
