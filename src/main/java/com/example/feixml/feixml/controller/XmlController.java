package com.example.feixml.feixml.controller;

import com.example.feixml.feixml.client.XmlClient;
import com.example.feixml.feixml.domain.Notes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class XmlController {
    
    @Autowired
    XmlClient feign;
    
	private static final Log logger = LogFactory.getLog(XmlController.class);

    @GetMapping(produces = MediaType.TEXT_XML_VALUE)
    public ResponseEntity<String> xmlTest(){
        logger.info("RESPONSE [XML]");
        String fixedResponse = "<notes unread=\"yes\"><note><to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend!</body></note><note><to>Jani</to><from>Tove</from><heading>RE:Reminder</heading><body>Yeah!</body></note></notes>";
        return ResponseEntity.ok(fixedResponse);
    }

    @GetMapping("/json")
    public ResponseEntity<Notes> jsonTest(){
        logger.info("RESPONSE [JSON]");
        return ResponseEntity.ok(feign.getNote());
    }

}
