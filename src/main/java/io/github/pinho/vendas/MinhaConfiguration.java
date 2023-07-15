package io.github.pinho.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    String applicationName() {
		return "Sistemas de Vendas";
	}
}
