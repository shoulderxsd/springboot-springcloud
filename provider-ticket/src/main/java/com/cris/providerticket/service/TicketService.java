package com.cris.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName TicketService
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("这是8002端口提供的服务");
        return "《复仇者联盟3》";
    }
}
