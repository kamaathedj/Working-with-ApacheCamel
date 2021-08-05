package com.kamaathedj.WithApacheCamel;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class CamelComponent extends RouteBuilder {
    @Override
    public void configure() throws Exception {
            from("rabbitmq:exchange.fanout?queue=queue.A")
                    .log(LoggingLevel.ERROR, "${body}");
    }
}
