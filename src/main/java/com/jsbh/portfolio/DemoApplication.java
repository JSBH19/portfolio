package com.jsbh.portfolio;

import com.jsbh.portfolio.domain.TestTable;
import com.jsbh.portfolio.repository.TestRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
@EnableAutoConfiguration
@PropertySource({"classpath:application.properties"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner initData(TestRepository repository) {
        return (args) -> {
			repository.save(new TestTable("aaa"));
			repository.save(new TestTable("bbb"));
			repository.save(new TestTable("ccc"));
        };
    }
}
