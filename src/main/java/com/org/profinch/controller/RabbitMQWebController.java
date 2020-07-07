package com.org.profinch.controller;

import com.org.profinch.model.Employee;
import com.org.profinch.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * created by yogi
 * */

@RestController
@RequestMapping(value = "/profinch-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@PostMapping(value = "/producer")
	public String producer(@RequestBody Employee employee) {

		rabbitMQSender.send(employee);

		return "Message sent to the RabbitMQ Successfully";
	}

}

