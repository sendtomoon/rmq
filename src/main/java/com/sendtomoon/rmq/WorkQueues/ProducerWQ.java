package com.sendtomoon.rmq.WorkQueues;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.sendtomoon.rmq.ConnectionUtil;

public class ProducerWQ {
	public void sendMessage() {
		try {
			Connection conn = ConnectionUtil.getConnection().newConnection();
			Channel channel = conn.createChannel();
			channel.queueDeclare("WORK_QUEUE", false, false, false, null);
			for (int i = 0; i <= 20; i++) {
//				Thread.sleep(1000);
				channel.basicPublish("", "WORK_QUEUE", null, String.valueOf(i).getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
