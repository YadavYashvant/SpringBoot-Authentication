package com.yadavyashvant.springbootauthentication.Controllers;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HomeController {

    Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/test")
    public String test() {
        this.logger.info("Test is working!!");
        return "Testing message";
    }

}
