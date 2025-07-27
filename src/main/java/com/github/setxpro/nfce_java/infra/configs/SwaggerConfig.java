package com.github.setxpro.nfce_java.infra.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("NFC-e Java API")
                        .description("API completa para integração com NFC-e (Nota Fiscal de Consumidor Eletrônica)")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Patrick Anjos")
                                .email("patrickpqdt87289@gmail.com")
                                .url("https://github.com/setxpro"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));
    }
}
