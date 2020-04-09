package com.example.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfigurations {
	
	@Bean
	public Docket accountapi() {
	
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.example.demo.AccountController")).paths(PathSelectors.any()).build().apiInfo(metaData());
	}
	
	private ApiInfo metaData()
	{
		ApiInfo apiMeta = new ApiInfo("AccountInfoApi", "Performs Account Operations",
				"1", "No terms service", new Contact("Aniket", "github/gokuno1", "aniketb2926@gmail.com"), "No license", "github/gokuno1");
		return apiMeta;
	}
}
