package com.soshaw.wsdlfirstserversoapjava11.config;

import com.soshaw.wsdlfirstserversoapjava11.CustomerOrderWsImpl;


import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


@Configuration
public class WebServiceConfig {
    @Autowired
    Bus  bus;

    @Bean
    public Endpoint endpoint(){
        Endpoint endpoint= new EndpointImpl(bus,new CustomerOrderWsImpl());
        endpoint.publish("/customerordersservice");
        return endpoint;
    }
}
