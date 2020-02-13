package com.bili.supermarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bili.supermarket.bean.UserAddress;
import com.bili.supermarket.service.OrderService;
import com.bili.supermarket.service.UserService;

/**
 * @author lfy
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	UserService userService;

	@Override
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("用户id："+userId);
		//1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}
	
	

}
