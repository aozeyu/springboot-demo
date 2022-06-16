package top.codingmore.tobebetterjavaer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: tobebetterjavaer
 * @description: 344
 * @packagename: top.codingmore.tobebetterjavaer.config
 * @author: 姚泽宇
 * @date: 2022-06-16 10:40
 **/
@RestController
@RequestMapping("/myinterceptor")
public class MyInterceptorController {
    @RequestMapping("/hello")
    public String hello() {
        return "沉默王二是傻X";
    }
}
