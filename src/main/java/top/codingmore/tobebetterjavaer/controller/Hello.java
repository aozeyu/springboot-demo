package top.codingmore.tobebetterjavaer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: tobebetterjavaer
 * @description: 33
 * @packagename: top.codingmore.tobebetterjavaer.controller
 * @author: 姚泽宇
 * @date: 2022-06-15 23:27
 **/
@Controller
public class Hello {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello dev";
    }
}
