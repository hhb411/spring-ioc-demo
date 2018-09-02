package com.abchina.dsf.jara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/1.
 */
@Component("jara-ServiceA")
//@PropertySource("classpath:jara.properties")
public class ServiceA {
    @Autowired
    MapperA mapperA;

    @Value("${jara.msg}")
    String msg;

    public void setMapperA(MapperA mapperA) {
        this.mapperA = mapperA;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ServiceA() {
        System.out.println("jara.ServiceA constructor");
    }

    public void hello() {
        System.out.println("jara: msg: " + msg);
        System.out.println("jara.ServiceA hello!");
        mapperA.hello();
    }
}
