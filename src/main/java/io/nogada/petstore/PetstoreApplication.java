package io.nogada.petstore;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.nogada.petstore.city.model.City;
import io.nogada.petstore.city.service.CityService;

@EnableCaching
@SpringBootApplication
@MapperScan(basePackages = "io.nogada.petstore")
public class PetstoreApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(PetstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PetstoreApplication.class, args);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean loggingFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();

		registrationBean.setFilter(new MdcLoggingFilter());

		return registrationBean;
	}

	@Bean
	public RestTemplate getRestTemplate() {
		System.out.println();
		return new RestTemplate();
	}

	@Autowired
	CityService cityService;

	@Override
	public void run(String... args) throws Exception {
		// List<City> cities = cityService.getAllCity();
		// logger.info("Lenght {}",cities.size());
	}
}
