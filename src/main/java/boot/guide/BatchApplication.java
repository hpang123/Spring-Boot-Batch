package boot.guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * https://docs.spring.io/spring-batch/trunk/reference/html/
 * 
 * Spring Boot runs schema-{platform}.sql automatically 
 * during startup. -all is the default for all platforms.
 */
@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchApplication.class, args);
	}
}
