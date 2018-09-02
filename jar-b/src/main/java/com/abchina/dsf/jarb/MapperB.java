package com.abchina.dsf.jarb;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/1.
 */
@Component
public class MapperB {
    public MapperB() {
        System.out.println("jarb.MapperB constructor");
    }

    public void hello() {
        System.out.println("jarb.MapperB hello!");
    }
}
