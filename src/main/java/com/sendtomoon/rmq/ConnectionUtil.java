package com.sendtomoon.rmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.impl.AMQConnection;

/**单例模式*/
public class ConnectionUtil {
	private static ConnectionUtil instance = new ConnectionUtil();
	private static final ConnectionFactory connection = new ConnectionFactory();
	static {
		
	}

	
	
	

	private ConnectionUtil() {
	}

	public static ConnectionUtil getInstance() {
		return instance;
	}

}
