package io.github.fatec;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntroducaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(IntroducaoApplication.class, args);
    }
}
