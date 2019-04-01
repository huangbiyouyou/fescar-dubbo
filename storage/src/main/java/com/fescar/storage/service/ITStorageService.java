package com.fescar.storage.service;

import com.baomidou.mybatisplus.service.IService;
import com.fescar.model.CommodityDTO;
import com.fescar.response.ObjectResponse;
import com.fescar.storage.model.TStorage;

/**
 * 仓库服务
 * @author
 * @since 2019-01-13
 */
public interface ITStorageService extends IService<TStorage> {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
