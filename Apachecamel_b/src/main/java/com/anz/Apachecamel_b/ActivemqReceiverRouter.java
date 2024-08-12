package com.anz.Apachecamel_b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActivemqReceiverRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:queue1")
                .to("log:Message received");

    }
}
