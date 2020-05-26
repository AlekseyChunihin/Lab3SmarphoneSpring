package config;

import entity.Smartphone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"service", "dao"})
public class AppConfig {
    @Bean(name = "iphone1")
    public Smartphone getRecipe() {
        return new Smartphone("iphone","Smartphone1",10,2500,8,"M64x","Android 4");

    }
}
