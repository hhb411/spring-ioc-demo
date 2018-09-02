package com.abchina.dsf.jarc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class JarcApp
{
//    @Autowired
//    DemoA demoA;
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-jarc.xml");
        ServiceC serviceC = ctx.getBean(ServiceC.class);
        serviceC.hello();
    }
}
