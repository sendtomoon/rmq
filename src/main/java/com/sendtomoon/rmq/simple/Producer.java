package com.sendtomoon.rmq.simple;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.sendtomoon.rmq.ConnectionUtil;

public class Producer {

	public void sendMessage() {
		try {
			Connection conn = ConnectionUtil.getConnection().newConnection();
			Channel channel = conn.createChannel();
			channel.queueDeclare("SIMPLE_QUEUE", false, false, false, null);
			channel.basicPublish("", "SIMPLE_QUEUE", null, UUID.randomUUID().toString().getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
