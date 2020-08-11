package com.sendtomoon.rmq.WorkQueues;

import java.io.IOException;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.sendtomoon.rmq.ConnectionUtil;

public class Consumer1WQ {
	public static void main(String[] args) {
		Connection conn;
		try {
			conn = ConnectionUtil.getConnection().newConnection();
			Channel channel = conn.createChannel();
			channel.basicQos(1);
			channel.basicConsume("WORK_QUEUE", true, new DefaultConsumer(channel) {

				@Override
				public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
						byte[] body) throws IOException {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.err.println("Consumer1:" + new String(body));
					super.handleDelivery(consumerTag, envelope, properties, body);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
