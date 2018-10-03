package com.oa.server.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/10/3
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()//                   当前包路径
        .apis(RequestHandlerSelectors.basePackage("com.reset.controller"))                    .paths(PathSelectors.any()).build();     }

        private ApiInfo apiInfo () {
            return new ApiInfoBuilder()                //页面标题                //         .title("springBoot测试使用Swagger2构建RESTful API")
                    .contact(new Contact("chen", "http://www.baidu.com", ""))                         // 创建人
                    .version("1.0")  // 版本号
                    .description("API 描述") // 描述
                    .build();
        }
    }
