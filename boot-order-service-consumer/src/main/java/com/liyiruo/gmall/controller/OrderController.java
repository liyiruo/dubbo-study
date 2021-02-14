package com.liyiruo.gmall.controller;

import com.liyiruo.gmall.bean.UserAddress;
import com.liyiruo.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/14 下午11:06
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        List<UserAddress> addresses = orderService.initOrder(userId);
        return addresses;

    }
}
