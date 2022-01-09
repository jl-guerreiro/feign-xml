package com.example.feixml.feixml.domain;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JacksonXmlRootElement(localName = "notes")
public class Notes {
    
    @JacksonXmlProperty(isAttribute = true)
    private String unread;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Note> note;

}
