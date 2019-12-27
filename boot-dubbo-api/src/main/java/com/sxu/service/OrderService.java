package com.sxu.service;

import com.sxu.entity.Order;

import java.util.List;

public interface OrderService {


    List<Order> findByUserId(Integer userId);
}
