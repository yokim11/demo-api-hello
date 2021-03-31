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
                .apis(RequestHandlerSelectors.basePackage("com.demo.msa.restapi.controller.v1"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(commonInfo());
    }

    @Bean
    public Docket Api2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("/api/v2/")
                .useDefaultResponseMessages(false)
                .select()
                //.apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.demo.msa.restapi.controller.v2"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(commonInfoV2());
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

    private ApiInfo commonInfoV2() {
        return new ApiInfoBuilder()
                .title("Restful API v2")
                //.description("")
                .license("lifeisgift v2")
                .licenseUrl("https://lifeisgift.tistory.com/v2")
                .version("2.0")
                .build();
    }
}