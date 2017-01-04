package com.kafka.demo.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

public class KafkaConsumerService implements MessageListener<String, String>{
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
	
	public void onMessage(ConsumerRecord<String, String> arg0) {
		logger.info("---------------Consumer---top-------------"+arg0.topic());
		logger.info("---------------Consumer---Message---------"+arg0.value());

	}

}
