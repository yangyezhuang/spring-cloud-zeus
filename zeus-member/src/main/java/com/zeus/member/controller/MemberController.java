package com.zeus.member.controller;

import com.zeus.member.feign.FeignController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MemberController
 *
 * @author: YZ.YANG
 * @date: 2024-03-10 0:11
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private FeignController feignController;

    @GetMapping("/getMemberInfo")
    public String getHandler() {
        String handler = feignController.getHandler();
        return "MemberInfo: " + handler;
    }
}
