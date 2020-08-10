package com.sendtomoon.rmq;

import com.rabbitmq.client.ConnectionFactory;

/**
 * 单例模式 饿汉模式，类被加载时即进入虚拟机 优点：快速加载 缺点：易造成内存浪费 不能防止被反射
 */
public class ConnectionUtil {
	public static ConnectionFactory getConnection() {
		return connection;
	}

	private static ConnectionUtil instance = new ConnectionUtil();
	private static final ConnectionFactory connection = new ConnectionFactory();
	static {
		connection.setVirtualHost("192.168.0.2");
		connection.setPort(5672);
		connection.setUsername("sdm");
		connection.setPassword("sdm");
	}

	private ConnectionUtil() {
	}

	public static ConnectionUtil getInstance() {
		return instance;
	}

}
