package com.bili.supermarket.service;

import java.util.List;
import com.bili.supermarket.bean.UserAddress;

/**
 * 用户服务
 *
 */
public interface UserService {
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
}
