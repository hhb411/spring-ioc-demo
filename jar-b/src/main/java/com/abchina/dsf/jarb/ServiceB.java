package com.abchina.dsf.jarb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/1.
 */
@Component("jarb-ServiceB")
//@PropertySource("classpath:jarb.properties")
public class ServiceB {
    @Autowired
    MapperB mapperB;

    @Value("${jara.msg}")
    String msg;

    public void setMapperB(MapperB mapperB) {
        this.mapperB = mapperB;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ServiceB() {
        System.out.println("jarb.ServiceB constructor");
    }

    public void hello() {
        System.out.println("jarb: msg: " + msg);
        System.out.println("jarb.ServiceB hello!");
        mapperB.hello();
    }
}
