package com.sendtomoon.rmq;

import org.junit.Test;

import com.sendtomoon.rmq.WorkQueues.Consumer1WQ;
import com.sendtomoon.rmq.WorkQueues.ProducerWQ;
import com.sendtomoon.rmq.simple.Custom;
import com.sendtomoon.rmq.simple.Producer;

public class Test1 {
	@Test
	public void test1() {
		Producer p = new Producer();
		p.sendMessage();
		Custom c = new Custom();
		c.recive();
	}

	@Test
	public void test2() {
		ProducerWQ p = new ProducerWQ();
		p.sendMessage();
	}

}
