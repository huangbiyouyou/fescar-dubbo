package com.fescar.order.service;

import com.baomidou.mybatisplus.service.IService;
import com.fescar.model.OrderDTO;
import com.fescar.order.model.TOrder;
import com.fescar.response.ObjectResponse;

/**
 * <p>
 *  创建订单
 * </p>
 *
 * @author
 * @since 2019-01-13
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
