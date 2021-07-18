package com.ringggr.demoitnan;

import com.ringggr.demoitnan.entity.User;
import com.ringggr.demoitnan.selector.UserSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(UserSelector.class) // 直接注入该类中定义的多个对象
public class DemoitnanApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoitnanApplication.class, args);
    }


//    @Bean
//    public User user() {
//        return new User("xixihaha", 24);
//    }

}
