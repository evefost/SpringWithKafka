package com.kafka.demo.service;

public interface KafkaProducerService {

	/**
	 * 发送消息
	 * @param object
	 */
	public void sendDefaultInfo(String str);

	public void sendMesage(String topic,String str);
}
