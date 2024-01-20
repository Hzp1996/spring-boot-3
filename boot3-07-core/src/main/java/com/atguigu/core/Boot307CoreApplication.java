package com.atguigu.core;

import com.atguigu.core.robot.properties.RobotProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class Boot307CoreApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(Boot307CoreApplication.class);
//        application.addInitializers();
        application.run(args);
        log.info("项目已启动！");
    }

    @Bean
    public ApplicationRunner applicationRunner (){
        return runner->{
            System.out.println("----ApplicationRunner运行了");
        };
    }

    @Bean
    public CommandLineRunner CommandLineRunner (){
        return runner->{
            System.out.println("----CommandLineRunner运行了");
        };
    }

}
