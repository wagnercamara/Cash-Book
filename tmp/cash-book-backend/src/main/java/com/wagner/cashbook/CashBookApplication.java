package com.wagner.cashbook;

import java.io.Serializable;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CashBookApplication implements Serializable {

	private final String applicationName;
	private final classTeste teste;
	private JSONObject my_obj = new JSONObject();

	@UserCommon
	private UserLoggerApplication userLoggerApplication;

	@Bean(name="exec")
	public CommandLineRunner exec(){
		return args -> {
			this.userLoggerApplication.loggerApplication();
		};
	}

	public CashBookApplication(
			@Value("${spring.application.name}") String applicationName,
			@Qualifier("teste") classTeste teste
			) {
		this.applicationName = applicationName;
		this.teste = teste;
	}

	@GetMapping("/home")
	public JSONObject home() {
		
		my_obj.put("applicationName",applicationName);
		my_obj.put("nome",teste.getNome());
		my_obj.put("idade",teste.getIdade());

		return my_obj;
	}

	public static void main(String[] args) {
		SpringApplication.run(CashBookApplication.class, args);
	}

}
