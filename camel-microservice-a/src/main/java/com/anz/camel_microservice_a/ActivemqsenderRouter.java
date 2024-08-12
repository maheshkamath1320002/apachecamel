package com.anz.camel_microservice_a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActivemqsenderRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:Acive_timer")
                .to("activemq:queue1");
    }
}
