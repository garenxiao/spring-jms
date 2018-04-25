package com.demo.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO(这里用一句话描述这个类的作用)
 * <p>
 * TODO(这里描述这个类补充说明 – 可选)
 *
 * @author 天天
 * @Date 2018-4-2418:09
 */
public class AppConsumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
    }
}
