package com.abchina.dsf.maina;

import com.abchina.dsf.jara.MapperA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/1.
 */
@Component("maina-ServiceA")
public class ServiceA {
    @Autowired
    MapperA mapperA;

    @Value("${jara.msg}")
    String msg;


    public ServiceA() {
        System.out.println("maina.ServiceA constructor");
    }

    public void hello() {
        System.out.println("maina: msg: " + msg);
        System.out.println("maina.ServiceA hello!");
        mapperA.hello();
    }
}
