package com.sendtomoon.rmq.fanout;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.sendtomoon.rmq.ConnectionUtil;

import java.io.IOException;

public class Consumer1 {
    public void c() {
        Connection conn;
        try {
            conn = ConnectionUtil.getConnection().newConnection();
            Channel channel = conn.createChannel();
            channel.queueBind("FANOUT_QUEUE_CONSUMER_1","EX_FANOUT","",null);
            channel.basicConsume("FANOUT_QUEUE_CONSUMER_1", true, new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                           byte[] body) throws IOException {
                    System.err.println("Consumer1:" + new String(body));
                    super.handleDelivery(consumerTag, envelope, properties, body);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
