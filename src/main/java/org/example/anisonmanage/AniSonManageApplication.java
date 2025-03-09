package org.example.anisonmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class AniSonManageApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AniSonManageApplication.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String port = environment.getProperty("local.server.port");
        System.out.println("-------------------------");
        System.out.println("项目地址：localhost/"+port);
        System.out.println("-------------------------");
    }

}
