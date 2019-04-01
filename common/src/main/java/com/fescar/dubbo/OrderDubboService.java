package com.fescar.dubbo;


import com.fescar.model.OrderDTO;
import com.fescar.response.ObjectResponse;

/**
 * @Author:
 * @Description  订单服务接口
 * @Date Created in 2019/1/13 16:28
 */
public interface OrderDubboService {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
