package com.zeus.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @author: YZ.YANG
 * @date: 2024-03-10 0:14
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/getOrderInfo")
    public String getHandler() {
        return "OrderInfo: " + port;
    }
}
