package com.abchina.dsf.mainb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//@PropertySource({"classpath*:jara.properties", "classpath:mainb.properties"})
//@PropertySource("classpath*:jara.properties")
//@PropertySource("classpath:mainb.properties")
public class MainbApp
{
//    @Autowired
//    DemoA demoA;
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        com.abchina.dsf.jara.ServiceA jaraServiceA = (com.abchina.dsf.jara.ServiceA)ctx.getBean("jara-ServiceA");
        jaraServiceA.hello();

        com.abchina.dsf.mainb.ServiceA mainbServiceA = (com.abchina.dsf.mainb.ServiceA)ctx.getBean("mainb-ServiceA");
        mainbServiceA.hello();

        com.abchina.dsf.jarb.ServiceB jarbServiceB = (com.abchina.dsf.jarb.ServiceB)ctx.getBean("jarb-ServiceB");
        jarbServiceB.hello();
    }
}
