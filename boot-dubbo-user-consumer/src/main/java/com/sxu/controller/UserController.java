package com.sxu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sxu.entity.Order;
import com.sxu.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private OrderService orderService;

    @GetMapping("/list/{id}")
    public List<Order> findByUserId(@PathVariable Integer id){
        List<Order> list = orderService.findByUserId(1);
        return list;
    }

}
