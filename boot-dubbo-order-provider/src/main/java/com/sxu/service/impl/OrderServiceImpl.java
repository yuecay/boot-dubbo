package com.sxu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sxu.entity.Order;
import com.sxu.service.OrderService;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Order> findByUserId(Integer userId) {
        Order order = new Order();
        order.setOrderId("123123s231213");
        order.setTotalPrice(new BigDecimal(101.2));
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());


        return Collections.singletonList(order);
    }
}
