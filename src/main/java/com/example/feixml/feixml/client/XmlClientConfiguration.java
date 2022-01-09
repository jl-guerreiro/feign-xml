package com.example.feixml.feixml.client;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.HttpMessageConverterCustomizer;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

import feign.codec.Decoder;

@Configuration
public class XmlClientConfiguration {
    
    //private final ObjectFactory<HttpMessageConverters> messageConverters;
    private final ObjectProvider<HttpMessageConverterCustomizer> customizers;

    public XmlClientConfiguration(ObjectProvider<HttpMessageConverterCustomizer> customizers){
        //this.messageConverters = messageConverters;
        this.customizers = customizers;
    }

// CUSTOM ENCODER
/*@Bean
public Encoder feignFormEncoder() {
    return new FormEncoder(new SpringEncoder(messageConverters));
}*/

//CUSTOM DECODER
@Bean
public Decoder feignDecoder() {
    MappingJackson2XmlHttpMessageConverter c = new MappingJackson2XmlHttpMessageConverter();
    ObjectFactory<HttpMessageConverters> objectFactory = () ->new HttpMessageConverters(c);
    return new SpringDecoder(objectFactory, this.customizers);
}

}
