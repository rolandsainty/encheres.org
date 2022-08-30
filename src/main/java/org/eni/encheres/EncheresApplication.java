package org.eni.encheres;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class EncheresApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncheresApplication.class, args);
	}
	
	
/**
 * méthode permettant configuration du contextpath a une incidence sur contexte bootstrap
 * //	@Bean
 */
//	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
//		return factory -> factory.setContextPath("/Encheres.org");
//	}
	
	@Bean
	public SessionLocaleResolver localeRsolver() {
		SessionLocaleResolver r = new SessionLocaleResolver();
		r.setDefaultLocale(Locale.FRANCE);
		return r;
	}
	
	
}
