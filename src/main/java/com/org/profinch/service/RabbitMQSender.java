package com.org.profinch.service;

import com.org.profinch.config.RabbitMQConfig;
import com.org.profinch.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * created by yogi
 * */
@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitMQConfig rabbitMQConfig;


    public void send(Employee employee) {
        amqpTemplate.convertAndSend(rabbitMQConfig.getExchange(), rabbitMQConfig.getRoutingkey(), employee);
        System.out.println("Send msg = " + employee);

    }
}