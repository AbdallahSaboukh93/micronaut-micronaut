package com.udamy.tasks;

import com.udamy.service.UserService;
import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Singleton
@Slf4j
public class AnalyticsTasks {

    private UserService userService;

    public AnalyticsTasks(UserService userService) {
        this.userService = userService;
    }

    @Scheduled(fixedDelay = "5s")
    void excute() {
        log.info("users count =  " + userService.getUsersCount());
    }
}
