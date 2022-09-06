package com.service;

import com.factory.Calculation;
import com.nipun.spring.soap_web_service.api.Request;
import com.nipun.spring.soap_web_service.api.Response;
import org.springframework.stereotype.Service;

@Service
public class dateCheckService {

    public Response checkDate(Request request){
        int year = request.getYear();
        int month = request.getMonth();
        int date = request.getDay();

        Calculation c = new Calculation();
        Response response =new Response();

       response.setDate(c.calc(year,month,date));

       return response;


    }
}
