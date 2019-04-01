package com.fescar.storage.service;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.fescar.enums.RspStatusEnum;
import com.fescar.model.CommodityDTO;
import com.fescar.response.ObjectResponse;
import com.fescar.storage.mapper.TStorageMapper;
import com.fescar.storage.model.TStorage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  库存服务实现类
 * </p>
 *
 * @author
 * @since 2019-01-13
 */
@Service
public class TStorageServiceImpl extends ServiceImpl<TStorageMapper, TStorage> implements ITStorageService {

    @Resource
    TStorageMapper tStorageMapper;

    @Override
    public ObjectResponse decreaseStorage(CommodityDTO commodityDTO) {
        int storage = tStorageMapper.decreaseStorage(commodityDTO.getCommodityCode(), commodityDTO.getCount());
        ObjectResponse<Object> response = new ObjectResponse<Object>();
        if (storage > 0){
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }
}
