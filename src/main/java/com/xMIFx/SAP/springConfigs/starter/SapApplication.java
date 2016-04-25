package com.xMIFx.SAP.springConfigs.starter;

import com.xMIFx.SAP.springConfigs.MvcConfig;
import com.xMIFx.SAP.springConfigs.SpringSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Import({MvcConfig.class, SpringSecurityConfig.class})
@SpringBootApplication
public class SapApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SapApplication.class, args);
    }
}
