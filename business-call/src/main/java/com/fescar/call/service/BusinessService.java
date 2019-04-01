package com.fescar.call.service;


import com.fescar.model.BusinessDTO;
import com.fescar.response.ObjectResponse;

/**
 * @Author:
 * @Description
 * @Date Created in 2019/1/14 17:17
 */
public interface BusinessService {

    ObjectResponse handleBusiness(BusinessDTO businessDTO);
}
