package com.liyiruo.gmall.service.impl;

import com.liyiruo.gmall.bean.UserAddress;
import com.liyiruo.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/13 下午10:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "yi", "1", "11", "111", "yyy");
        UserAddress address2 = new UserAddress(2, "er", "2", "22", "222", "nnn");
        return Arrays.asList(address1, address2);
    }
}
