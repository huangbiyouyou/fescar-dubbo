package com.fescar.order.controller;


import com.fescar.model.OrderDTO;
import com.fescar.order.service.ITOrderService;
import com.fescar.response.ObjectResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  订单服务
 * </p>
 *
 * @author
 * @since 2019-01-13
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class TOrderController {

    @Autowired
    private ITOrderService orderService;

    @PostMapping("/create_order")
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO){
        return orderService.createOrder(orderDTO);
    }
}

