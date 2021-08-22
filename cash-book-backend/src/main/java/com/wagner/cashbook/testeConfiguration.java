package com.wagner.cashbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

//Configurações de ambiente como web,securit,bd

@Development
public class testeConfiguration {
    
    classTeste test = new classTeste();

    @Bean(name = "teste")
    public classTeste name() {

        test.setIdade("18");
        test.setNome("Wagner");

        return test;
    }

    @Bean
    public CommandLineRunner start(){
        return args -> {
          System.out.println("Start Application");
        };
    }
}
