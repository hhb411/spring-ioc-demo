package com.abchina.dsf.maina;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
//@PropertySource({"classpath*:jara.properties", "classpath:maina.properties"})
//@PropertySource("classpath*:jara.properties")
//@PropertySource("classpath:maina.properties")
public class MainaApp
{
//    @Autowired
//    DemoA demoA;
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        com.abchina.dsf.jara.ServiceA jaraServiceA = (com.abchina.dsf.jara.ServiceA)ctx.getBean("jara-ServiceA");
        jaraServiceA.hello();

        com.abchina.dsf.maina.ServiceA mainaServiceA = (com.abchina.dsf.maina.ServiceA)ctx.getBean("maina-ServiceA");
        mainaServiceA.hello();

        com.abchina.dsf.jarb.ServiceB jarbServiceB = (com.abchina.dsf.jarb.ServiceB)ctx.getBean("jarb-ServiceB");
        jarbServiceB.hello();
    }
}
