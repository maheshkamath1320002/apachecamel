package com.anz.camel_microservice_a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyRouter extends RouteBuilder {
    @Autowired
    GetTime getTime;
    @Override
    public void configure() throws Exception {
        from("file:files/input")
//                .bean(getTime)
                .to("file:files/output");
    }
}
@Component
class GetTime {
    public String GetCurrentTime() {
        return "Time Now is"+LocalDateTime.now();
    }
}