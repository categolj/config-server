package am.ik.blog;

import org.apache.catalina.filters.RequestDumperFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	@Bean
	RequestDumperFilter requestDumperFilter() {
		return new RequestDumperFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
