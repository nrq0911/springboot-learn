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
public class ClientApplication {

    private final static Logger logger = LoggerFactory.getLogger(ClientApplication.class);

    public static void main(String [] args){
        SpringApplication.run(ClientApplication.class, args);
        logger.info("-----ClientApplication start----------");
    }

}
