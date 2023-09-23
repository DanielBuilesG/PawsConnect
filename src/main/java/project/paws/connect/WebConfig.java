package project.paws.connect;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/front/**")  // Ruta URL para acceder a los recursos
                .addResourceLocations("classpath:/front/");  // Ruta en el sistema de archivos donde se encuentran los recursos
    }
}
