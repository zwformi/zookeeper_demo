package com.zw.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/28.
 */
public class DemoServerImpl implements DemoServer {
    public String sayHello(String str) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        str = "Hello:" + str + ",2:" + format.format(new Date());
        System.out.println("server:" + str);
        return str;
    }
}
