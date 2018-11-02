package cn.dawnland.dawnland_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class DawnlandBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(DawnlandBackApplication.class, args);
    }
}
