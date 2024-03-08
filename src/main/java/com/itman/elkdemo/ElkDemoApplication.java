package com.itman.elkdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: ItMan1010
 * @ClassName: public class ElkDemoApplication {
 * @Description: spring启动类
 */

@SpringBootApplication
public class ElkDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);
        System.out.print("********启动ElkDemoApplication成功****************!\n");
    }
}
