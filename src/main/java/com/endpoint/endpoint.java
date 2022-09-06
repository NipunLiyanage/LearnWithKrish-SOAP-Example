package com.endpoint;

import com.nipun.spring.soap_web_service.api.Request;
import com.nipun.spring.soap_web_service.api.Response;
import com.service.dateCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class endpoint {

        private static final String NAMESPACE = "http://nipun.com/spring/soap-web-service/api";

        @Autowired
        private dateCheckService service;

        @PayloadRoot(namespace = NAMESPACE , localPart="request")
        @ResponsePayload
        public Response getDateofYear(@RequestPayload Request request){

            return service.checkDate(request);

    }


}
