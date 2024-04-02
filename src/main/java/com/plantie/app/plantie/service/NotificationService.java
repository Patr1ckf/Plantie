package com.plantie.app.plantie.service;

import org.springframework.http.codec.ServerSentEvent;
import org.springframework.stereotype.Service;


import java.time.Duration;

@Service
public class NotificationService {

//    public Flux<ServerSentEvent<String>> getNotifications() {
//        return Flux.interval(Duration.ofSeconds(10))
//                .map(sequence -> ServerSentEvent.<String>builder()
//                        .id(String.valueOf(sequence))
//                        .event("notification")
//                        .data("Remember to water your plant!")
//                        .build());
//    }
}
