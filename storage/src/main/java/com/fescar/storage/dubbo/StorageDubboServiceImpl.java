package com.fescar.storage.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fescar.core.context.RootContext;
import com.fescar.dubbo.StorageDubboService;
import com.fescar.model.CommodityDTO;
import com.fescar.response.ObjectResponse;
import com.fescar.storage.service.ITStorageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:
 * @Description
 * @Date Created in 2019/1/23 16:13
 */
@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
        timeout = 1200000)
public class StorageDubboServiceImpl implements StorageDubboService {

    @Autowired
    private ITStorageService storageService;

    @Override
    public ObjectResponse decreaseStorage(CommodityDTO commodityDTO) {
        System.out.println("全局事务id ：" + RootContext.getXID());
        System.out.println("commodityDTO：" +commodityDTO.toString());
        return storageService.decreaseStorage(commodityDTO);
    }
}
