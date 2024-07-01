package zerobase.weather.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SwaggerConfig {
    // Spring Boot 3 버전부터는 Springfox 대신 Springdoc OpenAPI를 사용해야함
    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title("날씨 일기 프로젝트 ")
                        .version("2.0")
                        .description("날씨일기를 CRUD 할 수 있는 백엔드 API 입니다"));

    }
}