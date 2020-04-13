package com.poli.webapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.poli.webapi.**.mapper"})
public class WebapiApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebapiApplication.class, args);
  }

}
