package com.sxu.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order implements Serializable {

    private String orderId;

    private BigDecimal totalPrice;

    private Date createTime;

    private Date updateTime;
}
