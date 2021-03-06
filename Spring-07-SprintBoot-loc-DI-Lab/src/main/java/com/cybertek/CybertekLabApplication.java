package com.cybertek;

import com.cybertek.calculator.Calculator;
import com.cybertek.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CybertekLabApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext container=SpringApplication.run(CybertekLabApplication.class, args);

		Calculator calcualtor = container.getBean("calculator", Calculator.class );

		System.out.println(calcualtor.getTotalCarpetCost(City.AUSTIN));


	}

}
