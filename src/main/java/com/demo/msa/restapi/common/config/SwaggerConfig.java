package com.demo.msa.restapi.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket Api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("/api/v1/")
                .useDefaultResponseMessages(false)
                .select()
                //.apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.demo.msa.restapi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(commonInfo());
    }

    private ApiInfo commonInfo() {
        return new ApiInfoBuilder()
                .title("Restful API v1")
                //.description("")
                .license("lifeisgift")
                .licenseUrl("https://lifeisgift.tistory.com/v1")
                .version("1.0")
                .build();
    }


}