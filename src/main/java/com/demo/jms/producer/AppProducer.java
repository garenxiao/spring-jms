package com.demo.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * TODO(这里用一句话描述这个类的作用)
 * <p>
 * TODO(这里描述这个类补充说明 – 可选)
 *
 * @author 天天
 * @Date 2018-4-2416:47
 */
public class AppProducer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = (ProducerService)applicationContext.getBean("producerService");
        for (int i = 0; i <100 ; i++) {
            producerService.sendMessage("这是由spring管理的jms生产的消息"+i);
        }
        applicationContext.close();
    }
}
