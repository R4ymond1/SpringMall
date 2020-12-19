package cn.gedc.springmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmallApplication.class, args);
    }

}
