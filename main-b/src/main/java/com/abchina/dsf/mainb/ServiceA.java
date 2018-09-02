package com.abchina.dsf.mainb;

import com.abchina.dsf.jara.MapperA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/1.
 */
@Component("mainb-ServiceA")
public class ServiceA {
    @Autowired
    MapperA mapperA;

    @Value("${jara.msg}")
    String msg;


    public ServiceA() {
        System.out.println("mainb.ServiceA constructor");
    }

    public void hello() {
        System.out.println("mainb: msg: " + msg);
        System.out.println("mainb.ServiceA hello!");
        mapperA.hello();
    }
}
