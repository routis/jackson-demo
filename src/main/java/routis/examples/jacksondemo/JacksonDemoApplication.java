package routis.examples.jacksondemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JacksonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JacksonDemoApplication.class, args);
    }

}
