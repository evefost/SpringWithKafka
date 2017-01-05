package com.kafka.demo.service;

public interface KafkaProducerService {

	/**
	 * 发送消息
	 * @param object
	 */
	 void sendDefaultInfo(String str);

	 void sendMesage(String topic,String str);

	 void sendMesage(String topic,Object message);
}
