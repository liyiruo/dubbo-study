package com.liyiruo.gmall.service.impl;

import com.liyiruo.gmall.bean.UserAddress;
import com.liyiruo.gmall.service.OrderService;
import com.liyiruo.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/13 下午11:15
 */
@Service
public class OrederServiceImpl implements OrderService {
    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("用户ID，" + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (int i = 0; i < addressList.size(); i++) {
            System.out.println("地址："+addressList.get(i).getUserAddress());
        }
    }

}
