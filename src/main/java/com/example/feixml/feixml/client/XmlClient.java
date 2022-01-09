package com.example.feixml.feixml.client;

import com.example.feixml.feixml.domain.Notes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "myXmlTest", url = "http://localhost:8080/note", configuration = XmlClientConfiguration.class)
public interface XmlClient {
    
    @GetMapping(value = "/", produces = MediaType.TEXT_XML_VALUE)
    public Notes getNote();

}
