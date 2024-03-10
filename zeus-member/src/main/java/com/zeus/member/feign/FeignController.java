package com.zeus.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FeignController
 *
 * @author: YZ.YANG
 * @date: 2024-03-10 0:16
 */
@FeignClient(value = "service-order")
public interface FeignController {

    @GetMapping("/order/getOrderInfo")
    String getHandler();
}
