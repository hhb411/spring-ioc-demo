package com.abchina.dsf.jara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class JaraApp
{
//    @Autowired
//    DemoA demoA;
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-jara.xml");
        ServiceA serviceA = ctx.getBean(ServiceA.class);
        serviceA.hello();
    }
}
