package com.example.feixml.feixml.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Note {
    
    private String to;
    private String from;
    private String heading;
    private String body;

}
