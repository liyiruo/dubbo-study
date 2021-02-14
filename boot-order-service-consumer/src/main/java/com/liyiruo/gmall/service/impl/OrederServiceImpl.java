package com.liyiruo.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liyiruo.gmall.bean.UserAddress;
import com.liyiruo.gmall.service.OrderService;
import com.liyiruo.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/13 下午11:15
 */
@Service
public class OrederServiceImpl implements OrderService {
    @Reference
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID，" + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }

}
