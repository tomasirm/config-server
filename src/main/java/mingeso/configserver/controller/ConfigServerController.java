package mingeso.configserver.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ConfigServerController {
    @RequestMapping("/")
    String gethelloWorld() {
        return "Hello World!";
    }

}