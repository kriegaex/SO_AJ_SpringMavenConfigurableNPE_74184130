package com.example.demo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@ComponentScan
@EnableSpringConfigured
@EnableLoadTimeWeaving
public class AspectJConfig {}
