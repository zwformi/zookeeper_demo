package com.zw.action;

import com.zw.service.DemoServer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/28.
 */
public class ChatAction {
    public void SayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
        context.start();
        DemoServer demoServer = (DemoServer) context.getBean("demoService");
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("client:"+demoServer.sayHello("周文，"+"1:"+format.format(new Date()))+",3:"+format.format(new Date()));
    }
}
