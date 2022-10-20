package com.example.demo.ourconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@Async
public class Asycconfig {
    @Bean
public Executor taskexecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor=new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setQueueCapacity(100);
        threadPoolTaskExecutor.setMaxPoolSize(2);
        threadPoolTaskExecutor.setCorePoolSize(2);
        threadPoolTaskExecutor.setThreadNamePrefix("poolthread");
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
}
}
