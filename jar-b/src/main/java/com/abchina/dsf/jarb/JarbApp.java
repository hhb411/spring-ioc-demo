package com.abchina.dsf.jarb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class JarbApp
{
//    @Autowired
//    DemoA demoA;
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-jarb.xml");
        ServiceB serviceB = ctx.getBean(ServiceB.class);
        serviceB.hello();
    }
}
