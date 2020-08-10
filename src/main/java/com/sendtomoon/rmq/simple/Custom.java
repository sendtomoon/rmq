package com.sendtomoon.rmq.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DeliverCallback;
import com.sendtomoon.rmq.ConnectionUtil;

public class Custom {

	public void recive() {
		Connection conn;
		try {
			conn = ConnectionUtil.getConnection().newConnection();
			Channel channel = conn.createChannel();
			DeliverCallback deliverCallback = (consumerTag, delivery) -> {
				String message = new String(delivery.getBody(), "UTF-8");
				System.out.println(" [x] Received '" + message + "'");
			};
			channel.basicConsume("SIMPLE_QUEUE", true, deliverCallback, consumerTag -> {
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
