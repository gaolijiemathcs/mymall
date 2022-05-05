package com.gao.mymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


/**
 * (1)想要远程调用别的服务
 *  1)引入open-feign
 *  2)编写接口告诉SpringCloud这个接口需要调用远程服务  @FeignClient("mymall-coupon")
 *      1、申明接口调用接口的每一个方法是调用哪个远程服务的哪个请求
 *  3)开启客户端远程调用功能@EnableFeignClients
 */
@EnableFeignClients(basePackages = "com.gao.mymall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MymallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallMemberApplication.class, args);
    }

}
