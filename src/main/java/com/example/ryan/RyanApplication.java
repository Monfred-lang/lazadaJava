package com.example.ryan;

import java.util.Arrays;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class RyanApplication {

	public static void main(String[] args) {
		SpringApplication.run(RyanApplication.class, args);
	}
	
//	@Bean
//	CorsConfigurationSource corsConfigurationSource() {
//	    CorsConfiguration configuration = new CorsConfiguration();
//	    configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//	    configuration.setAllowedMethods(Arrays.asList("GET","POST"));
//	    configuration.addAllowedHeader("content-type");
//	    configuration.addAllowedHeader("Access-Control-Allow-Origin");
//	    configuration.addAllowedHeader("Authorization");
//	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    source.registerCorsConfiguration("/**", configuration);
//	    return (CorsConfigurationSource) source;
//	}


}
