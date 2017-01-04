package com.kafka.demo.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kafka.demo.service.KafkaProducerService;

@Controller
@RequestMapping("/kafka")
public class KafkaController {

	private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);
	@Resource
	private KafkaProducerService kafkaService;
	
	@RequestMapping("/test")
	public String test(){
		logger.info("-------KafkaController--------start-----");
		System.err.println("---------KafkaController--------start---------");
		kafkaService.sendDefaultInfo("kafka sendMessage test with spring!");
		return "index";
	}

	@RequestMapping("/test2")
	public String test2(){
		logger.info("-------KafkaController--------start-----");
		System.err.println("---------KafkaController--------start---------");
		kafkaService.sendMesage("test2","测试2");
		return "index";
	}

	@RequestMapping("/test3")
	public String test3(){
		logger.info("-------KafkaController--------start-----");
		System.err.println("---------KafkaController--------start---------");
		kafkaService.sendMesage("test3","测试3");
		return "index";
	}
}
