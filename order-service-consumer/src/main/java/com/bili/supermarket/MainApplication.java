package com.bili.supermarket;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bili.supermarket.service.OrderService;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.initOrder("1");
		System.out.println("调用完成....");
		System.in.read();
	}

}
