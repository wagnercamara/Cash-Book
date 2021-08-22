package com.wagner.cashbook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean(name="admin")
    public UserLoggerApplication admin() {
        return new UserLoggerApplication() {
            @Override
            public void loggerApplication() {
                System.out.println("User administrator");
            }
        };
    }

    @Bean(name="common")
    public UserLoggerApplication common() {
        return new UserLoggerApplication() {
            @Override
            public void loggerApplication() {
                System.out.println("User common");
            }
        };
    }

}
