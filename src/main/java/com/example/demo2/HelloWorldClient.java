package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class HelloWorldClient {
  @Autowired
  private HelloWorldService service;

  public void sayHello()  {
    service.sayHello();
  }
}
