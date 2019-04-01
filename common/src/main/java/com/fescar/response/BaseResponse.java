package com.fescar.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 基本返回
 *
 * @author:
 * @date: 2018-07-03 16:46
 */
@Data
public class BaseResponse implements Serializable {

    private int status = 200;

    private String message;

}
