package com.fescar.call.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fescar.core.context.RootContext;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.fescar.dubbo.OrderDubboService;
import com.fescar.dubbo.StorageDubboService;
import com.fescar.enums.RspStatusEnum;
import com.fescar.exception.DefaultException;
import com.fescar.model.BusinessDTO;
import com.fescar.model.CommodityDTO;
import com.fescar.model.OrderDTO;
import com.fescar.response.ObjectResponse;
import org.springframework.stereotype.Service;

/**
 * @Author:
 * @Description  Dubbo业务发起方逻辑
 * @Date Created in 2019/1/14 18:36
 */
@Service
public class BusinessServiceImpl implements BusinessService{

    @Reference(version = "1.0.0",timeout = 1200000)
    private StorageDubboService storageDubboService;

    @Reference(version = "1.0.0",timeout = 1200000)
    private OrderDubboService orderDubboService;

    private boolean flag;

    /**
     * 处理业务逻辑
     * @Param:
     * @Return:
     */
    @Override
    @GlobalTransactional(timeoutMills = 1200000, name = "dubbo-gts-fescar-example")
    public ObjectResponse handleBusiness(BusinessDTO businessDTO) {
        System.out.println("开始全局事务，XID = " + RootContext.getXID());
        ObjectResponse<Object> objectResponse = new ObjectResponse<Object>();
        //1、扣减库存
        CommodityDTO commodityDTO = new CommodityDTO();
        commodityDTO.setCommodityCode(businessDTO.getCommodityCode());
        commodityDTO.setCount(businessDTO.getCount());
        ObjectResponse storageResponse = storageDubboService.decreaseStorage(commodityDTO);
        //2、创建订单
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUserId(businessDTO.getUserId());
        orderDTO.setCommodityCode(businessDTO.getCommodityCode());
        orderDTO.setOrderCount(businessDTO.getCount());
        orderDTO.setOrderAmount(businessDTO.getAmount());
        ObjectResponse<OrderDTO> response = orderDubboService.createOrder(orderDTO);

        //打开注释测试事务发生异常后，全局回滚功能
//        if (!flag) {
//            throw new RuntimeException("测试抛异常后，分布式事务回滚！");
//        }

        if (storageResponse.getStatus() != 200 || response.getStatus() != 200) {
            throw new DefaultException(RspStatusEnum.FAIL);
        }

        objectResponse.setStatus(RspStatusEnum.SUCCESS.getCode());
        objectResponse.setMessage(RspStatusEnum.SUCCESS.getMessage());
        objectResponse.setData(response.getData());
        return objectResponse;
    }
}
