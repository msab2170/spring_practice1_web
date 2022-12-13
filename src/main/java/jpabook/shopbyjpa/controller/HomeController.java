package jpabook.shopbyjpa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j  // 로그를 찍게하는 어노테이션
public class HomeController {


    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "home";
    }
}
