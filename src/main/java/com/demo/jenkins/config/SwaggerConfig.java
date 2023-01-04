/**
 * 
 */
package com.demo.jenkins.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * @return
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("public-api")
				.apiInfo(applicationMetadata())
				.select()
				.paths(myApiPaths())
				.build();				
	}
	
	/**
	 * @return
	 */
	private ApiInfo applicationMetadata() {
		return new ApiInfo(
				"Jenkins pipeline app.", 
				"Demo application for jenkins pipeline.", 
				"1.0", "Term of services", 
				new Contact("Dheerendra", "https://linkedin.com/in/dheernedrakr", "+919658965896"), 
				"License", 
				"https://linkedin.com/in/dheernedrakr", Arrays.asList()
			);
	}
	
	private Predicate<String> myApiPaths() {
	    return PathSelectors.regex("/api/.*");
	}
}
