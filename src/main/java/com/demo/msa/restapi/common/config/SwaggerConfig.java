package com.demo.msa.restapi.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30) // open api spec 3.0
                .groupName("/api-docs/v1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.msa.restapi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(commonInfo());
    }

    private ApiInfo commonInfo() {
        return new ApiInfoBuilder()
                .title("Restful API v1")
                .description("OpenAPI 3.0 API 문서가 활성화 된 스프링 부트 애플리케이션")
                .license("Copyrights ")
                .licenseUrl("https://lifeisgift.tistory.com/entry/Spring-boot-Swagger-30")
                .version("1.0")
                .build();
    }


}