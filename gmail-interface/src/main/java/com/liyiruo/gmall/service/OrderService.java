package com.liyiruo.gmall.service;

import com.liyiruo.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/13 下午11:14
 */
public interface OrderService {
    List<UserAddress> initOrder(String userId);
}
