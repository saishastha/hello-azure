package com.amock.helloazure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.ApiInfoBuilder;
/*import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;*/
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(apiInfo())
                .select()
               // .apis(RequestHandlerSelectors.any())
                .paths(regex("/api.*"))
                .build();
    }
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
		.title("Sample Test Rest APIs")
		.description("This page lists all the rest apis for App.")
		.version("1.0-SNAPSHOT")
		.build();
	}
}
