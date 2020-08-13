package com.wise.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 *
 * 浏览器访问
 * http://127.0.0.1:8091/hello
 *
 * @author lingyuwang
 * @date 2020-08-13 17:06
 * @since 1.1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
