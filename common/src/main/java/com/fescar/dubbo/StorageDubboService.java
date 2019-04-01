package com.fescar.dubbo;


import com.fescar.model.CommodityDTO;
import com.fescar.response.ObjectResponse;

/**
 * @Author:
 * @Description  仓库服务
 * @Date Created in 2019/1/13 16:22
 */
public interface StorageDubboService {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
