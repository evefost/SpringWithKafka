package com.kafka.demo.service.impl;

import com.kafka.demo.service.Msg;
import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.demo.service.KafkaProducerService;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService{
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducerServiceImpl.class);
	@Autowired
	private KafkaTemplate<Integer, Object> kafkaTemplate;

	
	public void sendDefaultInfo(String str) {
		logger.info("----message--send----");
		kafkaTemplate.sendDefault(str);
	}

	public void sendMesage(String topic, String str) {
		kafkaTemplate.send(topic,str);
	}

	public void sendMesage(String topic, Object message) {
		kafkaTemplate.send(topic,message);
	}

}
