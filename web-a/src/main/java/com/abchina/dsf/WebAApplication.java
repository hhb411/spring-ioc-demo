package com.abchina.dsf;

import com.abchina.dsf.jarc.ServiceC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("com.abchina.dsf.jarc")
@ImportResource("classpath*:applicationContext-jarc.xml")
public class WebAApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(WebAApplication.class, args);
		ServiceC serviceC = ctx.getBean(ServiceC.class);
		serviceC.hello();
	}
}
