package com.liyiruo.gmall.service;

import com.liyiruo.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author liyiruo
 * @Description 用户服务
 * @Date 2021/2/13 下午10:43
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);

}
