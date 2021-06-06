package mybatis_plus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@SpringBootApplication
@ComponentScan("mybatis_plus.test_mybatis_plus")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
