package com.sendtomoon.rmq;

import org.junit.Test;

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
		
	}

}
