package com.abchina.dsf.jarc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/1.
 */
@Component("jarc-ServiceA")
@PropertySource("classpath:jarc.properties")
public class ServiceC {
    @Autowired
    MapperC mapperC;

    @Value("${jarc.msg}")
    String msg;

    public void setMapperC(MapperC mapperC) {
        this.mapperC = mapperC;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ServiceC() {
        System.out.println("jarc.ServiceC constructor");
    }

    public void hello() {
        System.out.println("jarc: msg: " + msg);
        System.out.println("jarc.ServiceC hello!");
        mapperC.hello();
    }
}
