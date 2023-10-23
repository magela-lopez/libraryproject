package com.biblioteca.virtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoogleBooksFeignClientService {

    @Autowired
    GoogleBooksFeignClientAPI googleBooksFeignClientAPI;

    public String getBooksByParam(String param){
        String query = googleBooksFeignClientAPI.getBooks(param);
        return query;
    }
}
