package com.canko.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by nie on 17/5/22.
 */
@ComponentScan
@SpringBootApplication
public class Application {

    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        // 程序启动入口
        SpringApplication.run(Application.class,args);
        logger.info("========Application start !=========================");
    }

}
