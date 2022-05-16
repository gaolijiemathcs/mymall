package com.gao.mymall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1、开启服务注册发现
 *  （1）nacos注册中心地址
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MymallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallGatewayApplication.class, args);
    }

}