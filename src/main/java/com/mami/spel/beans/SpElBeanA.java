package com.mami.spel.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpElBeanA {

    @Value("#{2+3}")
    private Integer add;

    @Value(" #{ 'Learn' + ' ' + 'Spring' } ")
    private String addstr;

    @Value("#{4 == 4}")
    private boolean equal;

    @Value("#{spElBeanB.prop1}")
    private String otherBeanProperty;








}
