package com.bili.supermarket.service;

import java.util.List;
import com.bili.supermarket.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);
}
