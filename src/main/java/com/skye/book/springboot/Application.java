package com.skye.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//스프링부트 자동 설정, 스프링 Bean 읽기&생성 자동 설정
//@springBootApplication의 위치부터 설정을 읽어 나감 => !!!!!프로젝트 최상단에 위치!!!!!!
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
