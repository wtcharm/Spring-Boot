package cn.mldn.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
 
@ImportResource(locations= {"classpath:spring/spring-*.xml"}) 
@SpringBootApplication
public class StartSpringBootMain extends SpringBootServletInitializer { // 必须继承此类
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(StartSpringBootMain.class); 
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartSpringBootMain.class, args); 
	}
}
