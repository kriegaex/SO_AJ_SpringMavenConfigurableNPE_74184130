package com.example.demo2;

import de.invesdwin.instrument.DynamicInstrumentationLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Demo2Application {

  // Optional, if you want to use invesdwin-instrument instead of specifying '-javaagent' CLI parameters
  static {
    DynamicInstrumentationLoader.waitForInitialized(); //dynamically attach java agent to jvm if not already present
    DynamicInstrumentationLoader.initLoadTimeWeavingContext(); //weave all classes before they are loaded as beans
  }

  public static void main(String[] args) {
    SpringApplication.run(Demo2Application.class, args);
    // Avoid @PostConstruct in order to successfully run the application with @Configurable POJOs
    HelloWorldClient client = new HelloWorldClient();
    client.sayHello();
  }

}
