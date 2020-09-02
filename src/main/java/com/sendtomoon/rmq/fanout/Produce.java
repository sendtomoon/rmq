package com.sendtomoon.rmq.fanout;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.sendtomoon.rmq.ConnectionUtil;

import java.util.Date;

public class Produce {

    public void p() {
        try {
            Connection conn = ConnectionUtil.getConnection().newConnection();
            Channel channel = conn.createChannel();
            channel.queueDeclare("FANOUT_QUEUE_CONSUMER_1",false,false,true,null);
            channel.exchangeDeclare("EX_FANOUT", BuiltinExchangeType.FANOUT, false, true, null);
            while (true) {
                Thread.sleep(2000);
                channel.basicPublish("EX_FANOUT", "", null, String.valueOf(new Date().getTime()).getBytes());
                System.out.println("produce");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
