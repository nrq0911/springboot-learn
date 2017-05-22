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
public class ServerApplication {

    private final static Logger logger = LoggerFactory.getLogger(ServerApplication.class);

    public static void main(String [] args){
        SpringApplication.run(ServerApplication.class, args);
        logger.info("-----ServerApplication start----------");
    }

}
